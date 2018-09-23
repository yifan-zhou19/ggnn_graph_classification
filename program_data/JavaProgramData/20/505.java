package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int max;
		int m;
		int j = 0;
		int k;
		String a = new String(new char[111]);
		String b = new String(new char[4]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		char[][] c = new char[11111][111];
		while (scanf("%s %s",a,b) != EOF)
		{
		n = a.length();
		p = a;
		max = a.charAt(0);
		for (i = 1;i < n;i++)
		{
			if (a.charAt(i) > max)
			{
				max = a.charAt(i);
				m = i;
			}
		}
		for (i = n + 3;i < (n + n - m + 2);i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i + m - n - 2));
		}
		for (p = (a.Substring(m) + 1);p < (a.Substring(m) + 4);p++)
		{
			*p = b.charAt(p - a - m - 1);
		}
		for (p = (a.Substring(m) + 4);p < (a.Substring(n) + 3);p++)
		{
			*p = a.charAt(p - a - m + n - 1);
		}
		for (i = 0;i < n + 3;i++)
		{
			c[j][i] = a.charAt(i);
		}
			c[j][n + 3] = 0;
		j = j + 1;
		k = j;
		}
		for (j = 0;j < k;j++)
		{
			System.out.printf("%s\n",c[j]);
		}
	}
}

