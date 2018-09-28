package <missing>;

public class GlobalMembers
{
	/*
	 * ??????????
	 * ?????2011?11?14?
	 * ??????
	 * ?????
	 */
	public static int Main()
	{ //?????
	int i; //????
	int j;
	int k;
	int m;
	int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (n == 1)
	{
		System.out.print("1");
		System.out.print("\n");
	 return 0;
	} //???????? ??????
	for (i = 1;;i++)
	{
		  m = i * n + k;
	   for (j = 1;j <= n - 1;j++)
	   {
		if (m % (n - 1) == 0)
		{
		if (j == (n - 1))
		{
		System.out.print((n * m / (n - 1) + k));
		System.out.print("\n");
		return 0;
		}
		m = n * m / (n - 1) + k;
		continue;
		}
	else
	{
		break;
	}
	   }
	}
	return 0;
	} //?????
}

