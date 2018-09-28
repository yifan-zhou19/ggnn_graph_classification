package <missing>;

public class GlobalMembers
{
	/**
	* @file 1.cpp
	* @author ???
	* @date 2011-09-24
	* @description
	* ??????:?????
	*/

	// ??????pai???
	public static int pai(String xiao, int n, int v, int i)
	{
		int j;
		int k;
		if (xiao[i + 1].equals(0))
		{
			return 0;
		}
		for (j = i + 1; !xiao[j].equals(0); j++)
		{
			if (xiao[j].equals(v))
			{
				break;
			}
		}
		for (k = j; !xiao[k].equals(0); k--)
		{
			if (xiao[k].equals(n))
			{
				xiao[k] = 1;
				break;
			}
		}
		System.out.print(k);
		System.out.print(' ');
		System.out.print(j);
		System.out.print("\n");
		pai(xiao, n, v, j);
		return 0;
	}

	public static int Main()
	{
		int n;
		int i;
		int v;
		char[] xiao = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		xiao = ConsoleInput.readToWhiteSpace(true).charAt(0);
		n = xiao[0];
		for (i = 1; i <= 100; i++)
		{
			if (xiao[i] != n)
			{
				v = xiao[i];
				break;
			}
		}
		pai(xiao, n, v, i - 1);
		return 0;
	}
}

