#include<bits/stdc++.h>

using namespace std;

int const n=8,m=8;
vector<vector<int>>mov(n,vector<int>(m));

void reload(){
    vector<int> aux(m,-1);
    mov.clear();
    mov.resize(n,aux);

    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            cout<<mov[i][j]<<" ";
        }
        cout<<"\n";
    }
    cout<<"\n";
}

bool isOk(int x, int y){
    return x>=0 && y>=0 && x<n &&  y<n;
}

void bfs(int sx,int sy, int fx, int fy){
    int dx[8] = {-2,-1,1,2,2,1,-1,-2}, dy[8] ={-1,-2,-2,-1,1,2,2,1};
    queue<pair<int,int>> q;
    q.push(make_pair(sx,sy));
    mov[sx][sy]=0;
    while(!q.empty()){
        pair<int,int> pos = q.front();
        q.pop();
        int i=pos.first,j=pos.second;
        for(int k=0;k<8;k++){
            int x=i+dx[k],y=j+dy[k];
            if(!isOk(x,y)) continue;
            if(mov[x][y]!=-1)continue;
            q.push(make_pair(x,y));
            mov[x][y]=mov[i][j]+1;
            if(x==fx && y==fy) return;
        }

    }

}

int main(){
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int c;
    cin>>c;
    while(c--){
        string ax, ay;
        cin>>ax>>ay;
        reload();
        int sx=ax[0]-'a',sy=ax[1]-'1',fx=ay[0]-'a',fy=ay[1]-'1';
        bfs(sx,sy,fx,fy);
        cout<<mov[fx][fy]<<"\n";
    }
}
