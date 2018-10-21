package <missing>;

public class GlobalMembers
{
	//********************************
	//*??????? **
	//*?????1300062805 **
	//*???2013.10.27 **
	//********************************
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a;
		int b;
		int m = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n;)
		{
			j = 0;
			while ((a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
			{
				i++;

			if ((a >= 90) && (140 >= a) && (b >= 60) && (90 >= b))
			{
				j++;
			}
			else
			{
				break;
			}
			if (j > m)
			{
				m = j;
			}
			}
		}
		System.out.print(m);
		System.out.print("\n");
		return 0;
	}

}

