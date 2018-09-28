package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int e;
		int[] c = new int[100];
		float[] b = new float[100];
		float[] a = new float[200];
		float f = 0F;
		a[1] = 1F,a[2] = 2F;
		for (i = 3;i <= 100;i++)
		{
			 a[i] = (a[i - 2] + a[i - 1]);
		}
		for (i = 1;i <= 99;i++)
		{
			 b[i] = (a[i + 1] / a[i]);
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 c[i] = Integer.parseInt(tempVar2);
			 }
		}
		for (i = 1;i <= n;i++)
		{
			 f = 0F;
			 for (e = 1;e <= c[i];e++)
			 {
				   f = f + b[e];
			 }
			 System.out.printf("%.3f\n",f);
		}
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
	}
}

