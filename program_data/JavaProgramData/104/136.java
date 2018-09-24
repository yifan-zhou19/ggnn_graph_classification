package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] x = new int[12];
		int[] y = new int[12];
		int i;
		int j;
		int k = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y[0] = Integer.parseInt(tempVar2);
		}
		for (i = 1;x[i - 1] != 0;i++)
		{
			x[i] = x[i - 1] / 2;
			if (x[i] == 0)
			{
				a = i;
			}
		}
			for (i = 1;y[i - 1] != 0;i++)
			{
			y[i] = y[i - 1] / 2;
			if (y[i] == 0)
			{
			 b = i;
			}
			}
		for (i = 0;i < a;i++)
		{
		  for (j = 0;j < b;j++)
		  {
			  if (x[i] == y[j])
			  {
				  k = i;
				  c = 1;
			  break;
			  }
		  }
		  if (c == 1)
		  {
			  break;
		  }
		}
		System.out.printf("%d",x[k]);
	}
}

