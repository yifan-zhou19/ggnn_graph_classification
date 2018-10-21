package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int s;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		}

		for (i = 0;i < n;i++)
		{
		if (i == 0)
		{
			System.out.printf("%d",a[0]);
		}
		else
		{
		for (j = 0;j <= i - 1;j++)
		{
		if (a[j] == a[i])
		{
		a[i] = 0;
		break;
		}
		}
		if (a[i] != 0)
		{
			System.out.printf(" %d",a[i]);
		}
		}
		}
	System.out.print("\n");
	System.in.read();
	System.in.read();
	System.in.read();
	return 0;
	}

}

