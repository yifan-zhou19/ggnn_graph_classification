package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int y;
		int r;
		int[] b = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] c = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		int sum = 0;
		int q;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		r = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0))
		{
										for (i = 1;i <= y - 1;i++)
										{
										sum = sum + b[i];
										}
										sum = sum + r;
										System.out.print(sum);
		}
		else
		{
			for (i = 1;i <= y - 1;i++)
			{
										sum = sum + c[i];
			}
										sum = sum + r;
										System.out.print(sum);
		}
		q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}

}

