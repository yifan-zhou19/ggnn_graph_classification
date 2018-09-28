package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int p = 0;
		int q = 0;
		int[] a = new int[101];
		int[] b = new int[101];
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
			if (a[i] == 0)
			{
				if (b[i] == 0)
				{
					p++;
					q++;
				}
				else if (b[i] == 1)
				{
					p++;
				}
				else if (b[i] == 2)
				{
					q++;
				}
			}
			else if (a[i] == 1)
			{
				if (b[i] == 0)
				{
					q++;
				}
				else if (b[i] == 1)
				{
					p++;
					q++;
				}
				else if (b[i] == 2)
				{
					p++;
				}
			}
			else if (a[i] = 2)
			{
				if (b[i] == 0)
				{
					p++;
				}
				else if (b[i] == 1)
				{
					q++;
				}
				else if (b[i] == 2)
				{
					p++;
					q++;
				}
			}
		}
		if (p == q)
		{
			System.out.print("Tie");
		}
		else if (p > q)
		{
			System.out.print("A");
		}
		else if (p < q)
		{
			System.out.print("B");
		}
		return 0;
	}
}

