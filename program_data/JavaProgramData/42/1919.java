package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100002];
	public static int Main()
	{
		int n;
		int k;
		int i;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			 a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			if (a[i] == k)
			{
				m = i;
			for (i = m;i < n - 1;i++) //??a[n]???k??;
			{
				a[i] = a[i + 1];
			}
			a[i] = 0; //???n???
			i = m - 1; //?????????????;
			n = n - 1; //?????????;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (i < n - 1)
			{
				System.out.print(a[i]);
				System.out.print(' ');
			}
			else if (i == n - 1)
			{
				System.out.print(a[i]);
			}
		}
		return 0;
	}
}

