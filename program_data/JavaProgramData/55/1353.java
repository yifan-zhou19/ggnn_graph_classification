int zhsh = new int(int, int, int, char[], int, int, int); //???????
int main()
{
	String s = new String(new char[100]);
	String u = new String(new char[100]);
	int a;
	int b;
	int l;
	int k = 0;
	int i = 0;
	int j = 0;
	int r;
	int l1;
	a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	s = ConsoleInput.readToWhiteSpace(true).charAt(0);
	b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	l = s.length();
	int sum = 1;
	zhsh(i, j, l, s, k, sum, a); //?????????????????
	if (zhsh(i, j, l, s, k, sum, a) == 0) //??0??????????
	{
		System.out.print("0");
		System.out.print("\n");
	}
	else
	{
		k = zhsh(i, j, l, s, k, sum, a);
		for (j = 0; k != 0; j++) //????0?
		{
			r = k % b;
			if (r >= 10) //??????????
			{
				u = tangible.StringFunctions.changeCharacter(u, j, r - 10 + 'A');
			}
			else
			{
				u = tangible.StringFunctions.changeCharacter(u, j, r + '0');
			}
			k = k / b;
		}
		u = tangible.StringFunctions.changeCharacter(u, j, '\0'); //????????????
		l1 = u.length();
		for (j = l1 - 1; j >= 0; j--)
		{
			System.out.print(u.charAt(j));
		}
		System.out.print("\n");
	}
	return 0;
}
int zhsh(int i,int j,int l,char s[],int k,int sum,int a) //???????
{
	for (i = 0, j = l - 1; j >= 0; i++, j--)
	{
		if (s[j] >= 65)
		{
			if (s[j] >= 97)
			{
				k = k + (s[j] - 87) * sum;
			}
			else
			{
				k = k + (s[j] - 55) * sum;
			}
		}
		else
		{
			k = k + (s[j] - 48) * sum;
		}
			sum = sum * a;
	}
	return k;
}





