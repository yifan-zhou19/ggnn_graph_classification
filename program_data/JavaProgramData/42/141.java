package <missing>;

public class GlobalMembers
{
	//*********************************************************
	//*????????????                               *
	//*?  ?????                                         *
	//*?????2010.10.29.                                  *
	//*??????????????????                   *
	//*********************************************************
	public static int Main()
	{
		int n; //?????n???i?????
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100000]; //??????
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int k;
		int t;
		int count = 0;
		for (k = 0, t = 0; t < n; t++)
		{
			if (a[t] != m) //??a[t]?????????????a[k]?
			{
				a[k] = a[t];
				k++;
			}
			else
			{
				count++; //????????
			}
		}
		for (i = 0; i < n - count; i++) //??n-count??
		{
			if (i == n - count - 1)
			{
				System.out.print(a[i]);
				System.out.print("\n");
			}
			else
			{
				System.out.print(a[i]);
				System.out.print(" ");
			}
		}
		return 0;
	}
}

