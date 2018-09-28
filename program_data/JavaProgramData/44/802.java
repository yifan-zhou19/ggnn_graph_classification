package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		if (num == 0)
		{
			return 0;
		}
		int[] a = new int[70];
		int count = 0;
		if (num > 0)
		{
			while (num > 0)
			{
				a[count] = num % 10;
				num /= 10;
				count++;
			}
			for (int i = 0; i < count; i++)
			{
				num *= 10;
				num += a[i];
			}
			return num;
		}
		if (num < 0)
		{
			num *= -1;
			while (num > 0)
			{
				a[count] = num % 10;
				num /= 10;
				count++;
			}
			for (int i = 0; i < count; i++)
			{
				num *= 10;
				num += a[i];
			}
			num *= -1;
			return num;
		}
	}

	public static int Main()
	{
		final int line = 6;
		int num = 0;
		for (int i = 0; i < line; i++)
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			num = reverse(num);
			System.out.print(num);
			System.out.print("\n");
		}
		return 0;
	}
}

