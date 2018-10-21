package <missing>;

public class GlobalMembers
{
	//****************************************
	//*???????????    **
	//*??????  1100012927       **
	//*???2011.10.22                          **
	//*****************************************

	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			if (a[i] == k)
			{
				j = i;
				for (; i < n;i++)
				{
					a[i] = a[i + 1];
				}
				n--;
				i = j - 1;
			}
		}
		for (i = 0; i < n; i++)
		{
			if (i < n - 1)
			{
			System.out.print(a[i]);
			System.out.print(" ");
			}
			else
			{
				System.out.print(a[i]);
			}
		}
		return 0;
	}

}

