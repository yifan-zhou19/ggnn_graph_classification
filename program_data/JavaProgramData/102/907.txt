package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int count1;
		int count2;
		int all;
		int i;
		int p;
		double[] height1 = new double[40];
		double[] height2 = new double[40];
		double exchange;
		double preheight;
		String input = new String(new char[7]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			all = Integer.parseInt(tempVar);
		}
		count1 = 0;
		count2 = 0;
		for (i = 0;i < all;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				input = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				preheight = Double.parseDouble(tempVar3);
			}
			if (input.length() == 4)
			{
				height1[count1] = preheight;
				count1++;
			}
			if (input.length() == 6)
			{
				height2[count2] = preheight;
				count2++;
			}
		}
		for (i = 0;i < count1;i++)
		{
			for (p = 0;p < count1 - 1;p++)
			{
				if (height1[p] > height1[p + 1])
				{
					exchange = height1[p];
					height1[p] = height1[p + 1];
					height1[p + 1] = exchange;
				}
			}
		}
		for (i = 0;i < count2;i++)
		{
			for (p = 0;p < count2 - 1;p++)
			{
				if (height2[p] < height2[p + 1])
				{
					exchange = height2[p];
					height2[p] = height2[p + 1];
					height2[p + 1] = exchange;
				}
			}
		}
		System.out.printf("%.2lf",height1[0]);
		for (i = 1;i < count1;i++)
		{
			System.out.printf(" %.2lf",height1[i]);
		}
		for (i = 0;i < count2;i++)
		{
			System.out.printf(" %.2lf",height2[i]);
		}







	return 0;
	}
}

