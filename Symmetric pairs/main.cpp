#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int arr[5][2];
    arr[0][0] = 8;
    arr[0][1] = 3;
    arr[1][0] = 3;
    arr[1][1] = 2;
    arr[2][0] = 3;
    arr[2][1] = 8;
    arr[3][0] = 2;
    arr[3][1] = 3;
    arr[4][0] = 8;
    arr[4][1] = 3;

  unordered_map < int, int >mp;
  for (int i = 0; i < 5; i++){
    int first = arr[i][0];
    int sec = arr[i][1];

    if (mp.find (sec) != mp.end () && mp[sec] == first)
	    cout << "(" << sec << ", " << first << ") ";
    else			
	mp[first] = sec;
  }
  return 0;
}
