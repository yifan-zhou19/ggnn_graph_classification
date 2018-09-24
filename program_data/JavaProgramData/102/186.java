package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		String gender = new String(new char[8]);
		String gen = new String(new char[40]);
		float[] height = new float[40];
		float[] male = new float[40];
		float[] female = new float[40];
		int malenum = 0;
		int femalenum = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		int l = 0;
		int m = 0;
		float temp;

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
				gender = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				height[i] = Float.parseFloat(tempVar3);
			}
			gen = tangible.StringFunctions.changeCharacter(gen, i, gender.charAt(0));
			male[i] = 0.0F;
			female[i] = 0.0F;

		}
		for (i = 0;i < n;i++)
		{
			if (gen.charAt(i) == 'm')
			{
				male[j] = height[i];
				j++;
			}
				else if (gen.charAt(i) == 'f')
				{
					female[k] = height[i];

					k++;
				}
		}

		malenum = j;
		femalenum = k;

		while (j-- != 0)
		{
			for (l = 0;l < j;l++)
			{
				if (male[l] > male[l + 1])
				{
					temp = male[l + 1];
					male[l + 1] = male[l];
					male[l] = temp;
				}
			}
		}

		while (k-- != 0)
		{
			for (l = 0;l < k;l++)
			{
				if (female[l] < female[l + 1])
				{
					temp = female[l + 1];
					female[l + 1] = female[l];
					female[l] = temp;
				}
			}
		}

		for (i = 0;i < malenum;i++)
		{
			System.out.printf("%.2f ",male[i]);
		}
		for (i = 0;i < (femalenum - 1);i++)
		{
			System.out.printf("%.2f ",female[i]);
		}

		System.out.printf("%.2f",female[i]);

		return 0;
	}
}

