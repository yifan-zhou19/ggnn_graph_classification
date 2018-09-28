package <missing>;

public class GlobalMembers
{
	//* ????2??m???
	   //* ????
	//*****
	public static int susucheck(int a)
	{
		int j;
		int flag = 1;
		int l;
	for (j = 2;;j++)
	{
		if (j * j <= a)
		{
			l = a / j;
			if (l * j == a)
			{
				flag = 0;
			}
		}
	else
	{
		break;
	}
	}
	return flag;
	}
	public static int Main()
	{
		int m;
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int k;
	int i;
	for (k = 2;k <= m / 2;k++)
	{
			if (susucheck(k) != 0 && susucheck(m - k) != 0)
			{


		System.out.print(k);
		System.out.print(' ');
		System.out.print(m - k);
		System.out.print("\n");
			}
	}
	return 0;

	}
}

