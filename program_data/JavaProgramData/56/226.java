package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[6];
		int t;
		int i;
		int k;
		int m;
		for (k = 1;k <= 4;++k)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				t = Integer.parseInt(tempVar);
			}
			m = 0;
			for (i = 1;t > 0;++i)
			{
				a[m] = t % 10;
				t = (int)(t / 10);
				System.out.printf("%d",a[m]);
				m++;
			}
			System.out.print("\n");
		}
			return (0);
	}
}

