package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		int[] b = new int[n];
		for (i = 1;i < n + 1;i++)
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
		x = 0,y = 0;
		for (i = 1;i < n + 1;i++)
		{
		if (a[i] - b[i] == 1 || b[i] - a[i] == 2)
		{
		y++;
		}
	 else if (a[i] - b[i] == 2 || b[i] - a[i] == 1)
	 {
		x++;
	 }
	 else
	 {
		x = x,y = y;
	 }
		}
		if (x > y)
		{
		System.out.print("A");
		}
	 else if (x < y)
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

