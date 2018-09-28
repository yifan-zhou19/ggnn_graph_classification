package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int i;
		int j;
		int x = 1;
		int y = 1;
		int z = 0;
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			x = 1;
			y = 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			if (a == 1 || a == 2)
			{
				b[i] = 1;
			}
			else
			{
			  for (j = 0;j < a - 2;j++)
			  {
				 z = x + y;
				 x = y;
				 y = z;
				 b[i] = z;
			  }
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",b[i]);
		}

		return 0;
	}


}

