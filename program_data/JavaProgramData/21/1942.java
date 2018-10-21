package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		float[] a = new float[300];
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int b[300],i,j=0,n;
		int[] b = new int[300];
		int i;
		int j = 0;
		int n;
		float sum = 0F;
		float p;
		float max = 0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Float.parseFloat(tempVar2);
			}
			sum += a[i];
		}
		p = (float)sum / n;
		for (i = 0;i < n;i++)
		{
		if (Math.abs(a[i] - p) > max)
		{
				max = Math.abs(a[i] - p);
		}
		}
		for (i = 0;i < n;i++)
		{
			if (Math.abs(Math.abs(a[i] - p) - max) < 0.01)
			{
				b[j++] = (int)a[i];
			}
		}
		if (j == 1)
		{
			System.out.printf("%d\n",b[0]);
		}
		else
		{
			for (i = 0;i < j;i++)
			{
				System.out.printf("%d%c",b[i],i < j - 1?',':'\n');
			}
		}
	}
}

