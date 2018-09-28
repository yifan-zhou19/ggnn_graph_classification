package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int h;
		int m;
		int t = 0;
		int l;
		int s = 0;
		int[] a = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			s = 60;
			t = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Integer.parseInt(tempVar3);
				}
				t++;
				if (a[j] + 3 * t <= 58)
				{
					s = s - 3;
				}
				if (a[j] + 3 * t > 62)
				{
					s += 0;
				}
				else if (a[j] + 3 * t > 60 && a[j] + 3 * t < 63)
				{
					s = a[j];
					break;
				}
			}
			System.out.printf("%d\n",s);

		}
		return 0;
	}
}

