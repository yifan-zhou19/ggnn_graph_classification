package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int a;
		double num = 0;
		float[] x = new float[100];
		float sum = 0F;
		float b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n > 0)
		{
			sum = 0F;
			num = 0;
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a = Integer.parseInt(tempVar2);
				}
		for (i = 0;i < a;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x[i] = Float.parseFloat(tempVar3);
			}
		}
		for (i = 0;i < a;i++)
		{
			sum += x[i];

		}
		b = sum / a;
		for (i = 0;i < a;i++)
		{
			num += Math.pow((x[i] - b),2);
		}

			System.out.printf("%0.5lf\n",Math.sqrt(num / a));

		n--;
		}
		return 0;
	}




}

