package <missing>;

public class GlobalMembers
{
	public static void bo(String c)
	{
		int i;
		int j;
		int k;
		char[][] d = new char[100][100];
		for (j = 0;j < 100;j++)
		{
			for (i = 0;i < 100;i++)
			{
				d[j][i] = '\0';
			}
		}
		for (i = 0,j = 0,k = 0; !c[k].equals('\0');k++)
		{
			if (!c[k].equals(' '))
			{
				d[i][j] = c[k];
				j++;
			}
			if (c[k].equals(' '))
			{
				if (i != 0)
				{
					d[i][j] = ' ';
				}
				i++;
				j = 0;
			}
		}
		if (i != 0)
		{
		System.out.printf("%s ",d[i]);
		for (i = i - 1;i >= 0;i--)
		{
			System.out.printf("%s",d[i]);
		}
		}
		else
		{
		System.out.println(c);
		}
	}
	public static int Main()
	{
		String c = new String(new char[100]);
		char[][] d = new char[100][100];
		int i;
		int j;
		int m;
		int l;
		c = new Scanner(System.in).nextLine();
		bo(c);
	}


}
