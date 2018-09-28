package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int c = 0;
		int d = 0;
		int[] a = new int[max];
		int[] b = new int[max];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
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
			if (a[i] == b[i])
			{
				c++;
			}
			else if (a[i] == 0 && b[i] == 1 || a[i] == 1 && b[i] == 2 || a[i] == 2 && b[i] == 0)
			{
				d++;
			}
		}
		if (n - c < 2 * d)
		{
			System.out.print("A");
		}
		else if (n - c > 2 * d)
		{
			System.out.print("B");
		}
		else
		{
			System.out.print("Tie");
		}



		return 0;
	}
}

