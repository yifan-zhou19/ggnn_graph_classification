package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //sgn??????1????0
		int i;
		int[] sgn = new int[100];
		double sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++) //???????
		{
			if (i % 7 == 0)
			{
			sgn[i] = 0;
			}
			else if (i > 10 && (i / 10) == 7)
			{
				sgn[i] = 0;
			}
			else if (i > 10 && (i - (i / 10) * 10) == 7)
			{
				sgn[i] = 0;
			}
			else //??????
			{
				sgn[i] = 1;
			}
		}
		for (i = 1;i <= n;i++)
		{
			sum += i * i * sgn[i];
		}
		System.out.print(sum);
		return 0;
	}
}

