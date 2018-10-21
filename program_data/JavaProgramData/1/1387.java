package <missing>;

public class GlobalMembers
{
	public static int sum = 0; //sum?????????,t??????
	public static int t;
	public static void dg(int s) //?s????
	{
		for (int i = s;i <= t;i++)
		{
			if (t % i == 0) //?i??t??
			{
				t = t / i;
				if (t == 1)
				{
					sum++; //t????,??+1
				}
				else
				{
					dg(i); //??????
				}
				t = t * i;
			}
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0) //??n?
		{
			t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			dg(2);
			System.out.print(sum);
			System.out.print("\n");
			sum = 0;
		}
		return 0;
	}
}

