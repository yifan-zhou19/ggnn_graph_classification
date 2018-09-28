package <missing>;

public class GlobalMembers
{
	//name?????????
	//author:??
	//created on:2011.10.26
	public static int Main()
	{
		int n;
		int i = 0;
		int j;
		int k;
		int m = 0;
		int flag = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (i = 0; i < n; i++)
		{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			while (a[i] == k)
			{
				  for (j = i; j < n; j++)
				  {
					a[j] = a[j + 1];
				  }
					m++;
			}
		}
		System.out.print(a[0]);
		for (i = 1; i < (n - m); i++)
		{
		System.out.print(" ");
		System.out.print(a[i]);
		}
		return 0;
	}

}

