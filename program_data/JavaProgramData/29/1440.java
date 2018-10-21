package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int[] b = new int[100000];
		int[] c = new int[100000];
		float result = 0F;
		b[0] = 1;
		b[1] = 2;
		c[0] = 2;
		c[1] = 3;
		for (j = 0;j < m;j++)
		{
			result = 0F;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		if (k > 2)
		{
		for (i = 2;i < k;i++)
		{
			b[i] = b[i - 1] + b[i - 2];
			c[i] = c[i - 1] + c[i - 2];
			result += 1.0 * c[i] / b[i];
		}
		System.out.printf("%.3f\n",result + 3.5);
		}
		 else if (k == 2)
		 {
			result = 3.5F;
			System.out.printf("%.3f\n",result);
		 }
		 else if (k == 1)
		 {
			 result = 2.0F;
			 System.out.printf("%.3f\n",result);
		 }
		}
		 return 0;
	}


}

