package <missing>;

public class GlobalMembers
{
	//*****************************
	//????????????    *
	//?????????          *
	//??????                *
	//??:2010.10.29             *
	//*****************************


	public static int Main()
	{
		int n;
		int j = 0;
		int m = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100000];
		int[] b = new int[100000];
		for (int k = 0 ; k < n ; k++)
		{
			a[k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0 ; i < n ; i++)
		{
			int count = 0;
			for (int l = 0 ; l < i ; l++)
			{
				if (a[l] == a[i])
				{
					count = 1;
					m = m + 1;
					break;
				}

			}
			if (count == 0)
			{
				b[j] = a[i];
				j++;
			}
		}
		for (int h = 0 ; h < (n - m) ; h++)
		{
			if (h == 0)
			{
				System.out.print(b[h]);
			}
			if (h > 0)
			{
				System.out.print(" ");
				System.out.print(b[h]);
			}
		}
		return 0;
	}

}

