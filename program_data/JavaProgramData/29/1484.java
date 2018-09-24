package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float[] a = new float[1000];
		int i = 1;
		a[0] = 0F;
		int[] b = new int[1002];
		int m = 3;
		b[1] = 1;
		b[2] = 2;
		while (m < 1001)
		{
			b[m] = b[m - 1] + b[m - 2];
			m++;
		}

		while (i < 1000)
		{
			a[i] = a[i - 1] + (float)b[i + 1] / b[i];
			i++;
		}
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		int k = 1;

		 while (k <= n)
		 {
			 int p;
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 p = Integer.parseInt(tempVar2);
			 }
			 System.out.printf("%.3f\n",a[p]);
			 k++;
		 }
		 return 0;
	}
}

