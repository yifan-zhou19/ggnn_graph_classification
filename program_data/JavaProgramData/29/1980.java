package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int i;
		int m;
		int n;
		int j;
		float s = 0F;
		a[0] = 1;
		a[1] = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (j = 1;j <= n;j++)
			{
				a[j + 1] = a[j] + a[j - 1];
				s = s + (float)a[j + 1] / a[j];
			}
			System.out.printf("%.3f\n",s);
			s = 0F;
		}
		return 0;
	}
}

