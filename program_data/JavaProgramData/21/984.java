package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		float pj = 0F;
		float max = 0F;
		float[] b = new float[300];
		float[] a = new float[300];
		float sum = 0F;
		int[] c = new int[300];
		int i = 0;
		int j = 0;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			sum = sum + a[i];
		}
		pj = sum / n;
		for (i = 0;i < n;i++)
		{
			if ((pj - a[i]) > 0)
			{
				b[i] = pj - a[i];
			}
			else
			{
				b[i] = a[i] - pj;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] == max)
			{
				c[k] = i;
				k++;
			}
		}
		for (i = 0;i < (k - 1);i++)
		{
		for (j = 0;j < (k - i - 1);j++)
		{
		if (a[c[j]] > a[c[j + 1]])
		{
			swap(a[c[j]],a[c[j + 1]]);
		}
		}
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.print(a[c[i]]);
			System.out.print(",");
		}
			System.out.print(a[c[k - 1]]);

		return 0;
	}


}

