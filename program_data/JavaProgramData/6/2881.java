package <missing>;

public class GlobalMembers
{
	//******************************
	//??:???????
	//??:2013.12.6
	//******************************
	public static int Main()
	{
		int p = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		int n = 0;
		int m = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q = null;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (p = 1;p <= k;p++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int sum = 0;
			int[] a = new int[100];
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
				 q = a;
				while (q <= a[n - 1])
				{
					if (i == 0 || i == m - 1)
					{
						sum = sum + *q;
						q++;
					}
					else
					{
						if (q == a[0] || q == a[n - 1])
						{
							sum = sum + *q;
						}
						q++;
					}
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

