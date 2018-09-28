public class A
{
	public double data;
	public double differences;
}

package <missing>;

public class GlobalMembers
{
	public static A[] a = tangible.Arrays.initializeWithDefaultAInstances(300 + 10);
	public static A temp = new A();

	public static int n;

	public static double getaverage(int n)
	{
		double sum = 0;
		for (int i = 0;i <= n - 1;i++)
		{
		sum += a[i].data;
		}
		return sum / n;
	}
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i <= n - 1;i++)
		{
		a[i].data = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		double average = getaverage(n);
		for (int i = 0;i <= n - 1;i++)
		{
			a[i].differences = a[i].data - average;
			if (a[i].differences < 0)
			{
				a[i].differences = -a[i].differences;
			}
		}
		for (int i = 0;i <= n - 1;i++)
		{
			for (int j = n - 1;j > i;j--)
			{
				if (a[i].differences < a[j].differences)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=a[i];
					temp.copyFrom(a[i]);
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		double[] output = new double[300 + 10];
		output[0] = a[0].data;
		int k = 0;
		for (int i = 1;i <= n - 1;i++)
		{
			if (a[i].differences == a[0].differences)
			{
			output[++k] = a[i].data;
			}
		}

		for (int i = 0;i <= k;i++)
		{
			for (int j = k;j >= i;j--)
			{
				if (output[i] > output[j])
				{
					double temp1 = output[i];
					output[i] = output[j];
					output[j] = temp1;
				}
			}
		}

		for (int i = 0;i <= k - 1;i++)
		{
		System.out.print(output[i]);
		System.out.print(",");
		}
		System.out.print(output[k]);
		System.out.print("\n");

		return 0;
	}

}

