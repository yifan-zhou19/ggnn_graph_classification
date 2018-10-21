package <missing>;

public class GlobalMembers
{
	//***********************************
	//*????7????????1045? **
	//*?????? 1200012945         **
	//*???2012.10.8                 **
	//***********************************

	public static int Main()
	{

		int i;
		int sum;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sum = 0;
		for (i = 1; i <= n; i++)
		{
			if (i % 7 != 0)
			{
		if ((i - 7) % 10 != 0)
		{
		if (i - 70 < 0 || i - 70 >= 10)
		{
		sum = sum + i * i;
		}
		}
			}
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;

	}
}

