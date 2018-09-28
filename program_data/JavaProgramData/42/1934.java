package <missing>;

public class GlobalMembers
{
	//********************************
	//*??????????? **
	//*?????1300062805 **
	//*???2013.11.1 **
	//********************************
	public static int Main()
	{
		int n;
		int k;
		int i;
		int m = 0;
		int j;
		int[] a = new int[100001];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++) // ????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = 0;
		do
		{
			if (a[i] == k) // ???????????
			{
		m++; // ??????????????????
				for (j = i + 1; j < n; j++)
				{
					a[j - 1] = a[j];
				}
			}
			while (a[i] != k) // ?????????????
			{
			i++;
			}
		}while (i < n - m);
		for (i = 0; i < n - m - 1 ; i++) // ????
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
			System.out.print(a[n - m - 1]);
		return 0;
	}

}

