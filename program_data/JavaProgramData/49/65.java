// ???? ?? 1000062708
void t(char[], int);
int main()
{
	String a = new String(new char[500]);
	String b = new String(new char[500]);
	int i;
	int j;
	int k;
	int n;
	int m;
	a = ConsoleInput.readToWhiteSpace(true).charAt(0);
	n = a.length();
	for (i = 2;i <= n;i++)
	{
		for (j = 0;j <= n - i;j++)
		{
			m = 0;
			for (k = j;k < j + i;k++)
			{
				b = tangible.StringFunctions.changeCharacter(b, m++, a.charAt(k));
			}
			b = tangible.StringFunctions.changeCharacter(b, i, '\0');
			t(b,i);
		}
	}
		return 0;
}
void t(char b[], int m)
{
	int i;
	for (i = 0;i < m / 2;i++)
	{
		if (b[i] != b[m - i - 1])
		{
			break;
		}
	}
	if (i == m / 2)
	{
		System.out.print(b);
		System.out.print("\n");
	}
}


