package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	char[] a = {'0', '0', '0', '0', '0', '0', '0'};
	a = ConsoleInput.readToWhiteSpace(true).charAt(0);
	int ava = 0;
	for (int j = 6;j >= 0;j--)
	{
		if (ava == 1)
		{
			System.out.print(a[j]);
		}
			if (a[j] != '0')
			{
			ava = 1;
			}
	}
	return 0;
	}


}

