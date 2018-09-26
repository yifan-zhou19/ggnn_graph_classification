package <missing>;

public class GlobalMembers
{
	//********************************
	//*???5.??2?N?? **
	//*?????? 1300017623 **
	//*???2013.11.13  **
	//********************************
	public static int Main()
	{
		int n;
		int flag = 0;
		int tag = 0;
		int[] a = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (; n > 0; n--)
		{
			for (int i = 0; i < 100; i++)
			{
				a[i] *= 2;
				if (flag != 0)
				{
					a[i]++;
				}
				flag = 0;
				if (a[i] > 9)
				{
					flag = 1;
					a[i] -= 10;
				}
			}
		}
		for (int i = 99; i >= 0; i--)
		{
			if (a[i] != 0 || tag != 0)
			{
				tag = 1;
				System.out.print(a[i]);
			}
		}
			return 0;
	}
}

