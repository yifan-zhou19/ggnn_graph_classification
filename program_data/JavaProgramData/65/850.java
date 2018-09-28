package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a1;
		int b1;
		int c1;
		int[] a = new int[200];
		int[] b = new int[200];
		a1 = 0;
		b1 = 0;
		c1 = 0;
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
			if (a[i] == 0 && b[i] == 0)
			{
				c1++;
			}
			else if (a[i] == 0 && b[i] == 1)
			{
				a1++;
			}
			else if (a[i] == 0 && b[i] == 2)
			{
				b1++;
			}
			else if (a[i] == 1 && b[i] == 0)
			{
				b1++;
			}
			else if (a[i] == 1 && b[i] == 1)
			{
				c1++;
			}
			else if (a[i] == 1 && b[i] == 2)
			{
				a1++;
			}
			else if (a[i] == 2 && b[i] == 0)
			{
				a1++;
			}

			else if (a[i] == 2 && b[i] == 1)
			{
				b1++;
			}
			else if (a[i] == 2 && b[i] == 2)
			{
				c1++;
			}

		}
		if (a1 > b1)
		{
			System.out.print("A");
		}
		else if (a1 == b1)
		{
			System.out.print("Tie");
		}
		else
		{
			System.out.print("B");
		}
		return 0;
	}
}

