package <missing>;

public class GlobalMembers
{
	public static int[] num = new int[200];
	public static int len = 0;
	public static int plusbig()
	{
		int i;
		for (i = 0;i < len;i++)
		{
			num[i] += num[i];
		}
		for (i = 0;i < len - 1;i++)
		{

			if (num[i] >= 10)
			{
				num[i + 1]++;
				num[i] = num[i] % 10;
			}
		}
		if (num[len - 1] >= 10)
		{
			num[len - 1] = num[len - 1] % 10;
			num[len] = 1;
			len++;
		}
		return 0;
	}
	public static int Main()
	{
		int i;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		len = 1;
		num[0] = 1;
		for (i = 0;i < n;i++)
		{
			plusbig();
		}
		for (i = len - 1;i >= 0;i--)
		{
			System.out.print(num[i]);
		}
		return 0;
	}
}

