package <missing>;

public class GlobalMembers
{
	/*
	 * ????1000012718_25.cpp
	 * ???????????
	 * ????: 2010-10-29
	 * ??: ??
	 */

	/*#include<iostream>    //?????
	 using namespace std;
	 //?????
	
	 int main() {
	 //??n??
	 int n, k, i, j, count = 0; //i, j, count?????
	 cin >> n;
	 if (n < 1 || n > 100000)
	 return 0;
	
	 //???????????
	 int num[n];
	
	 //?????n???
	 for (i = 0; i < n; i++) {
	 cin >> num[i];
	 }
	
	 //??????k
	 cin >> k;
	
	 //????????k??
	 for (i = 0; i < n; i++) {
	 while (num[i] == k) {
	
	 //??????????
	 for (j = i; j < n; j++) {
	 num[j] = num[j + 1];
	 }
	
	 count++; //count????k?????
	 }
	 }
	
	 //??????????
	 for (i = 0; i < n - count - 1; i++) {
	 cout << num[i] << " ";
	 }
	 cout << num[i];
	
	 return 0; //????
	 }*/

	public static int Main()
	{
		int n;
		int m;
		int k;
		int i = 0;
		int j;
		int temp;
		int[] a = new int[100000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i] = m;
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			if (a[i] == k)
			{
				for (j = i + 1; j < n; j++)
				{
					if (a[j] != k)
					{
						temp = a[j];
						a[j] = a[i];
						a[i] = temp;

						break;
					}
				}
			}
		}
		if (a[0] != k)
		{
			System.out.print(a[0]);
		}
		for (i = 1; i < n; i++)
		{
			if (a[i] != k)
			{
				System.out.print(' ');
				System.out.print(a[i]);
			}

		}
		return 0;
	}

}

