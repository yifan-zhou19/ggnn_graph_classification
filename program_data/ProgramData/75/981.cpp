//********************
//**????????**
//**?????      **
//**???2013.10.31**
//????5.cpp		**
//********************
int main()
{
	int x[1000], y[1000], cnt[1001], num = 0, max, i;
	char ch;
	for (i = 0; ; i++)
	{
		cin >> x[i]; // ??x[i]
		num++; // ???????1
		ch = cin.get(); // ????????ch
		if (ch != ',') // ??????????????
			break;
	}
	for (i = 0; ; i++)
	{
		cin >> y[i]; // ??y[i]
		ch = cin.get(); // ????????ch
		if (ch != ',') // ??????????????
			break;
	}
	for (i = 1; i <= 1000; i++)
	{
		cnt[i] = 0; // ????????????0
		for (int j = 0; j <= num - 1; j++)
		{
			if (i >= x[j] && i < y[j]) // ??i?????j????	
				cnt[i]++; // ?i?????????1
		}
	}
	max = cnt[1]; // ?cnt[1]??????????
	for (i = 1; i <= 1000; i++)
	{
		if (max < cnt[i]) // ??max??cnt[i]
			max = cnt[i]; // ?cnt[i]????max
	}
	cout << num << ' ' << max << endl; // ???????????????
	return 0;
}