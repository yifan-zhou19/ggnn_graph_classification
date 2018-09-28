package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[200];
		int[] b = new int[200];
		int i;
		int c = 0;
		int d = 0;
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
			if (a[i] != b[i])
			{
				if (a[i] == 0)
				{
				if (b[i] == 1)
				{
					c++;
				}
				else if (b[i] == 2)
				{
					d++;
				}
				}
			else if (a[i] == 1)
			{
				if (b[i] == 0)
				{
					d++;
				}
				else if (b[i] == 2)
				{
					c++;
				}
			}
			else if (a[i] == 2)
			{
				if (b[i] == 0)
				{
					c++;
				}
				else if (b[i] == 1)
				{
					d++;
				}
			}
			}
			else if (a[i] == b[i])
			{
				c = c;
				d = d;
			}
		}
		if (c > d)
		{
			System.out.print("A");
		}
		else if (c < d)
		{
			System.out.print("B");
		}
		else if (c == d)
		{
			System.out.print("Tie");
		}
		return 0;
	}
}

