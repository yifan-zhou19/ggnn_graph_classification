package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int sum = 0;
		int[] a = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			sum += a[i];
		}
		float aver;
		aver = (float)sum / n;
		int j;
		float[] b = new float[300];
		for (j = 0;j < n;j++)
		{
			if ((float)a[j] > aver)
			{
				b[j] = a[j] - aver;
			}
			else
			{
				b[j] = aver - a[j];
			}
		}
		float c;
		c = b[0];
		int m;
		int p = 0;
		int q = 0;
		for (m = 1;m < n;m++)
		{
			if (b[m] > c)
			{
				c = b[m];
				p = m;
			}
		}
		int s;
		for (s = p + 1;s < n;s++)
		{
			if (b[s] == c)
			{
				q = s;
			}
		}
		if (q == 0)
		{
			System.out.printf("%d",a[p]);
		}
		if (q != 0)
		{
			if (a[p] > a[q])
			{
				System.out.printf("%d,%d",a[q],a[p]);
			}
			else
			{
				System.out.printf("%d,%d",a[p],a[q]);
			}
		}


	}



}

