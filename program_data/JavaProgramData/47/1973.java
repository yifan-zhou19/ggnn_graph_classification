package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100]; //??????
		int n;
		int i;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = n - 1;i >= 0;i--) //???????????
		{
			t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i] = t;
		}
		for (i = 0;i < n - 1;i++) //????
		{
			System.out.print(a[i]);
			System.out.print(' ');
		}
			System.out.print(a[n - 1]);
			return 0;
	}

}

