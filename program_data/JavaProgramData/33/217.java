package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		char[][] an = new char[1000][1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   an[i] = tempVar2.charAt(0);
		   }
			for (j = 0;an[i][j] != 0;j++)
			{
				if (an[i][j] == 'A')
				{
				   System.out.print("T");
				}
			   else if (an[i][j] == 'T')
			   {
				   System.out.print("A");
			   }
			   else if (an[i][j] == 'C')
			   {
				   System.out.print("G");
			   }
			   else if (an[i][j] == 'G')
			   {
				   System.out.print("C");
			   }
			}
			System.out.print("\n");
		}
		return 0;
	}

}

