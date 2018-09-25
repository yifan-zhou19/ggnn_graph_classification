package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int c;
		int k;

		c = k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		int[] b = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(a[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(b[i]) = Integer.parseInt(tempVar3);
			}
			if ((a[i] >= 90) && (a[i] <= 140) && (b[i] >= 60) && b[i] <= 90)
			{
				c++;
			}
			else
			{
			if (c > k)
			{
				k = c;

			}
			c = 0;
			}
		}
		if (c > k)
		{
			System.out.printf("%d",c);
		}
		else
		{
			System.out.printf("%d",k);
		}



		return 0;
	}

}

