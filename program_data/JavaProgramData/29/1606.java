package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int n;
		double[] a = new double[100]; //????
		double[] b = new double[100];
		double sum;
		a[0] = 1;
		a[1] = 2; //??
		for (i = 2;i < 100;i++)
		{
			a[i] = a[i - 1] + a[i - 2]; //???????
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
			sum = 0;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < n;j++)
			{
			sum = sum + (a[j + 1] / a[j]); //????
			}
		   b[i] = sum;
		}
		for (i = 0;i < m;i++)
		{
			 System.out.printf("%.3f",b[i]); //????????
			 System.out.print("\n");
		}
		return 0;

	}
}

