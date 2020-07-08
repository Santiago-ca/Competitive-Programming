#include<bits/stdc++.h>

using namespace std;

int n,m;

bool isOk(int i, int j){
    return i>=0 && j>=0 && i<n && j<m;
}

void bfs(int i, int j, vector<string> &matriz, int &sitios){
    int dx[8]={0,1,0,-1},dy[8]={1,0,-1,0};
    queue<pair<int,int>> q;
    q.push(make_pair(i,j));
    matriz[i][j]='2';
    while(!q.empty()){
        pair<int,int> node=q.front();
        q.pop();
        sitios++;
        i=node.first;
        j=node.second;
        for(int k=0;k<4;k++){
            int ai=i+dx[k],aj=j+dy[k];
            if(!isOk(ai,aj)) continue;
            if(matriz[ai][aj]!='.') continue;
            q.push(make_pair(ai,aj));
            matriz[ai][aj]='2';
        }
    }
}

int main(){
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int c;
    cin>>c;
    for(int aux=1;aux<=c;aux++){
        cin>>m>>n;
        bool posF=false;
        vector<string> matriz(n);
        int sitios=0,ai,aj;
        for(int i=0;i<n;i++){
            cin>>matriz[i];
            for(int j=0;j<m;j++){
                if(posF) break;
                if(matriz[i][j]=='@'){
                    ai=i;
                    aj=j;
                    posF=true;
                    break;
                }
            }
        }
        bfs(ai,aj,matriz,sitios);
        cout<<"Case "<<aux<<": "<<sitios<<"\n";

    }
}
