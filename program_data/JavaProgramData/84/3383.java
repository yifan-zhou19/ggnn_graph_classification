package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int n;
		int x;
		int y;
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
		}
		x = a[0];
		y = a[0];
		for (i = 1;i < n;i++)
		{
			if (x < a[i])
			{
				x = a[i];
			}
		}
		for (i = 1;i < n;i++)
		{
			if (y < a[i] && a[i] != x)
			{
				y = a[i];
			}
		}
			System.out.printf("%d\n",x);
			System.out.printf("%d\n",y);





	}

}

