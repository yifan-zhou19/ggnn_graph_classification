package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int n;
		double[] array = new double[101];
		double ave;
		double ans;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (;k > 0;--k)
		{
			ave = 0;
			ans = 0;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0;i < n;++i)
			{
				array[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				ave += array[i];
			}
			ave /= n;
			for (i = 0;i < n;++i)
			{
				ans += Math.pow(array[i] - ave,2.0);
			}
			ans /= n;
			ans = Math.sqrt(ans);
			System.out.printf("%.5f\n",ans);
		}
		return 0;
	}

}

