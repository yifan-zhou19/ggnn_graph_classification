package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int all;
		int count1;
		int count2;
		int i;
		int p;
		double[] h1 = new double[40];
		double[] h2 = new double[40];
		double h;
		double ex;
		String input = new String(new char[6]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			all = Integer.parseInt(tempVar);
		}
		count1 = 0;
		count2 = 0;
		for (i = 0;i < all;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead("\n");
			if (tempVar2 != null)
			{
				input = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				h = Double.parseDouble(tempVar3);
			}
			if (input.charAt(0) == 'm')
			{
				h1[count1] = h;
				count1++;
			}
			if (input.charAt(0) == 'f')
			{
				h2[count2] = h;
				count2++;
			}

		}
		for (i = 0;i < count1;i++)
		{
			for (p = 0;p < count1 - 1;p++)
			{
				if (h1[p] > h1[p + 1])
				{
					ex = h1[p + 1];
					h1[p + 1] = h1[p];
					h1[p] = ex;
				}
			}
		}
		for (i = 0;i < count2;i++)
		{
				for (p = 0;p < count2 - 1;p++)
				{
					if (h2[p] < h2[p + 1])
					{
						ex = h2[p + 1];
						h2[p + 1] = h2[p];
						h2[p] = ex;
					}
				}
		}
		System.out.printf("%.2lf",h1[0]);
		for (i = 1;i < count1;i++)
		{
			System.out.printf(" %.2lf",h1[i]);
		}
		for (i = 0;i < count2;i++)
		{
			System.out.printf(" %.2lf",h2[i]);
		}



	return 0;
	}
}

