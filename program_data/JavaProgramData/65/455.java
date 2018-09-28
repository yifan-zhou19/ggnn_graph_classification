package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		c = 0;
		d = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			if ((a[i] == 0 && b[i] == 1) || (a[i] == 1 && b[i] == 2) || (a[i] == 2 && b[i] == 0))
			{
				c++;
			}
			if ((a[i] == 0 && b[i] == 2) || (a[i] == 1 && b[i] == 0) || (a[i] == 2 && b[i] == 1))
			{
				d++;
			}
			if (a[i] == b[i])
			{
				c++;
				d++;
			}
		}
		if (c > d)
		{
			System.out.print("A");
		}
		if (c == d)
		{
			System.out.print("Tie");
		}
		if (c < d)
		{
			System.out.print("B");
		}
		return 0;
	}
}

