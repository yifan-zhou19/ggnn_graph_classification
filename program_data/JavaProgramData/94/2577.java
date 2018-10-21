package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int s;
		int t;
		int m;
		int j;
		int r;
		int i;
		int[] a = new int[500];
		int[] b = new int[500];
		s = 0;
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
			if (a[i] % 2 != 0)
			{
				b[s] = a[i];
				s++;
			}
		}
		for (j = 1;j < s;j++)
		{
			t = b[j];
			for (r = j - 1;r >= 0;r--)
			{
				if (t < b[r])
				{
					b[r + 1] = b[r];
					b[r] = t;
				}
				else
				{
					b[r + 1] = t;
					break;
				}
			}
		}
		for (m = 0;m < s - 1;m++)
		{
			System.out.printf("%d,",b[m]);
		}
		System.out.printf("%d",b[s - 1]);
		return 0;
	}


}

