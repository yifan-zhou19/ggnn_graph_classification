package <missing>;

public class GlobalMembers
{
		public static int su(int a)
		{
			int i;
			int b;
		   b = (int)Math.sqrt(a);
		   for (i = 2;i <= b;i++)
		   {
			   if (a % i == 0)
			   {
			   return 0;
			   }
		   }
		   return 1;

		}

	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i += 2)
		{
			for (j = 2;j <= i / 2;j++)
			{
				if (su(j) == 1 && su(i - j) == 1)
				{
					System.out.printf("%d=%d+%d\n",i,j,i - j);
					break;
				}
			}
		}
		return 0;
	}


}

