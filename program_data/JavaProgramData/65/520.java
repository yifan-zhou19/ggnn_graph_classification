package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int p = 0;
		int q = 0;
		int[] a = new int[200];
		int[] b = new int[200];
		int i;
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
			if (a[i] == b[i] - 1)
			{
				p++;
			}
			else if (a[i] == 0 && b[i] == 2)
			{
				q++;
			}
			else if (b[i] == a[i] - 1)
			{
				q++;
			}
			else if (b[i] == 0 && a[i] == 2)
			{
				p++;
			}
		}
		if (p > q)
		{
			System.out.print("A");
		}
		else if (p < q)
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

