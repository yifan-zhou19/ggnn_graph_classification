package <missing>;

public class GlobalMembers
{
	//????
	public static double sum(tangible.RefObject<Double> n, int N)
	{
		double sum = 0;
		for (int i = 0;i < N;i++)
		{
			sum += *(n.argValue + i);
		}
		return sum;
	}

	//??????
	public static double average(tangible.RefObject<Double> n, int N)
	{
		return sum(n, N) / N;
	}

	//?????
	public static double s(tangible.RefObject<Double> n, int N)
	{
		double a = average(n, N);
		double sum2 = 0;
		for (int i = 0;i < N;i++)
		{
			sum2 += (a - *(n.argValue + i)) * (a - *(n.argValue + i));
		}
		return Math.pow(sum2 / N,0.5);
	}

	//?????????????
	public static int Main()
	{
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (m-- != 0)
		{
			int N;
			N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			double[] n = new double[N];
			for (int i = 0;i < N;i++)
			{
				n[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
		tangible.RefObject<Double> tempRef_n = new tangible.RefObject<Double>(n);
			System.out.printf("%.5f", s(tempRef_n, N));
			n = tempRef_n.argValue;
			System.out.printf("%.5f", "\n");
		}
	}










}

