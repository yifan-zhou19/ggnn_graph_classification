String str = new String(new char[10]);
String substr = new String(new char[3]);
String a = new String(new char[13]);
void F(int);
void main()
{
	int k;
	int b;
	while (scanf("%s%s",str,substr) != EOF)
	{
		k = str.length();
		F(k);
		for (b = 0;b <= k + 2;b++)
		{
		System.out.printf("%c",a.charAt(b));
		}
		System.out.print("\n");
	}
}
void F(int k)
{
	int t;
	int i;
	int j;
	int e = 0;
	int f;
	for (i = 0;i < k;i++)
	{
		f = 0;
	for (j = i + 1;j < k;j++)
	{
		if (str.charAt(i) < str.charAt(j))
		{
			f++;
		}
	}
	if (f == 0)
	{
		t = i;
		break;
	}
	}
	for (i = 0;i <= t;i++)
	{
		a = tangible.StringFunctions.changeCharacter(a, i, str.charAt(i));
	}
	for (j = t + 4;j <= k + 2;j++)
	{
		a = tangible.StringFunctions.changeCharacter(a, j, str.charAt(j - 3));
	}
	for (i = t + 1;i <= t + 3;i++)
	{
		a = tangible.StringFunctions.changeCharacter(a, i, substr.charAt(e));
		e++;
	}
}

