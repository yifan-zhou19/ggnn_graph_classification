package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k; //?????k??????
		int i;
		int j;
		double[] a = new double[10000]; //???????????X,Y?dissq???????
		double[] b = new double[10000];
		double dissq = 0;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < k;i = i + 1)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < k;i = i + 1)
		{
			for (j = 0;j < k;j = j + 1) //??????????????
			{
				if ((a[j] - a[i]) * (a[j] - a[i]) + (b[j] - b[i]) * (b[j] - b[i]) > dissq)
				{
					dissq = (a[j] - a[i]) * (a[j] - a[i]) + (b[j] - b[i]) * (b[j] - b[i]);
				} //??????????
			}
		}

		System.out.print(Math.sqrt(dissq));
		return 0; //??
	}




}

