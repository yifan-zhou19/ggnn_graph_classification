//********************************
//*????????   **
//*?????? 1300012934 **
//*???2013.10.31  **
//********************************


int main()
{  
	int x[1000], y[1000], t[1000] = {0}, n, number, tmax; //t????????
	char douhao;

	n = 1; //n??????????????????
	cin >> x[0];
	while ((douhao = cin.get()) != '\n')
	{
		cin >> x[n];
		n++;
	}
	cin >> y[0];
	for (int i=1; i <= n - 1; i++) //??y?y?x???????
	{
		cin >> douhao >> y[i];
	}
	for (int i=0; i <= n - 1; i++)
	{
		for (int j=x[i]; j < y[i]; j++) //?????????????
		{
			t[j]++;
		}
	}
	number = 0; //number????????????
	tmax = 0; //tmax?????????????????????????
	for (int i=0; i <= n - 1; i++)
	{
		if (tmax < y[i])
			tmax = y[i]; //?????????????????
	}
	for (int i=0; i <= tmax - 1; i++)
	{
		if (number < t[i])
			number = t[i];
	}
	cout << n << " " << number;


	return 0;

}
