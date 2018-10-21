package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int m;
		int[] num = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int temp = 0;
		while (m-- != 0)
		{
			temp = num[n - 1];
			for (i = n - 1;i >= 0;i--)
			{
				num[i + 1] = num[i];
			}
			num[0] = temp;
		}
		System.out.print(num[0]);
		for (i = 1;i < n;i++)
		{
			System.out.print(' ');
			System.out.print(num[i]);
		}
		return 0;
	}


}

