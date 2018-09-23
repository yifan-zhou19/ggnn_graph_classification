package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num1 = new int[20];
		int[] num2 = new int[20];
		int m;
		int n;
		int len1;
		int len2;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int temp = m;
		for (len1 = 0;temp >= 1;len1++)
		{
			num1[len1] = temp;
			temp /= 2;
		}
		temp = n;
		for (len2 = 0;temp >= 1;len2++)
		{
			num2[len2] = temp;
			temp /= 2;
		}
		int i = 1;
		while (num1[len1 - i] == num2[len2 - i])
		{
			i++;
		}
		System.out.print(num1[len1 - i + 1]);
		System.out.print("\n");
		return 0;
	}


}

