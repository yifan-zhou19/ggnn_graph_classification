package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[200];
		int[] b = new int[200];
		int i;
		int r = 0;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= (n - 1);i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i <= (n - 1);i++)
		{
			if (((a[i] == 0) && (b[i] == 1)) || ((a[i] == 1) && (b[i] == 2)) || ((a[i] == 2) && (b[i] == 0)))
			{
				r++;
			}
			else if (((b[i] == 0) && (a[i] == 1)) || ((b[i] == 1) && (a[i] == 2)) || ((b[i] == 2) && (a[i] == 0)))
			{
				r--;
			}
		}
		if (r > 0)
		{
			System.out.print("A");
		}
		else if (r < 0)
		{
			System.out.print("B");
		}
		else if (r == 0)
		{
			System.out.print("Tie");
		}
		return 0;
	}

}

