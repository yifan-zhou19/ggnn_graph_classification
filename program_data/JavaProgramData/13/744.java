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
		int[] a = new int[100];
		int i = 0;
		int x;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d",x);
		a[i] = x;
		i++;
		for (int j = 1;j < n;j++)
		{
				int h;
				int k = 0;
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					h = Integer.parseInt(tempVar3);
				}
				for (int t = 0;t < i;t++)
				{
						if (h == a[t])
						{
						k = 1;
						}
				}
				if (k == 0)
				{
					   System.out.printf(" %d",h);
					   a[i] = h;
					   i++;
				}
		}
		System.in.read();
		System.in.read();
	}

}

