package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int a[300], n, sum = 0;
		int[] a = new int[300];
		int n;
		int sum = 0;
		double ave;
		double[] max = new double[100];
		double c;
		double big = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum += a[i];
		}
		ave = (double)sum / n;
		int s = 0;
		for (int j = 0; j < n; j++)
		{
			c = Math.abs(a[j] - ave);
			if (c == big)
			{
				s++;
				max[s] = a[j];
			}
			if (c > big)
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(max, 0, (Double.SIZE / Byte.SIZE));
				s = 0;
				big = c;
				max[s] = a[j];
			}

		}
		int temp;
		for (int k = 0; k < s; k++)
		{
			for (int p = 0; p < s - k; p++)
			{
				if (max[p] > max[p + 1])
				{
					temp = max[p];
					max[p] = max[p + 1];
					max[p + 1] = temp;
				}
			}
		}
		System.out.print(max[0]);
		for (int q = 1; q <= s; q++)
		{
			System.out.print(',');
			System.out.print(max[q]);
			System.out.print("\n");
		}

		return 0;
	}
}

