package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[10000];
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = Integer.parseInt(tempVar2);
			}
			a[1] = 1;
			a[2] = 1;
			for (int j = 3;j <= b;j++)
			{
			a[j] = a[j - 1] + a[j - 2];
			}
			System.out.printf("%d\n",a[b]);
		}
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
	}

}

