package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int[] a = new int[300];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p[300];
		int[] p = new int[300];
		int j = 0;
		int j1;
		int j2;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *temp;
		int temp;
		double aver = 0;
		double max = 0;
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
			aver = aver + a[i];
		}
		aver /= n;
		for (i = 0;i < n;i++)
		{
			max = Math.abs(aver - a[i]) > max != 0?Math.abs(aver - a[i]):max;
		}
		for (i = 0;i < n;i++)
		{
			if (Math.abs(Math.abs(aver - a[i]) - max) < 1e-6)
			{
				p[j] = a[i];
				j++;
			}
		}
		for (j1 = 0;j1 < j - 1;j1++)
		{
			for (j2 = 0;j2 < j - 1 - j1;j2++)
			{
				if (p[j2] > p[j2 + 1])
				{
					p[j2] = temp;
					p[j2] = p[j2 + 1];
					p[j2 + 1] = temp;
				}
			}
		}
		System.out.printf("%d",p[0]);
		for (j1 = 1;j1 < j;j1++)
		{
			System.out.printf(",%d",p[j1]);
		}
	}


}

