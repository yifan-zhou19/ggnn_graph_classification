package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int p;
		float[] in = new float[301];
		float sum = 0F;
		float sm;
		float[] b = new float[301];
		float max = 0F;
		float[] t = new float[301];
		float[] f = new float[301];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			in[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			sum += in[i];
		}
		float k;
		k = sum / n; //?????
	for (i = 0;i < n;i++)
	{
		if (in[i] > k)
		{
		b[i] = in[i] - k;
		}
		else
		{
			b[i] = k - in[i];
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
			t[j] = b[i];
			f[j] = in[i];
			j++;
		}
	}
	for (i = 0;i < j;i++)
	{
		for (p = j;p > i;p--)
		{
			if (f[p] < f[p - 1])
			{
				sm = f[p];
				f[p] = f[p - 1];
				f[p - 1] = f[p];
			}
		}
	}
	for (i = 0;i < j - 1;i++)
	{
		System.out.print(f[i]);
		System.out.print(',');
	}
	System.out.print(f[j - 1]);
	System.out.print("\n");
	return 0;
	}
}

