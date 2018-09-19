package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] str = new char[30][10];
		char[][] substr = new char[30][3];
		char[][] ans = new char[30][13];
		char max;
		String a;
		String b;
		String c;
		String d;
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		for (i = 0;i < 30;i++)
		{
			if (scanf("%s%s",str[i],substr[i]) == EOF)
			{
				break;
			}
			l = String.valueOf(str[i]).length();
			max = str[i][0];
			for (j = 1;j < l;j++)
			{
				if (max < str[i][j])
				{
					max = str[i][j];
				}
			}
			for (j = 0;j < l;j++)
			{
				if (max == str[i][j])
				{
					break;
				}
			}
			a = str[i][0];
			b = substr[i][0];
			c = str[i][j + 1];
			for (k = 0;k < j + 1;k++)
			{
				ans[i][k] = (a.Substring(k));
			}
			for (m = 0;m < 3;k++,m++)
			{
				ans[i][k] = (m + b);
			}
			for (n = 0;j + 1 + n < l;n++,k++)
			{
				ans[i][k] = (c.Substring(n));
			}
			ans[i][k] = '\0';

		}
		for (j = 0;j < i;j++)
		{
			l = String.valueOf(ans[j]).length();
			for (k = 0;k < l - 1;k++)
			{
				d = ans[j];
				System.out.printf("%c",*(d.Substring(k)));
			}
			System.out.printf("%c\n",*(d.Substring(k)));
		}
	}
}
