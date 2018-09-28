package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[5];
		int m;
		int n;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			f = Integer.parseInt(tempVar);
		}
		if (f > 9999)
		{
			n = 5;
		}
		else if (f > 999)
		{
			n = 4;
		}
		else if (f > 99)
		{
			n = 3;
		}
		else if (f > 9)
		{
			n = 2;
		}
		else
		{
			n = 1;
		}
		m = n;
		while (n > 0)
		{
			a[n] = f % 10;
			f = f / 10;
			n = n - 1;
		}
		n = m;
		while (n > 0)
		{
			System.out.printf("%d",a[n]);
			n = n - 1;
		}
		System.out.print("\n");
	}

}

