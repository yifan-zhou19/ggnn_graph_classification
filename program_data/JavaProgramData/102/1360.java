package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int k = 0;
		int l;
		float[] a = new float[40];
		float[] b = new float[40];
		float t = 0F;
		char[] s1 = {'m', 'a', 'l', 'e'};
		char[] s2 = {'f', 'e', 'm', 'a', 'l', 'e'};
		String s3 = new String(new char[4]);
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
				s3 = tempVar2.charAt(0);
			}

			if (strcmp("male",s3) == 0)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Float.parseFloat(tempVar3);
				}
				j++;
			}
				else
				{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					b[k] = Float.parseFloat(tempVar4);
				}
				k++;
				}

		}
	for (i = j - 1;i > 0;i--)
	{
		for (l = 0;l < i;l++)
		{
			if (a[l] > a[l + 1])
			{
				t = a[l];
				a[l] = a[l + 1];
				a[l + 1] = t;
			}
		}
	}
	t = 0F;
	for (i = k - 1;i > 0;i--)
	{
		for (l = 0;l < i;l++)
		{
			if (b[l] < b[l + 1])
			{
				t = b[l];
				b[l] = b[l + 1];
				b[l + 1] = t;
			}
		}
	}
		System.out.printf("%.2f",a[0]);
		for (i = 1;i < j;i++)
		{
			System.out.printf(" %.2f",a[i]);
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf(" %.2f",b[i]);
		}
	}

}

