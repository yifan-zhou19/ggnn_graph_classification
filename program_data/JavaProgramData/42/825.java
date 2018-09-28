package <missing>;

public class GlobalMembers
{
	/**
	* @file 1.cpp
	* @author ???
	* @date 2011-10?14
	* @description
	* ??????:??????
	*/
	public static int Main()
	{
		int n;
		int[] a = new int[100000];
		int i;
		int j;
		int k;
		int l;
		int dn;
		int ct;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ct = n;
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		dn = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = n - 1 ; j >= 0; j--)
		{
			if (a[j] == dn)
			{
				ct--;
				for (l = j; l < n; l++)
				{
					a[l] = a[l + 1];
				}
			}
		}
		for (k = 0; k < ct ; k++)
		{
			if (k != (ct - 1))
			{
				System.out.print(a[k]);
				System.out.print(' ');
			}
			else
			{
				System.out.print(a[k]);
			}
		}
		return 0;
	}

}

