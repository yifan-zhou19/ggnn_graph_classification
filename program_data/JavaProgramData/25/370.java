package <missing>;

public class GlobalMembers
{
	public static int[] num = {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	public static int mul()
	{
		int i;
		int[] temp = new int[101];
		for (i = 0;i < 101;i++)
		{
			temp[i] = 2 * num[i];
		}
		for (i = 0;i < 101;i++)
		{
			if (temp[i] > 9)
			{
				temp[i + 1] += temp[i] / 10;
				num[i] = temp[i] % 10;
			}
			else
			{
				num[i] = temp[i];
			}
		}
		return 0;
	}
	public static int Main()
	{
		int i;
		int n;
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print('1');
			System.out.print("\n");
		}
		else
		{
		for (i = 0;i < n - 1;i++)
		{
			mul();
		}
		for (i = 100;i >= 0;i--)
		{
			if (num[i] != 0)
			{
				a = i;
				break;
			}
		}
		for (i = a;i >= 0;i--)
		{
			System.out.print(num[i]);
		}
		System.out.print("\n");
		}
	return 0;
	}
}

