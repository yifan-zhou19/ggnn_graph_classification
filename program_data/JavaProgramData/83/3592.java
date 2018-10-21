package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] xf = new int[10];
		float[] cj = new float[10];
		int i = 0;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (j <= n - 1)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xf[j] = Integer.parseInt(tempVar2);
			}
			j++;
		}
		while (i <= n - 1)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				cj[i] = Float.parseFloat(tempVar3);
			}
			if (cj[i] >= 90F && cj[i] <= 100F)
			{
				cj[i] = 4.0F;
			}
			else if (cj[i] >= 85F && cj[i] <= 89F)
			{
				cj[i] = 3.7F;
			}
			else if (cj[i] >= 82F && cj[i] <= 84F)
			{

				cj[i] = 3.3F;
			}
			else if (cj[i] >= 78F && cj[i] <= 81F)
			{
				cj[i] = 3.0F;
			}
			else if (cj[i] >= 75F && cj[i] <= 77F)
			{
				cj[i] = 2.7F;
			}
			else if (cj[i] >= 72F && cj[i] <= 74F)
			{
				cj[i] = 2.3F;
			}
			else if (cj[i] >= 68F && cj[i] <= 71F)
			{
				cj[i] = 2.0F;
			}
			else if (cj[i] >= 64F && cj[i] <= 67F)
			{
				cj[i] = 1.5F;
			}
			else if (cj[i] >= 61F && cj[i] <= 63F)
			{
				cj[i] = 1.0F;
			}
			else
			{
				cj[i] = 0.0F;
			}

			i++;
		}
		float result = 0F;
		int k = 0;
		int x = 0;
		while (k <= n - 1)
		{
			result = result + xf[k] * cj[k];
			x = x + xf[k];
			k++;
		}
		result = result / x;
		System.out.printf("%.2f",result);
		return 0;
	}
}

