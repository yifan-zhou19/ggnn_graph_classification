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
		for (int i = 1;i <= n;i++)
		{
			int m;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			int[] t = new int[m];
			if (m == 0)
			{
				   System.out.printf("%d\n",60);
			   continue;
			}
			for (int j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					t[j] = Integer.parseInt(tempVar3);
				}
			}
			if (3 * m + t[m - 1] <= 60)
			{
				   System.out.printf("%d\n",60 - 3 * m);
			}
				else
				{
				   if (3 * (m - 1) + t[m - 1] <= 60)
				   {
					  System.out.printf("%d\n",t[m - 1]);
				   }
				   else
				   {
					  if (3 * m + t[m - 2] <= 60)
					  {
						System.out.printf("%d\n",60 - 3 * (m - 1));
					  }
					  else
					  {
						if (3 * (m - 2) + t[m - 2] <= 60)
						{
						   System.out.printf("%d\n",t[m - 2]);
						}
						else
						{
						   System.out.printf("%d\n",60 - 3 * (m - 2));
						}
					  }
				   }
				}
		}
		return (0);
	}
}

