package <missing>;

public class GlobalMembers
{
	public static int[][] k = new int[10000][10000];
	public static int n;
	public static int a;
	public static int b;
	public static int c;
	public static int i;
	public static int j;
	public static int ans;

	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (true)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (a == 0 && b == 0)
			{
				break;
			}
			else
			{
				k[a][b] = 1;
			}
		}
		c = 0;
		for (i = 1;i < n;i++)
		{
			if (k[c][i] == 1)
			{
				c = i;
			}
		}
		for (i = 0;i < n;i++)
		{
		  if (i != c)
		  {
			  if (k[i][c] == 1 && k[c][i] == 0)
			  {
				  continue;
			  }
			  else
			  {
				  break;
			  }
		  }
		}
		if (i == n)
		{
			System.out.printf("%d\n",c);
		}
		else
		{
			System.out.print("NOT FOUND\n");
		}
	}
}

