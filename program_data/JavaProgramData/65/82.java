package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] c = new int[N][N];
		int a = 0;
		int b = 0;
		int i;
		int k;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < 2;k++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					c[i][k] = Integer.parseInt(tempVar2);
				}
			}
		}
		 for (i = 0;i < n;i++)
		 {
			 if ((c[i][0] == 0 && c[i][1] == 1) || (c[i][0] == 1 && c[i][1] == 2) || (c[i][0] == 2 && c[i][1] == 0))
			 {
				 a = a + 1;
			 }
			 else if ((c[i][1] == 0 && c[i][0] == 1) || (c[i][1] == 1 && c[i][0] == 2) || (c[i][1] == 2 && c[i][0] == 0))
			 {
				 b = b + 1;
			 }
			 else
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
		 if ((a = b) != 0)
		 {
			 System.out.print("Tie");
		 }
		  return 0;
	}
}

