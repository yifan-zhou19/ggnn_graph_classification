package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[20];
		int i;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a[0] = 1;
		a[1] = 1;
		for (i = 2;i < 20;i++)
		{
						 a[i] = a[i - 1] + a[i - 2];
		}
		for (i = 0;i < n;i++)
		{
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							m = Integer.parseInt(tempVar2);
						}
						System.out.printf("%d\n",a[m - 1]);
		}
		System.in.read();
		System.in.read();
	}

}

