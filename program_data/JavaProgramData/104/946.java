package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int i;
		int j;
		int s;
		int t;
		int v = 0;
		int[] a = new int[1000];
		int[] b = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		for (i = 0;x != 0;i++)
		{
			a[i] = x;
			x = x / 2;
		}
		s = i;
		for (i = 0;y != 0;i++)
		{
			b[i] = y;
			y = y / 2;
		}
		t = i;
		for (i = 0;i < s;i++)
		{
			for (j = 0;j < t;j++)
			{
				if (a[i] == b[j])
				{
					v = 1;
					break;
				}
			}
			if (v == 1)
			{
				System.out.printf("%d",a[i]);
				break;
			}

		}
		return 0;
	}

}

