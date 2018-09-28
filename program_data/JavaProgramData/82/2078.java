package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int[] m = new int[100];
		int max = 0;
		int n;
		int k = 0;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			if ((a[i] >= 90) && (a[i] <= 140) && (b[i] >= 60) && (b[i] <= 90))
			{
				k++;
				m[s] = k;
				s++;
			}
			else
			{
				k = 0;
			}
		}

	for (int j = 0;j < s;j++)
	{
		if (m[j] > max)
		{
			max = m[j];
		}

	}
	System.out.printf("%d",max);
	return 0;
	}

}

