package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float[] a = new float[1000];
		float b = 0.1F;
		int i;
		int j;
		int k;
		int m;
		int n;
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
		}
		for (j = 0;j < n;j++)
		{
			for (i = j + 1;i < n;i++)
			{
				if (a[j] == a[i])
				{
					a[i] = b;
				}
			}
		}
			System.out.printf("%g",a[0]);
			for (i = 1;i < n;i++)
			{
				if (a[i] != b)
				{
					System.out.printf(",%g",a[i]);
				}
			}




	}
}

