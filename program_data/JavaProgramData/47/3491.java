package <missing>;

public class GlobalMembers
{
	public static int read()
	{
		int i;
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		return 0;
	}
	public static void updown()
	{
		int i;
		for (i = 1;i <= n;i++)
		{
			b[i] = a[n - i + 1];
		}
		return;
	}
	public static void print()
	{
		int i;
		for (i = 1;i < n;i++)
		{
			System.out.printf("%d ",b[i]);
		}
		System.out.printf("%d",b[n]);
		return;
	}
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int n;
	public static int Main()
	{
		read();
		updown();
		print();
		return 0;
	}


}

