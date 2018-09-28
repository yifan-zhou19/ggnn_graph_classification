package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[200];
		int[] b = new int[2000];
		int p = 0;
		int q = 0;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] - b[i] == 1)
			{
				q += 1;
			}
			else if (a[i] - b[i] == 2)
			{
				p += 1;
			}
			else if (a[i] - b[i] == -1)
			{
				p += 1;
			}
			else if (a[i] - b[i] == -2)
			{
				q += 1;
			}
			else
			{
				p = p;
				q = q;
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

