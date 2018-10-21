package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int[] a = new int[m];
		float[] b = new float[100];
		float f1 = 1F;
		float f2 = 1F;
		float f3;
		for (i = 1;i <= m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i - 1] = Integer.parseInt(tempVar2);
			}
			b[i - 1] = 0F;
			for (j = 1;j <= a[i - 1];j++)
			{
				f3 = f1 + f2;
				b[i - 1] += f3 / f2;
				f1 = f2;
				f2 = f3;
			}
		f1 = 1F,f2 = 1F,f3 = 0F;
		}
		for (i = 1;i <= m;i++)
		{
			System.out.printf("%.3f\n",b[i - 1]);
		}




	}
}

