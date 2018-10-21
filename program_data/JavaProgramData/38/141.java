package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
		double[] a = new double[100]; //??????????????
		double[] p;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0) //?????
		{
			p = a;
			double sum = 0;
			double num = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(p,0,(Double.SIZE / Byte.SIZE));
			for (i = 0;i < n;i++)
			{
				p[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < n;i++) //?????
			{
				sum = sum + p[i];
			}
			sum = sum / (double)n;
			for (i = 0;i < n;i++)
			{
				num = num + (p[i] - sum) * (p[i] - sum); //?????
			}
			num = num / (double)n;
			num = Math.sqrt(num);
			System.out.printf("%.5f\n",num); //???
		}
		return 0;
	}

}

