//***********************************
//*???Nov 13, 2013 - ????? **
//*?????? 1300012719         **
//*???2013.11.16                **
//***********************************
int main()
{
	int a[101], b[101], n, i, j, t, lena, start;
	char cha[101], chb[101];               //a[],b[]???????????,cha,chb????a,b??????,n?????,t???????????,lena??????,start??????????0????
	cin >> n;                              //??????n???????
	cin.get();
	for (i = 1; i <= n; i++)
	{
	    cin.getline(cha,100);              //??????,??a?b?????,???a????a,b????
		cin.getline(chb,100);
		lena = strlen(cha);
		t = lena - strlen(chb);
		for (j = 0; j < lena; j++)         //??b??????a???,???a,b??lena??????????????,??b[]???????,??????
		{
			a[j] = cha[j] - '0';
			b[j] = chb[j] - '0';
		}
		for (j = lena - 1; j >= t; j--)    //????????b?a?????,?a??t+1???lena??b??????lena-t???????
		{
			a[j] = a[j] - b[j - t];        //a??j???b??j-t?,??b[]????????????
			if (a[j] < 0)                  //?????????????????????10
			{
				a[j] = a[j] + 10;
				a[j - 1]--;
			}
		}
		for (j = 0; j < 101; j++)
		{
			if (a[j])
			{
				start = j;                 //????????????????0???
				break;
			}
		}
		for (j = start; j < lena; j++)     //????????a??
			cout << a[j];
		cout << endl;
		cin.get();                         //???????
	}
	return 0;
}