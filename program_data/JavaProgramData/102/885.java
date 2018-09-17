package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int k = 0;
		int u;
		int x;
		String s = new String(new char[8]);
		String use = new String(new char[2]);
		final String s1 = "male";
		float hi;
		float e;
		float[] a = new float[41];
		float[] b = new float[41];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		use = new Scanner(System.in).nextLine();

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
				hi = Float.parseFloat(tempVar3);
			}
			x = strcmp(s,s1);
			if (x == 0)
			{
				a[j] = hi;
				j++;
			}
			else
			{
				b[k] = hi;
				k++;
			}
		}
		for (i = 0;i < j;i++)
		{
			for (u = 0;u < j - i - 1;u++)
			{
				if (a[u] > a[u + 1])
				{
					e = a[u];
					a[u] = a[u + 1];
					a[u + 1] = e;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			for (u = 0;u < k - i - 1;u++)
			{
				if (b[u] < b[u + 1])
				{
					e = b[u];
					b[u] = b[u + 1];
					b[u + 1] = e;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%.2f ",a[i]);
		}
		for (i = 0;i < k;i++)
		{
			if (i != 0)
			{
				System.out.print(" ");
			}
			System.out.printf("%.2f",b[i]);
		}
		return 0;
	}



}

