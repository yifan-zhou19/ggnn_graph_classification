package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int sign = 0;
		float max;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int a[300];
		int[] a = new int[300];
		float[] ab = new float[300];
		float[] c = new float[300];
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int sum=0;
		int sum = 0;
		float aver;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			sum = sum + a[i];
		}
		aver = ((float)sum) / n;
		max = 0F;
		for (i = 0;i < n;i++)
		{
			c[i] = (float)a[i] - aver;
			if (c[i] > 0F)
			{
				ab[i] = c[i];
			}
			else
			{
				ab[i] = -c[i];
			}
			if (ab[i] > max)
			{
				max = ab[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (ab[i] == max && c[i] <= 0F)
			{
				System.out.printf("%d",a[i]);
				sign = 1;
			}
		}

		for (i = 0;i < n;i++)
		{
			if (ab[i] == max && c[i] >= 0F && sign == 1)
			{
				System.out.printf(",%d",a[i]);
			}
			if (ab[i] == max && c[i] >= 0F && sign == 0)
			{
				System.out.printf("%d",a[i]);
			}
		}
	}
}

