package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int m;
		int t;
		int[] a = new int[100001];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n ; i++)
		{
			  a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		t = 0;
		for (i = 1; i <= n; i++)
		{
			 if (a[i] == k)
			 {
			 t = t + 1;
			 }
			 else
			 {
			 a[i - t] = a[i];
			 }
		}
		System.out.print(a[1]);
		for (i = 2; i <= n - t; i++)
		{
			 System.out.print(" ");
			 System.out.print(a[i]);
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}




}

