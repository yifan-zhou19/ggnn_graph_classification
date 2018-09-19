package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] sz = new int[10][10];
		int a;
		int b;
		int c;
		int d;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
						 for (j = 0;j < n;j++)
						 {
										  String tempVar2 = ConsoleInput.scanfRead();
										  if (tempVar2 != null)
										  {
											  sz[i][j] = Integer.parseInt(tempVar2);
										  }
						 }
		}
		for (i = 0;i < n;i++)
		{
						 for (j = 0;j < n;j++)
						 {
										  if (sz[i][j] == 0)
										  {
														  a = i;
														  b = j;
														  break;
										  }
						 }
		}
		for (i = n - 1;i >= 0;i--)
		{
						 for (j = n - 1;j >= 0;j--)
						 {
										  if (sz[i][j] == 0)
										  {
														  c = i;
														  d = j;
														  break;
										  }
						 }
		}

		s = (d - b - 1) * (a - c - 1);
		if (s <= 0)
		{
		System.out.print("0");
		}
		else
		{
		System.out.printf("%d",s);
		}

		return 0;
	}





}

