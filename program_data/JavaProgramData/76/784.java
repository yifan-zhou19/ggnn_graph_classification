package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int m;
		int i;
		int j;
		int s = 1;
		int t = 20000;
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
			a[i] *= 2;
			b[i] *= 2;
			if (a[i] < t)
			{
				t = a[i];
			}
			if (b[i] > s)
			{
				s = b[i];
			}
		}
		for (j = t + 1;j <= s - 1;j = j + 2)
		{
			m = 0;
			for (i = 0;i < n;i++)
			{
				if ((a[i] < j) && (b[i]> j))
				{
					m = 1;
					break;
				}
			}
			if (m == 0)
			{
				System.out.print("no");
				break;
			}
		}
		if (m == 1)
		{
			System.out.printf("%d %d",t / 2,s / 2);
		}
		return 0;
	}


}

