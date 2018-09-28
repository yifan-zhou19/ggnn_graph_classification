package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] sz = new int[100][2];
		int i;
		int s = 0;
		int j;
		int a = 0;
		int p = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   (sz[i][j]) = Integer.parseInt(tempVar2);
			   }
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((sz[i][0] <= 140) && (sz[i][0] >= 90) && (sz[i][1] >= 60) && (sz[i][1] <= 90))
			{
				a += 1;
				s += 1;
				if (p < s)
				{
				   p = s;
				   s = s;
				   a = a;
				}
				else
				{
					p = p;
					s = s;
					a = a;
				}
			}
			else
			{
				if (p < s)
				{
				   p = s;
				   s = 0;
				   a = 0;
				}
				else
				{
					p = p;
					s = 0;
					a = 0;
				}
			}
		}
		System.out.printf("%d",p);
		return 0;
	}
}

