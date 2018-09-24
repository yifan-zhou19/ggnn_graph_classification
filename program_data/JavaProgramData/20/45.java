package <missing>;

public class GlobalMembers
{
	public static void insert(String st1, String st2)
	{
		int i;
		int m;
		int n;
		char max;
		m = st1.length();
		max = st1[0];
		n = m - 1;


		for (i = 0;i < m;i++)
		{
			if (st1[i].compareTo(max) > 0)
			{
				max = st1[i];
				n = i;
			}
		}

		for (i = 0;i <= n;i++)
		{
			System.out.printf("%c",st1[i]);
		}
		for (i = 0;i < 3;i++)
		{
		System.out.printf("%c",st2[i]);
		}
		for (i = n + 1;i < m;i++)
		{
			System.out.printf("%c",st1[i]);
		}
		System.out.print("\n");
	}
	public static void Main()
	{
		char[][] st1 = new char[50][10];
		char[][] st2 = new char[50][4];
		int i;
		int j;
		int k;
		char p;
		while ((st1[i][0] = System.in.read()) != EOF)
		{
			for (j = 1;;j++)
			{
				if ((p = System.in.read()) != ' ')
				{
					st1[i][j] = p;
				}
				else
				{
					st1[i][j] = '\0';
					 break;
				}
			}
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				st2[i] = tempVar.charAt(0);
			}
			i++;
			p = System.in.read();

		}
		k = i;
		for (i = 0;i < k;i++)
		{
			insert(st1[i], st2[i]);
		}
	}






}

