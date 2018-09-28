package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int rd;
		int n;
		int i;
		double[] x;
		double plus;
		double avex;
		double output;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (rd = 0;rd < k;rd++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			plus = 0;
			output = 0;
			x = new double[n];
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[i] = Double.parseDouble(tempVar3);
				}
				plus += x[i];
			}
			avex = plus / n;
			for (i = 0;i < n;i++)
			{
				output += Math.pow(x[i] - avex,2);
			}
			System.out.printf("%.5f\n",Math.sqrt((output / n)));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(x);
		}
		return 0;
	}
}

