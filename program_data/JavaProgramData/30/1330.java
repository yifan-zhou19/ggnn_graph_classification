package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int x;
		int sum;
		sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			x = 0;
			if (i % 7 == 0)
			{
				x = 1;
			}
			if (i % 10 == 7)
			{
				x = 1;
			}
			if (i / 10 == 7)
			{
				x = 1;
			}
			if (x == 0)
			{
			   sum += i * i;
			  // cout<<i<<endl;
			}
		}
		System.out.print(sum);
		return 0;
	}

}

