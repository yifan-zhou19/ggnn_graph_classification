package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[20000];
		int[] b = new int[20000];
		int i;
		int j;
		int r;
		int t;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = 1;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		b[0] = a[0];
		for (i = 1;i < n;i++)
		{
			t = 0;
			for (j = 0;j < i;j++)
			{
				if (a[i] == a[j])
				{
					t++;
				}
			}
			if (t == 0)
			{
				b[s] = a[i];
				s++;
			}
		}
		for (r = 0;r < s - 1;r++)
		{
			System.out.printf("%d ",b[r]);
		}
		System.out.printf("%d",b[s - 1]);
		System.out.print("\n");
		return 0;
	}

}

