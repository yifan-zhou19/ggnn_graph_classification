package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] sz = new int[200][2];
		int i;
		int j;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = 0;
		b = 0;
		for (i = 0;i < n;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   sz[i][1] = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   sz[i][2] = Integer.parseInt(tempVar3);
		   }
		   if (sz[i][1] == 0 && sz[i][2] == 1)
		   {
				   a++;
		   }
		   if (sz[i][1] == 0 && sz[i][2] == 2)
		   {
				 b++;
		   }
		   if (sz[i][1] == 1 && sz[i][2] == 0)
		   {
				   b++;
		   }
		   if (sz[i][1] == 1 && sz[i][2] == 2)
		   {
				 a++;
		   }
		   if (sz[i][1] == 2 && sz[i][2] == 0)
		   {
				   a++;
		   }
		   if (sz[i][1] == 2 && sz[i][2] == 1)
		   {
				 b++;
		   }
		   if (sz[i][1] == sz[i][2])
		   {
				continue;
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
		else
		{
			System.out.print("Tie");
		}
		return 0;
	}
}

