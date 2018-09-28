package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		float[] a = new float[100];
		float[] b = new float[100];
		float[] c = new float[100];
		 a[1] = 1F;
		 b[1] = 2F;
		 c[1] = b[1] / a[1];
		for (i = 2;i < 100;i++)
		{
			a[i] = b[i - 1];
			b[i] = a[i] + a[i - 1];
			c[i] = b[i] / a[i];
		}
		int n;
		int j;
		int[] d = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] m = new int[100];
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[j] = Integer.parseInt(tempVar2);
			}
		}
		 for (j = 0;j < n;j++)
		 {
			 float[] p = new float[100];
			 int k;
			 p[j] = 0F;
			for (k = 1;k <= m[j];k++)
			{
			 p[j] += c[k];
			}
			System.out.printf("%.3f\n",p[j]);
		 }
		return 0;
	}
}

