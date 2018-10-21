package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int max;
		int min;
		int n;
		int s = 0;
		int i;
		int j;
		int m;
		int[] a = new int[301];
		float aver;
		float s1;
		float s2;
		float sum = 0F;
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
		}
		for (i = 0;i < n;i++)
		{
		  sum = sum + a[i];
		}
		aver = sum / n;

		max = a[0];
		for (i = 1;i < n;i++)
		{
			if (max < a[i])
			{
				max = a[i];
			}
		}

		min = a[0];
		for (j = 1;j < n;j++)
		{
			if (min > a[j])
			{
				min = a[j];
			}
		}

		s1 = max - aver;
		s2 = aver - min;

		if (s1 > s2)
		{
			System.out.printf("%d\n",max);
		}
		if (s1 < s2)
		{
			System.out.printf("%d\n",min);
		}
		if (s1 == s2)
		{
			System.out.printf("%d,%d\n",min,max);
		}
	}
}

