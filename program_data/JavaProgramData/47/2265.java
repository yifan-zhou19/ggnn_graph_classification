package <missing>;

public class GlobalMembers
{
	//????
	//???
	//2012-11-04
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n]; //????
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0,j = n - 1;i <= j;i++,j--)
		{ //??????????
			m = a[i];
			a[i] = a[j];
			a[j] = m;
		}
		System.out.print(a[0]);
		for (i = 1;i < n;i++)
		{
			System.out.print(" ");
			System.out.print(a[i]);
		}
		return 0;
	}

}

