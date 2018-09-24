package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] a = new int[200][2];
		int i;
		int b;
		int c;
		b = 0;
		c = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i][1] = Integer.parseInt(tempVar3);
			}
			if (a[i][0] == 0 && a[i][1] == 1)
			{
				b = b + 1;
			}
			else if (a[i][0] == 1 && a[i][1] == 2)
			{
				b = b + 1;
			}
			else if (a[i][0] == 2 && a[i][1] == 0)
			{
				b = b + 1;
			}
			else if (a[i][0] == a[i][1])
			{
				b = b;
				c = c;
			}
			else
			{
				c = c + 1;
			}
		}
		if (b > c)
		{
			System.out.print("A");
		}
		else if (b < c)
		{
			System.out.print("B");
		}
		else if (b == c)
		{
			System.out.print("Tie");
		}
		return 0;
	}
}

