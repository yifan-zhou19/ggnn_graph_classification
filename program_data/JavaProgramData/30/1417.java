package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int sum = 0;
		int shi;
		int ge;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		shi = n / 10;
		ge = n - 10 * shi;
		for (i = 1;i <= n;i++)
		{
		 shi = i / 10;
		 ge = i - 10 * shi;
		 if (i % 7 != 0 && shi != 7 && ge != 7)
		 {
		 sum = sum + i * i;
		 }
		}
		System.out.print(sum);
		return 0;
	}

}

