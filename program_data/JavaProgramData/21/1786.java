package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int n,i,j=0,k,a[310],b[310],t,sum=0;
		int n;
		int i;
		int j = 0;
		int k;
		int[] a = new int[310];
		int[] b = new int[310];
		int t;
		int sum = 0;
		float ave;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			sum += a[i];
		}
		ave = sum / (float)n;
		for (i = 0;i < n;i++)
		{
			if (Math.abs(a[i] - ave) > max)
			{
				max = Math.abs(a[i] - ave);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (Math.abs(Math.abs(a[i] - ave) - max) < 0.00001)
			{
				b[j++] = a[i];
			}
		}
		for (i = 0;i < j - 1;i++)
		{
			for (k = i + 1;k < j;k++)
			{
				if (b[i] > b[k])
				{
					t = b[k];
					b[k] = b[i];
					b[i] = t;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
			if (i != 0)
			{
				System.out.print(",");
			}
			System.out.printf("%d",b[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

