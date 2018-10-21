package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char c;
		char[][] s = new char[210][100];
		int i = 0;
		int k;
		int u = 1;
		int n;
		for (;;)
		{
			if (u == 0)
			{
				break;
			}
			c = System.in.read();
			if (c == '\n')
			{
				break;
			}
			if (c == ' ' || c == ',')
			{
				continue;
			}
			k = 0;
			s[i][0] = c;
			for (;;)
			{
				c = System.in.read();
				if (c == ' ' || c == ',')
				{
					break;
				}
				if (c == '\n')
				{
					u = 0;
					break;
				}
				k++;
				s[i][k] = c;
			}
			s[i][k + 1] = '\0';
			i++;
		}
		n = i - 1;
		for (i = 1,k = 0;i <= n;i++)
		{
			if (String.valueOf(s[k]).length() < String.valueOf(s[i]).length())
			{
				k = i;
			}
		}
		System.out.printf("%s\n",s[k]);
		for (i = 1,k = 0;i <= n;i++)
		{
			if (String.valueOf(s[k]).length() > String.valueOf(s[i]).length())
			{
				k = i;
			}
		}
		System.out.printf("%s",s[k]);
	}

}
