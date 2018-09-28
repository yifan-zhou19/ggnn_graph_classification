package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int[] a = new int[400];
		int[] b = new int[400];
		float x = 0F;
		float y = 0F;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Integer.SIZE / Byte.SIZE));
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
				a[i] = Integer.parseInt(tempVar2);
			}
			x = x + a[i];
		}
		x = (float)x / n;
		for (i = 1;i < n;i++)
		{
			for (j = i + 1;j <= n;j++)
			{
				if (a[i] > a[j])
				{
				   k = a[i];
				   a[i] = a[j];
				   a[j] = k;
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (Math.abs(a[i] - x) > y)
			{
				y = Math.abs(a[i] - x);
			}
		}
		l = 0;
		for (i = 1;i <= n;i++)
		{
			if (Math.abs(Math.abs(a[i] - x) - y) < 0.0001)
			{
			   l++;
			   b[l] = a[i];
			}
		}
		for (i = 1;i < l;i++)
		{
			System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d",b[l]);
	}

}

