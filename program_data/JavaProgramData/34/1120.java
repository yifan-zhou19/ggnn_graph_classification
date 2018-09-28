package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a[0] = n;
		if (n == 1)
		{
			System.out.print("End");
		}
		else
		{
		for (i = 1;i <= 100000;i++)
		{
		if (a[i - 1] % 2 != 0)
		{
			a[i] = a[i - 1] * 3 + 1;
			System.out.printf("%d*3+1=%d\n",a[i - 1],a[i]);
		}
		if (a[i - 1] % 2 == 0)
		{
			a[i] = a[i - 1] / 2;
		System.out.printf("%d/2=%d\n",a[i - 1],a[i]);
		}
		if (a[i] == 1)
		{
			break;
		}
		}
		System.out.print("End");
		}
		return 0;
	}
}

