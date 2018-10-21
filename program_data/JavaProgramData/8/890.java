package <missing>;

public class GlobalMembers
{
	/*
	 *????????.cpp
	 *?????
	 *????: 2012-11-27
	 *??????????????????????????
	 */


	public static void programme()
	{
		int n1;
		int n2;
		int i;
		int j;
		int temp;
		int[] a = new int[101];
		int[] b = new int[101];
		n1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n1; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n2; i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n1; i++)
		{
			for (j = 0; j < n1 - i - 1; j++)
			{
				if (a[j] > a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (i = 0; i < n2; i++)
		{
			for (j = 0; j < n2 - i - 1; j++)
			{
				if (b[j] > b[j + 1])
				{
					temp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = temp;
				}
			}
		}
		for (i = 0; i < n1; i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		for (i = 0; i < n2; i++)
		{
			if (i != n2 - 1)
			{
				System.out.print(b[i]);
				System.out.print(" ");
			}
			else
			{
				System.out.print(b[i]);
			}
		}
		return;
	}

	public static int Main()
	{
		programme();
		return 0;
	}

}

