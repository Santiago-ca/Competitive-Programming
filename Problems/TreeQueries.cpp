#include<bits/stdc++.h>

using namespace std;

int const MAX_N=200001;
vector<vector<int>> lst (MAX_N);
int tf[MAX_N];
int ti[MAX_N];
int parent [MAX_N];

int n,k,t=0;

void dfs(int current){
    ti[current] = t++;
    for(int v : lst[current]){
        if(v != parent[current]){
            parent[v] = current;
            dfs(v);
        }
    }
    tf[current] = t++;
}

bool is_ok(int xi, int xf, int yi, int yf ){
    return xi>=yi && xf<=yf;

}

bool solve(vector<int> &q, int len){
    int node, max_ti;
    node = q[0];
    max_ti = ti[q[0]];
    for(int i=0;i<len;i++){
        if(max_ti<ti[q[i]]){
            max_ti=ti[q[i]];
            node = q[i];
        }
    }
    for(int i: q){
        if(!is_ok(ti[node],tf[node],ti[i],tf[i])){
            return false;
        }
    }
    return true;
}

int main(){
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    int m;
    cin>>n>>k;
    int ni,ui;
    for(int i=0; i<n-1; i++){
        cin>>ni>>ui;
        lst[ni-1].push_back(ui-1);
        lst[ui-1].push_back(ni-1);
    }
    dfs(0);
    for(int i=0; i<k; i++){
        int len;
        cin>>len;
        vector<int> q (len);
        for(int j=0;j<len;j++){
            cin>>q[j];
        }
        for(int j=0; j<len;j++){
            q[j]=parent[q[j]-1];
        }
        if(solve(q,len)){
            cout<<"YES\n";
        }else{
            cout<<"NO\n";
        }
    }

}
