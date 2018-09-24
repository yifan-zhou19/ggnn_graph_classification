package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum1 = 0;
		int sum2 = 0;
		int i;
		double[] data1 = new double[50];
		double[] data2 = new double[50];
		double temp;
		String mark = new String(new char[10]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			mark = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (strcmp(mark,"male") == 0)
			{
				data1[sum1++] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
			else
			{
				data2[sum2++] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
		}
		sort(data1,data1 + sum1);
		sort(data2,data2 + sum2);
		for (i = 0;i < sum2 / 2;i++)
		{
			temp = data2[i];
			data2[i] = data2[sum2 - 1 - i];
			data2[sum2 - 1 - i] = temp;
		}
		System.out.printf("%.2f",data1[0]);
		for (i = 1;i < sum1;i++)
		{
			System.out.printf(" %.2f",data1[i]);
		}
		for (i = 0;i < sum2;i++)
		{
			System.out.printf(" %.2f",data2[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

