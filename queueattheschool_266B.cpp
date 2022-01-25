#include <bits/stdc++.h>
using namespace std;
int main()
{
    string s, res = "";
    int n, t;
    cin >> n >> t;
    cin >> s;
    for (int i = 0; i < t; i++)
    {
        res = "";
        for (int j = 0; j < s.length()-1 ; j++)
        {
            if (s[j] == 'B' && s[j + 1] == 'G')
            {
                res += s[j+1];
                res+=s[j];
                j++;
            }
            else
            {
                res += s[j];
                if(j==s.length()-2){
                    res+=s[j+1];
                }
            }
        }
        s = res;
    }
    cout << res << endl;
    return 0;
}