package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int b;
		int[] a = new int[500];
		int i = 0;
		int c = 0;
		int[] d = new int[500];
		int e;
		int f = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Integer.parseInt(tempVar);
		}
		for (i = 0;i < b;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[i] = Integer.parseInt(tempVar2);
		   }
		}

		for (i = 0;i < b;i++)
		{
			if (a[i] % 2 != 0)
			{
				d[c] = a[i];
				c++;
			}
		}
		for (f = c;f > 1;f--)
		{
			for (i = 0;i < f - 1;i++)
			{
				if (d[i] > d[i + 1])
				{
					e = d[i + 1];
					d[i + 1] = d[i];
					d[i] = e;
				}
			}

		}
		for (i = 0;i < c;i++)
		{
			if (i == c - 1)
			{
				System.out.printf("%d",d[i]);
			}
			else
			{
				System.out.printf("%d,",d[i]);
			}
		}
	}


}

