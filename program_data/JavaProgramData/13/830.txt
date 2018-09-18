package <missing>;

public class GlobalMembers
{
	/*
	*????111019 02.cpp
	*??????
	*?????2011-10-19
	*????????????
	*/

	public static int Main()
	{
		int i; //????
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n]; //????
		for (i = 0;i < n;i++) //????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n - 1;i++) //?????????????????
		{
			for (int j = i + 1;j < n;j++)
			{
				if (a[j] == a[i])
				{
				for (int k = j;k < n;k++)
				{
						a[k] = a[k + 1];
				} //?????????????????????
					n = n - 1;
					j = j - 1;
				}
				else
				{
					continue; //??????
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
			System.out.print(a[n - 1]);
			System.out.print("\n");
		return 0;
	}
}

