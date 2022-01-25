#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin>>n;
    double max = -1.00000000000;
    int arr[n];
    double sum = 0.00000000000;
    for (int i = 0; i < n; i++)
    {
        cin>>arr[i];
        if(arr[i]>max){
            max=arr[i];
        }
    }
    for (int i = 0; i < n; i++)
    {
        if(arr[i]!=0){

        sum  += max/arr[i];
        }
    }
    // std::cout << std::fixed;
    // std::cout << std::setprecision(2);
    string s = to_string(sum/n);
    string token = s.substr(s.find('.')+1,s.length());
// cout << fixed << setprecision(6) << pi << " " << npi
//          << endl;


    cout<< fixed << setprecision(6) <<token.substr(0,2)<<'.'<<token.substr(2,token.length())<<endl;
    return 0;
}