package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		int i;
		int n;
		int h;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
			 for (i = 0;i < 100;i++)
			 {
					 a[i] = 0;
				 b[i] = 0;
				 c[i] = 0;
			 }
		for (i = 0,c[-1] = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
		{
			c[i] = c[i - 1] + 1;
		}
		else
		{
			c[i] = c[i - 1] * 0;
		}
		}
		for (e = 0;e < n;e++)
		{
			for (i = 0;i < n - e;i++)
			{
				if (c[i] < c[i + 1])
				{
					h = c[i];
				 c[i] = c[i + 1];
				 c[i + 1] = h;
				}
			}
		}
		System.out.printf("%d\n",c[0]);
	}


}

