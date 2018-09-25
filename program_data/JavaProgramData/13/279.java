package <missing>;

public class GlobalMembers
{
	//**********************
	//file homework 5      *
	// author ??         *
	//data 10/10/29        *
	// ?? ??????? *
	//**********************

	public static int Main()
	{
		int i;
		int n;
		int j;
		int c;
		int[] a = new int[20000];
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < c;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		System.out.print(a[0]);
		for (n = 1; n < c; n++)
		{
			for (j = n - 1; j >= 0; j--)
			{
				if (a[j] == a[n])
				{
			break;
				}
			else
			{
				continue;
			}
			}
			if (j == -1)
			{
				System.out.print(" ");
				System.out.print(a[n]);
			}
		}

		return 0;
	}
}

