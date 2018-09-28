package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[300];
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
		int[] b = new int[300];
		int x = 1;
		int y;
		b[0] = a[0];
		for (i = 1;i < n;i++)
		{
			y = 1;
			for (j = 0;j < i;j++)
			{
				 if (a[i] == a[j])
				 {
					 y = 0;
					 break;
				 }
			}
			if (y == 1)
			{
				b[x] = a[i];
				x = x + 1;
			}
		}
		x = x - 1;
		for (i = 0;i < x;i++)
		{
			System.out.printf("%d",b[i]);
			System.out.print(",");
		}
		System.out.printf("%d\n",b[x]);

	}

}

