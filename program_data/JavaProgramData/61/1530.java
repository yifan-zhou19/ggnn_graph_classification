package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[999];
		int[] b = new int[999];
		int[] c = new int[999];
		int i;
		int k;
		int n;
		int[] d = new int[999];
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				d[i] = Integer.parseInt(tempVar2);
			}
			a[i] = 1;
			b[i] = 1;
		}
		for (i = 0;i < n;i++)
		{
			if (d[i] >= 3)
			{
				for (k = 3;k <= d[i];k++)
				{
				c[i] = a[i] + b[i];
				a[i] = b[i];
				b[i] = c[i];
				}
			System.out.printf("%d\n",c[i]);
			}
			else
			{
				System.out.print("1");
			}
		}



		 return 0;
	}
}

