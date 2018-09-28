package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int sum = 0;
		int sum2 = 0;
		for (i = 0;i < n + 1;i++)
		{

			sum2 = sum2 + i * i;
			if ((i % 7 == 0) || (i >= 70 && i <= 79) || (i>10 && i % 10 == 7))
			{
			sum = sum + i * i;
			}
		}
		   System.out.print(sum2 - sum);
		return 0;
	}
}

