package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l = 0;
		float[] a = new float[100];
		float[] b = new float[100];
		float[] c = new float[100];
		float max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= (n - 1);i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Float.parseFloat(tempVar3);
			}
		}
		for (j = 0;j <= (n - 2);j++)
		{
			for (k = (j + 1);k <= (n - 1);k++)
			{
				c[l] = (a[k] - a[j]) * (a[k] - a[j]) + (b[k] - b[j]) * (b[k] - b[j]);
				l++;
			}
		}
			max = c[0];
			for (i = 1;i <= (l - 1);i++)
			{
			if (c[i] > max)
			{
					max = c[i];
			}
			}
			System.out.printf("%.4f\n",Math.sqrt(max));
	}
}

