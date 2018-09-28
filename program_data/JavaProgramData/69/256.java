package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[251]);
		String b = new String(new char[251]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int a1 = a.length();
		int b1 = b.length();
		int[] num1 = new int[251];
		int[] num2 = new int[251];
		int j = 0;
		int i;
		for (i = a1 - 1;i >= 0;i--)
		{
			num1[j] = a.charAt(i) - '0';
			j++;
		}
		j = 0;
		for (i = b1 - 1;i >= 0;i--)
		{
				num2[j] = b.charAt(i) - '0';
				j++;
		}
		j = 0;
		int[] sum = new int[251];
		for (i = 0;i < 251;i++)
		{
			sum[i] = (num1[i] + num2[i] + j) % 10;
			j = (num1[i] + num2[i] + j) / 10;
		}
		for (i = 250;i >= 0;i--)
		{
			if (sum[i] != 0)
			{
				break;
			}
		}
		if (i == (-1))
		{
			System.out.print('0');
		}
		for (j = i;j >= 0;j--)
		{
			System.out.print(sum[j]);
		}
		return 0;
	}
}

