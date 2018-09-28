package <missing>;

public class GlobalMembers
{
	//********************************
	//*????????    **
	//*?????? 1300012887 **
	//*???2013.12.5 **
	//********************************
	public static int n;
	public static int i;
	public static int k;
	public static int a;
	public static int m(int number, int k1) //????m????????
	{
		if (number == n) //????n??????i?
		{
			return i;
		}
		if (m(number + 1, k1) != 0 && m(number + 1, k1) % (n - 1) == 0)
		{
			return n * m(number + 1, k1) / (n - 1) + k; //??????????
		}
		return 0;
	}

	public static int Main() //?????
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = n + k; ;i += n)
		{
			a = m(1, i);
			if (a != 0)
			{
				System.out.print(a);
				System.out.print("\n");
				break;
			}
		}
		return 0;
	}

}

