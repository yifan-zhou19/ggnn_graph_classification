package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i = 0;
		int j = 0;
		int[] a = new int[10000];
		int f = 0;
		float GPA;
		float[] b = new float[10000];
		float c;
		float d = 0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			f = f + a[i];
			i++;
		}
		while (j < n)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[j] = Float.parseFloat(tempVar3);
			}
			if (b[j] >= 90F)
			{
				b[j] = 4.0F;
			}
			else if (b[j] >= 85F)
			{
				b[j] = 3.7F;
			}
			else if (b[j] >= 82F)
			{
				b[j] = 3.3F;
			}
			else if (b[j] >= 78F)
			{
				b[j] = 3.0F;
			}
			else if (b[j] >= 75F)
			{
				b[j] = 2.7F;
			}
			else if (b[j] >= 72F)
			{
				b[j] = 2.3F;
			}
			else if (b[j] >= 68F)
			{
				b[j] = 2.0F;
			}
			else if (b[j] >= 64F)
			{
				b[j] = 1.5F;
			}
			else if (b[j] >= 60F)
			{
				b[j] = 1.0F;
			}
			else
			{
				b[j] = 0F;
			}
			j++;
		}
		while (i > 0)
		{
			i--;
			j--;
			c = a[i] * b[j];
			d = d + c;
		}
		GPA = d / (float)f;
		System.out.printf("%.2f",GPA);
	}
}

