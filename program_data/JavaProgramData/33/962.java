package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int l;
		int k;
		int j;
		String b = new String(new char[3]);
		char[][] c = new char[1000][1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		b = new Scanner(System.in).nextLine();
		for (i = 0;i < k;i++)
		{
			c[i] = new Scanner(System.in).nextLine();
			l = String.valueOf(c[i]).length();
			for (j = 0;j < l;j++)
			{
				if (c[i][j] == 'C')
				{
					System.out.print("G");
				}
				if (c[i][j] == 'A')
				{
					System.out.print("T");
				}
				if (c[i][j] == 'T')
				{
					System.out.print("A");
				}
				if (c[i][j] == 'G')
				{
					System.out.print("C");
				}
			}
			 System.out.print("\n");
		}
	}
}

