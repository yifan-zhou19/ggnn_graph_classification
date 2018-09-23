package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[][] p = new int[1000][1000];
		int a = 0;
		int b = 0;
		int n;
		int i;
		int j;
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
					p[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
			   if (p[i][j] == 0)
			   {
				a++;
			   }
			}
			if (a != 0)
			{
				break;
			}
		}
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < n;i++)
			{
			  if (p[i][j] == 0)
			  {
				  b++;
			  }
			}
			if (b != 0)
			{
				break;
			}
		}
		int sum = 0;
		sum = (a - 2) * (b - 2);
		System.out.printf("%d",sum);
	}
}

