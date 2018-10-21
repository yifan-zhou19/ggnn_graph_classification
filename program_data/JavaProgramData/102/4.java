package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float[] a = new float[41];
		float[] b = new float[41];
		float f;
		int n;
		int i;
		int l;
		int t;
		int j = 0;
		int k = 0;
		String s = new String(new char[8]);
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
				s = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				f = Float.parseFloat(tempVar3);
			}
			if (s.charAt(0) == 'm')
			{
				a[j] = f;
				j++;
			}
			else
			{
				b[k] = f;
				k++;
			}
		}
		for (i = 0;i < j;i++)
		{
			t = i;
			for (l = i;l < j;l++)
			{
				if (a[t] > a[l])
				{
					t = l;
				}
			}
			f = a[t];
			a[t] = a[i];
			a[i] = f;
		}
		for (i = 0;i < k;i++)
		{
			t = i;
			for (l = i;l < k;l++)
			{
				if (b[t] < b[l])
				{
					t = l;
				}
			}
			f = b[t];
			b[t] = b[i];
			b[i] = f;
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%.2f ",a[i]);
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%.2f ",b[i]);
		}
		System.out.printf("%.2f\n",b[i]);
		return 0;
	}

}

