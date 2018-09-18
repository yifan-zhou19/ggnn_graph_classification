package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] t = {1, 10, 100, 1000, 10000};
		int[] x = new int[6];

		int num;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		int length; //length??num???
		length = (num >= t[4]) + (num >= t[3]) + (num >= t[2]) + (num >= t[1]) + (num >= t[0]);
		for (int i = 1 ; i <= length ; i++)
		{
			x[i] = (num % t[i]) / t[i - 1];
		}

		if (length == 0)
		{
			System.out.print("0");
		}
		else
		{
		for (int j = 1 ; j <= length ; j++)
		{
			System.out.print(x[j]);
		}
		}
		return 0;
	}
}

