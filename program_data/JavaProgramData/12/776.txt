package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float[] a = new float[20];
		do
		{
			int i = 1;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Float.parseFloat(tempVar);
			}
			if (a[i] == 0F)
			{
				break;
			}
			else
			{
				i++;
			}
		}while (i <= 19);
		int j;
		int k;
		float t;
		for (j = 1;j <= i - 2;j++)
		{
			for (k = 1;k <= i - 1 - j;k++)
			{
				if (a[k] > a[k + 1])
				{
					t = a[k];
					a[k] = a[k + 1];
					a[k + 1] = t;
				}
			}
		}
		int s = 0;
		int l;
		int m;
		for (l = 1;l <= i - 2;l++)
		{
			for (m = 1;m <= i - 1;m++)
			{
				if (a[m] / a[l] == 2F)
				{
					s = s + 1;
				}
			}
		}
		if (a[1] > 0F)
		{
		System.out.printf("%d\n",s);
		}
		}while (a[1] > 0F);
		return 0;
	}

}

