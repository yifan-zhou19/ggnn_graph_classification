package <missing>;

public class GlobalMembers
{
	public static void minus(String a, String b)
	{
		char i; //experimental
		char t;
		char m = a.length();
		char jin = 0;
		for (i = 0;i <= m - 1;i++)
		{
			t = a[i] - b[i] - jin;
			if (t >= 0)
			{
				a[i] = t;
				jin = 0;
			}
			else
			{
				a[i] = t + 10;
				jin = 1;
			}
		}
	}
	public static void ni(String a)
	{
		char i;
		char t;
		char m = a.length();
		for (i = 0;i < m / 2;i++)
		{
			t = a[i];
			a[i] = a[m - 1 - i];
			a[m - 1 - i] = t;
		}
	}
	public static void tranvert(char m, String a)
	{
			char i; //n=strlen(a)
			char j;
			for (i = m - 1;i >= 1;i--)
			{
				if (!a[i].equals(0))
				{
					break;
				}
			}
			for (j = i;j >= 0;j--)
			{
				a[j] += '0';
			}
	}
	public static void trans(char n, char m, String b)
	{
		char i;
		for (i = n;i <= m - 1;i++)
		{
		b[i] = '0';
		}
	}

	public static void Main()
	{
		char k;
		char i;
		char m;
		char n;
		char[][] a =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		char[][] b =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = tempVar.charAt(0);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = tempVar3.charAt(0);
			}
			m = String.valueOf(a[i]).length();
			n = String.valueOf(b[i]).length(); //the result at most has m bits
			ni(a[i]);
			ni(b[i]);
			trans(n, m, b[i]);
			minus(a[i], b[i]);
			tranvert(m, a[i]);
			ni(a[i]);
			System.out.print("\n");

		}
		for (i = 0;i < k;i++)
		{
			System.out.println(a[i]);
		}
	}
}

