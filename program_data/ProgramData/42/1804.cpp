//*****************************************
//*???Oct 30, 2013 - ???????? **
//*?????? 1300012719               **
//*???2013.10.30                      **
//*****************************************
int main()
{
	int i, j, k, m, n;                //i,j?????,k???????,m????????????,n???????                                  
	int a[100000];                    //????,???????????m
	cin >> n;                   
	m = n;
	for (i = 0; i < n; i++)
		cin >> a[i];                  //??a[0]?a[n-1]?n?????????????k
	cin >> k;
	if (a[n - 1] == k)                //?????????????????,???????????k?????,??????????
	{                                 //????????,??????????x?k?????????k????(?k+1)?????n-k???,???????????
		a[n - 1] = k + 1;
		m = m - 1;
	}
	for (i = 0; i < n - 1; i++)
	{
		while (a[i] == k)             //??a[0]?a[n-2],???k,??????a[i],?a[i]?????????,??????????,??a[i]???k
		{
			for (j = i; j < n - 1; j++)
				a[j] = a[j + 1];
			m = m - 1;
		}
	}
	for (i = 0; i < m; i++)           //????????m????,??????
	{
		cout << a[i];
		if (i == m - 1)               //????a[m-1]?????,??????
			cout << endl;
		else
			cout << " ";
	}
	return 0;
}
