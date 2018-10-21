package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //??????n,i,p
		int i;
		int p;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n + 1]; //??????
		for (i = 1;i <= n;i++) //??
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		if (n % 2 == 0) //?n???
		{
			for (i = 1;i <= n / 2;i++) //i?1????i<=n/2,??????
			{
				p = a[i]; //?a[i]?a[n-i+1]??
				a[i] = a[n - i + 1];
				a[n - i + 1] = p;
			}
		}
		else //?n???
		{
			for (i = 1;i <= (n - 1) / 2;i++) //i?1????i<=?n-1?/2,??????
			{
				p = a[i]; //?a[i]?a[n-i+1]??
				a[i] = a[n - i + 1];
				a[n - i + 1] = p;
			}
		}
		for (i = 1;i <= n;i++) //??
		{
			if (i == 1) //?i=1
			{
				System.out.print(a[i]);
			}
			else //??
			{
				System.out.print(' ');
				System.out.print(a[i]);
			}
		}
		return 0;
	}
}

