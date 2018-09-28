package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] str = new int[5][5];
		int i;
		int j;
		int m;
		int n;
		int[] p = str;
		int k;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					p[i] + j = tempVar;
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		if (!(m >= 0 && m <= 4 && n >= 0 && n <= 4))
		{
			System.out.print("error\n");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
			   if (i == n)
			   {
				   k = m;
			   }
			   else if (i == m)
			   {
				   k = n;
			   }
			   else
			   {
				   k = i;
			   }
			   for (j = 0;j < 4;j++)
			   {
				   System.out.printf("%d ",*(p[k] + j));
			   }
			   System.out.printf("%d",*(p[k] + j));
			   System.out.print("\n");

			}
		}
		return 0;

	}

}

