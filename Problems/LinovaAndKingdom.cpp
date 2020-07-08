#include <bits/stdc++.h>

using namespace std;
int const MAX_N=200001;
vector<vector<int>> lst (MAX_N);
vector<int> prof (MAX_N);

int tf[MAX_N];
int ti[MAX_N];
int parent [MAX_N];

int n,k,t=0;

void dfs(int current){
    ti[current] = t++;
    for(int v : lst[current]){
        if(v != parent[current]){
            parent[v] = current;
            prof[v] = prof[current]+1;
            dfs(v);
        }
    }
    tf[current] = t++;
}

bool is_ok(int xi, int xf, int yi, int yf ){
    return xi>=yi && xf<=yf;

}

void calcH(vector<int> &h){
    for(int i=0;i<n;i++){
        h[i]=prof[i] - ((tf[i]-ti[i]-1)/2);
    //  cout<<"Hs:\n"<<h[i]<<"\n";
    }
}

int main(){
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    cin>>n>>k;
    for(int i=0; i<n-1;i++){
        int n1,n2;
        cin>>n1>>n2;
        lst[n1-1].push_back(n2-1);
        lst[n2-1].push_back(n1-1);
    }
    prof[0]=0;
    dfs(0);
    vector<int> h (n);
    calcH(h);
    long long tot=0;
    sort(h.rbegin(),h.rend());
    for(int i=0;i<k;i++){
        tot+=h[i];
    }
    cout<<tot<<"\n";
}


