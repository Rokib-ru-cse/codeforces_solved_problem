#include <bits/stdc++.h>
using namespace std;
int main()
{
    long long arr[4];
    long long max=0;
    for (int i = 0; i < 4; i++)
    {
        cin>>arr[i];
        if(arr[i]>max){
            max=arr[i];
        }
    }
    int count = 0;
    long long arr2[max]={0};
    
    for (int i = 0; i < 4; i++)
    {
        arr2[arr[i]-1]++; 
    }
    
    for (int i = 0; i < max; i++)
    {
        if(arr2[i]>1){
            count +=arr2[i]-1;
        }
    }
    cout<<count<<endl;
        return 0;
}