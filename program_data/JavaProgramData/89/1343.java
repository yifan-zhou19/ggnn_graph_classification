package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int k;
		int[][] c = new int[2][n];
		int l;
		i = 1;
		j = 1;
		l = 1;
		for (k = 0;k < n;k++)
		{
					   c[0][k] = 0;
					   c[1][k] = 0;
		}
		for (;;)
		{
					 String tempVar2 = ConsoleInput.scanfRead();
					 if (tempVar2 != null)
					 {
						 i = Integer.parseInt(tempVar2);
					 }
					 String tempVar3 = ConsoleInput.scanfRead(" ");
					 if (tempVar3 != null)
					 {
						 j = Integer.parseInt(tempVar3);
					 }
					 if ((i + j) == 0)
					 {
					 break;
					 }
					 c[0][i]++;
					 c[1][j]++;
		}
		for (k = 0;k < n;k++)
		{

						if (c[0][k] == 0 && c[1][k] == n - 1)
						{
													System.out.printf("%d\n",k);
													l++;
						}
		}
		if (l == 0)
		{
		System.out.print("NOT FOUND");
		}
	}
}

