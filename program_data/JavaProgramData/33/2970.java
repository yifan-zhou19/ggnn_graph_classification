package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		char[][] t = new char[1000][300];
		for (i = 0;i < n;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   t[i] = tempVar2.charAt(0);
		   }
		}
		for (i = 0;i < n;i++)
		{
			int l = 0;
			l = String.valueOf(t[i]).length();
			int j;
			for (j = 0;j < l;j++)
			{
				if (t[i][j] == 'A')
				{
					System.out.print("T");
				}
				if (t[i][j] == 'T')
				{
					System.out.print("A");
				}
				if (t[i][j] == 'C')
				{
					System.out.print("G");
				}
				if (t[i][j] == 'G')
				{
					System.out.print("C");
				}
			}
			System.out.print("\n");
		}


	 return 0;
	}
}

