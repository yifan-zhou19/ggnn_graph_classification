package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String sex = new String(new char[7]);
		float[] high = new float[40];
		float[] male = new float[40];
		float[] female = new float[40];
		float temp;
		int m = 0;
		int f = 0;
		int i;
		int j;
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
							sex = tempVar2.charAt(0);
						}
						String tempVar3 = ConsoleInput.scanfRead();
						if (tempVar3 != null)
						{
							high[i] = Float.parseFloat(tempVar3);
						}
						if (sex.charAt(0) == 'm')
						{
						male[m++] = high[i];
						}
						else
						{
						female[f++] = high[i];
						}
		}

		for (i = 1;i < m;i++)
		{
		for (j = 1;j < m - i + 1;j++)
		{
		if (male[j - 1] > male[j])
		{
							 temp = male[j - 1];
							 male[j - 1] = male[j];
							 male[j] = temp;
		}
		}
		}
		for (i = 1;i < f;i++)
		{
		for (j = 1;j < f - i + 1;j++)
		{
		if (female[j - 1] > female[j])
		{
							 temp = female[j - 1];
							 female[j - 1] = female[j];
							 female[j] = temp;
		}
		}
		}

		for (i = 0;i < m;i++)
		{
		System.out.printf("%.2f ",male[i]);
		}

		for (i = f - 1;i >= 0;i--)
		{
			System.out.printf("%.2f",female[i]);
		if ((i) != 0)
		{
		System.out.print(" ");
		}
		}
		System.in.read();
		System.in.read();
		System.in.read();
		return 0;

	}

}

