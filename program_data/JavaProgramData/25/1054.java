package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[200];
		int i;
		int flag = 0;
		a[199] = 1;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n != 0)
		{
			flag = 0;
			for (i = 199; i >= 0; i--)
			{
				if (a[i] * 2 >= 10)
				{
					a[i] = a[i] * 2 - 10 + flag;
					flag = 1;
				}
				else
				{
					a[i] = a[i] * 2 + flag;
					flag = 0;
				}
			}
			n--;
		}
		for (i = 0; a[i] == 0; i++)
		{
		}
		for (;i <= 199; i++)
		{
			System.out.print(a[i]);
		}

		return 0;
	}


}

