package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//void sort(int[] min, int n);
	public static void Main()
	{
		int[] a = new int[300];
		int n;
		int i;
		int j = 0;
		int sum = 0;
		int[] min = new int[300];
		int m;
		float av;
		float[] b = new float[300];
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
			sum = sum + a[i];
		}
		av = (float)sum / (float)n;
		for (i = 0;i < n;i++)
		{
			if (a[i] > av)
			{
			b[i] = a[i] - av;
			}
			else
			{
			b[i] = av - a[i];
			}
		}
		m = 0;
		for (i = 0;i < n;i++)
		{
			if (b[m] < b[i])
			{
				m = i;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] == b[m])
			{
				min[j++] = a[i];
			}
		}
		{
		int i;
		int x;
		int t;
		for (i = 0;i < j - 1;i++)
		{
			for (x = 0;x < j - i - 1;x++)
			{
				if (min[x] > min[x + 1])
				{
					t = min[x];
					min[x] = min[x + 1];
					min[x + 1] = t;
				}
			}
		}
	}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%d",min[i]);
			if (i != j - 1)
			{
				System.out.print(",");
			}
		}

	}

}

