package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int i;
		int m1 = 0;
		int m2 = 0;
		int m3 = 0;
		int m4 = 0;

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
			if (a[i] > 60)
			{
				m4++;
			}
			else if (a[i] > 35)
			{
				m3++;
			}
			else if (a[i] > 18)
			{
				m2++;
			}
			else
			{
				m1++;
			}
		}
		System.out.printf("1-18: %.2f%%\n",(double)m1 / n * 100);
		System.out.printf("19-35: %.2f%%\n",(double)m2 / n * 100);
		System.out.printf("36-60: %.2f%%\n",(double)m3 / n * 100);
		System.out.printf("60??: %.2f%%\n",(double)m4 / n * 100);
		return 0;
	}


}

