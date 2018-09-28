package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int x;
		int y;
		int[] a = new int[3];
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
				x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y = Integer.parseInt(tempVar3);
			}
			if (x - y == 1)
			{
				a[2]++;
			}
			if (y - x == 1)
			{
				a[1]++;
			}
			if (x - y == 2)
			{
				a[1]++;
			}
			if (y - x == 2)
			{
				a[2]++;
			}
		}
		if (a[1] > a[2])
		{
			System.out.print("A");
		}
		else if (a[1] < a[2])
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

