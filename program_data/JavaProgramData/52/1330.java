package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int b;
		int c;
		int d;
		int e;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		for (d = 0;d < b;d++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[d] = Integer.parseInt(tempVar3);
			}
		}
		for (d = b - 1;d >= b - c;d--)
		{
			for (e = b - 1;e >= 1;e--)
			{
				f = a[e-1];
				a[e-1] = a[e];
				a[e] = f;
			}
		}
			for (d = 0;d < b - 1;d++)
			{
				System.out.printf("%d ",a[d]);
			}
			System.out.printf("%d",a[b - 1]);
	}


}

