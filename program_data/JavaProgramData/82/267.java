package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t = 0;
		int i;
		int a;
		int b = 0;
		int c = 0;
		int[] x = new int[100];
		int[] y = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i - 1] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y[i - 1] = Integer.parseInt(tempVar3);
			}
			if (x[i - 1] >= 90 && x[i - 1] <= 140 && y[i - 1] >= 60 && y[i - 1] <= 90)
			{
			   a = i;
			  if (t == 0)
			  {
				t = 1;
				b = a;
			  }
			  if ((a - b) == 1)
			  {
			   t++;
			  }
			  else
			  {
				if (t > c)
				{
				c = t;
				}
				t = 1;
			  }
			}
			b = a;
		}
	 if (t > c)
	 {
				c = t;
	 }
		System.out.printf("%d",c);
		return 0;
	}

}

