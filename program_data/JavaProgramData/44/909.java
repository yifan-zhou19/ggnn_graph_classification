package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int f = char str[10];
		char[][] string = new char[6][10];
		int i;
		for (i = 0;i < 6;i++)
		{
			String[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",f(String[i]));
		}
	}
	public static int f(String str)
	{
		int j;
		int m;
		int e;
		int k;
		int b;
		b = 0;
		m = 0;
		for (j = 0; !str[j].equals('\0');j++)
		{
			b = j;
		}


		if (str[0].equals('-'))
		{

			  for (j = b;j > 0;j--)
			  {
				e = 1;
				for (k = 1;k < j;k++)
				{
					e = e * 10;
				}
				m = m + (str[j] - 48) * e;
			  }

			if (m == 0)
			{
				return (0);
			}
			else
			{
				return (-m);
			}
		}

		else
		{

			for (j = b;j >= 0;j--)
			{
				e = 1;
				for (k = 0;k < j;k++)
				{
					e = e * 10;
				}
				m = m + (str[j] - 48) * e;
			}
		  return (m);

		}


	}

}
