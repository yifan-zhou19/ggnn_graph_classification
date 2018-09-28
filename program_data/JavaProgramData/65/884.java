package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int c = 0;
		int d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[200];
		int[] b = new int[200];
		for (int i = 0;i < n;i++)
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
		}
		for (int j = 0;j < n;j++)
		{
			if (a[j] == 0 && b[j] == 1)
			{
				c++;
			}
			if (a[j] == 1 && b[j] > a[j])
			{
				c++;
			}
			if (a[j] == 2 && b[j] == 0)
			{
				c++;
			}
			if (b[j] == 0 && a[j] == 1)
			{
				d++;
			}
			if (b[j] == 1 && a[j] > b[j])
			{
				d++;
			}
			if (b[j] == 2 && a[j] == 0)
			{
				d++;
			}
		}
		if (c > d)
		{
			System.out.print("A");
		}
		if (c < d)
		{
			System.out.print("B");
		}
		if (c == d)
		{
			System.out.print("Tie");
		}

		return 0;
	}

}

