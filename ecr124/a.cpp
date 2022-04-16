#include<bits/stdc++.h>
using namespace std;

int win(int a,int b){
    int x;
        if((a+b)%2==0){
            if(a>b){
                x = a;
            }else{
                x = b;
            }
        }else{
            if(a>b){
                x = b;
            }else{
                x = a;
            }
        }
        return x;
    }

int main(){
    int t,a;
    cin>>t;
    while (t--)
    {
        cin>>a;
        int b = pow(2,a);
        int y;
        for (int i = 1; i < b; i++)
        {   
            y = i;
            y = win(y,y+1);
        }
        cout<<y<<endl;
    }
    
}