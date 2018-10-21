package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[100];
		int t1;
		int t2;
		int t3;
		int t4;
		int sum;
		int i;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}

		t1 = 0;
		t2 = 0;
		t3 = 0;
		t4 = 0;
		sum = 0;
		for (i = 0; i < n; i++)
		{
			if (a[i] >= 1 && a[i] <= 18)
			{
				t1++;
				sum++;
			}
			else if (a[i] <= 35)
			{
				t2++;
				sum++;
			}
			else if (a[i] <= 60)
			{
				t3++;
				sum++;
			}
			else
			{
				t4++;
				sum++;
			}
		}
		System.out.printf("1-18: %.2f%%\n", (float)t1 / sum * 100);
		System.out.printf("19-35: %.2f%%\n", (float)t2 / sum * 100);
		System.out.printf("36-60: %.2f%%\n", (float)t3 / sum * 100);
		System.out.printf("60??: %.2f%%\n", (float)t4 / sum * 100);
	}
}

