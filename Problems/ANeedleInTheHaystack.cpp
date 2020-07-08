#include<bits/stdc++.h>

using namespace std;

vector<pair<long long, long long>> gen_hash(string s, int l){
    int n = s.size();
    long long p=31, mod=1000000009;
    vector<long long> p_pow(n);
    p_pow[0]=1;
    for(int i=1; i < n; i++){
        p_pow[i]=(p_pow[i-1]*p)%mod;
    }
    vector<long long> h (n+1,0);
    for(int i=0; i < n; i++){
        h[i+1]=(h[i] + (s[i] - 'a' + 1) * p_pow[i])%mod;
    }

    long long p1=53, mod1=1000000007;
    vector<long long> p_pow1(n);
    p_pow1[0]=1;
    for(int i=1; i < n; i++){
        p_pow1[i]=(p_pow1[i-1]*p1)%mod1;
    }
    vector<long long> h1 (n+1,0);
    for(int i=0; i < n; i++){
        h1[i+1]=(h1[i] + (s[i] - 'a' + 1)*p_pow1[i])%mod1;
    }


    vector<pair<long long, long long> >  hashes;
    for(int i=0; i <= n-l; i++){
        long long hi = (h[i+l] - h[i] + mod)%mod;
        hi = (hi * p_pow[n-i-1])%mod;
        long long hi1 = (h1[i+l] - h1[i] + mod1)%mod1;
        hi1 = (hi1 * p_pow1[n-i-1])%mod1;
        hashes.push_back({hi,hi1});
    }

    return hashes;
}

int main(){
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int n;
    while(cin>>n){
        string needle, haystack;
        cin>>needle>>haystack;
        vector<pair<long long, long long>> hashes = gen_hash((needle+haystack),n);
        pair<long long, long long> res = hashes[0];
        vector<int> sol;
        for(int i=n;i<hashes.size();i++){
            if(hashes[i].first == res.first && hashes[i].second == res.second ) sol.push_back(i-n);
        }
        if(sol.size()==0) cout<<"\n\n";
        else{
            for(int x: sol)cout<<x<<"\n";
        }
    }
}
