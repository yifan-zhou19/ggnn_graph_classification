package <missing>;

public class GlobalMembers
{
	//????010.cpp
	//??????
	//?????2013?10?27?
	//?????


	public static int Main()
	{
		int[] a = new int[100];
		int i;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i = i + 1)
		{
			a[n - 1 - i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i = i + 1)
		{
			System.out.print(a[i]);
			if (i == n - 1)
			{
				break;
			}
			System.out.print(' ');
		}
		return 0;
	}


}

