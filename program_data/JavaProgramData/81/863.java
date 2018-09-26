package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] s = new int[5][5];
		int tem;
		for (int i = 0;i < 5;i++)
		{
			for (int w = 0;w < 5;w++)
			{
			   String tempVar = ConsoleInput.scanfRead();
			   if (tempVar != null)
			   {
				   s[w][i] = Integer.parseInt(tempVar);
			   }
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (n < 5 && m < 5)
		{
			for (int p = 0;p < 5;p++)
			{
			  tem = s[p][n];
			  s[p][n] = s[p][m];
			  s[p][m] = tem;
			}
		for (int q = 0;q < 5;q++)
		{
			for (int x = 0;x < 5;x++)
			{
				if (x == 4)
				{
				   System.out.printf("%d",s[x][q]);
				}
				else
				{
					System.out.printf("%d ",s[x][q]);
				}
			}
			System.out.print("\n");
		}
		}
		else
		{
		   System.out.print("error");
		}
		return 0;
	}
}

