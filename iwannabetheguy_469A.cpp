#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    int p=0;
    cin >> n;
    cin >> p;
    int arr1[p];
    int flag = 0;
    for (int i = 0; i < p; i++)
    {
        cin >> arr1[i];
    }
    int q;
    cin >> q;
    int arr2[q];
    for (int i = 0; i < q; i++)
    {
        cin >> arr2[i];
    }
    for (int i = 1; i <= n; i++)
    {
        for (int j = 0; j < p; j++)
        {
            if (arr1[j] == i)
            {
                flag = 1;
                break;
            }
            else
            {
                flag = 0;
            }
        }
        if (flag == 0)
        {
            for (int j = 0; j < q; j++)
            {
                if (arr2[j] == i)
                {
                    flag = 1;
                    break;
                }
                else
                {
                    flag = 0;
                }
            }
        }
        if (flag == 0)
        {
            break;
        }
    }
    if (flag == 1)
    {
        cout << "I become the guy." << endl;
    }
    else
    {
        cout << "Oh, my keyboard!" << endl;
    }
    return 0;
}