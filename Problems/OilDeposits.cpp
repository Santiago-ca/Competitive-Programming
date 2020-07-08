#include<bits/stdc++.h>

using namespace std;

int n,m;

bool isOk(int i, int j){
    return i>=0 && j>=0 && i<n && j<m;
}

void bfs(int i, int j, vector<string> &matriz, int &totOil){
    int dx[8]={0,1,1,1,0,-1,-1,-1},dy[8]={-1,-1,0,1,1,1,0,-1};
    queue<pair<int,int>> q;
    q.push(make_pair(i,j));
    bool isPO=false;
    if(matriz[i][j]=='@') isPO=true;
    matriz[i][j]='2';
    while(!q.empty()){
        pair<int,int> node= q.front();
        q.pop();
        i=node.first;
        j=node.second;
        for(int k=0;k<8;k++){
            int x=i+dx[k],y=j+dy[k];
            if(!isOk(x,y)) continue;
            if(matriz[x][y]!='@') continue;
            q.push(make_pair(x,y));
            matriz[x][y]='2';
        }
    }
    totOil+=isPO?1:0;
}

int main(){
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    while(cin>>n>>m){
        if(n==0) break;
        int totP=0;
        vector<string> matriz(n);
        for(int i=0;i<n;i++) cin>>matriz[i];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matriz[i][j]=='@'){
                    bfs(i,j,matriz,totP);
                }
            }
        }
        cout<<totP<<"\n";
    }
}
