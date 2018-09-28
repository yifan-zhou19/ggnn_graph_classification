package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int a = 0;
		int b = 0;
		int[][] cs = new int[n][2];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead("\n");
			if (tempVar2 != null)
			{
				cs[i][1] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				cs[i][2] = Integer.parseInt(tempVar3);
			}
		}
		for (int i = 0;i < n;i++)
		{
			c = cs[i][1] - cs[i][2];
		if (c == -1 || c == 2)
		{
			a++;
		}
		else if (c == 1 || c == -2)
		{
			b++;
		}
		}
		if (a > b)
		{
			System.out.print("A");
		}
	   else if (a < b)
	   {
		   System.out.print("B");
	   }
		else if (a == b)
		{
			System.out.print("Tie");
		}
		return 0;
	}

}

