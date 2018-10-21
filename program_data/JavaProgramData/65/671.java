package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int l = 0;
		int m = 0;
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
				(a[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(b[i]) = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] - b[i] == 1 || b[i] - a[i] == 2)
			{
				l++;
			}
			else if (a[i] - b[i] == -1 || b[i] - a[i] == -2)
			{
				m++;
			}
		}
		if (m > l)
		{
			System.out.print("A");
		}
		else if (m == l)
		{
			System.out.print("Tie");
		}
		else if (m < l)
		{
			System.out.print("B");
		}
		return 0;
	}
}

