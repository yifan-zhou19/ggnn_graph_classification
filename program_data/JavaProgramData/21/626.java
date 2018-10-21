package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] flag = new int[300];
		int t;
		int m;
		float ave;
		float sum = 0.0F;
		float max = 0.0F;
		float[] c = new float[300];
		int[] a = new int[300];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = sum + a[i];
		}
		ave = sum / n;
		for (i = 0;i < n; i++)
		{
			c[i] = Math.abs(a[i] - ave);
			if ((c[i] - max) > 1e-6)
			{
				max = c[i];
				flag[0] = i;
			}
		}
		j = 0;
		for (i = 0; i < n; i++)
		{
			if (Math.abs(c[i] - max) < 1e-6)
			{
				flag[j] = i;
				j++;
			}
		}
		for (i = 0; i < j - 1;i++)
		{
			for (m = 0; m < j - 1 - i;m++)
			{
				if (flag[m] > flag[m + 1])
				{
					t = flag[m];
					flag[m] = flag[m + 1];
					flag[m + 1] = t;
				}
			}
		}
		for (i = 0;i < j - 1;i++)
		{
			System.out.print(a[flag[i]]);
			System.out.print(",");
		}
		System.out.print(a[flag[j - 1]]);
		System.out.print("\n");
		return 0;
	}
}

