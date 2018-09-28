package <missing>;

public class GlobalMembers
{
	//i????? ??l????????? 
	public static int Main()
	{
		int n = 0;
		int k = 0;
		int[] a = new int[100000];
		int i = 0;
		int j = 0;
		int l = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
						 a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = 0;
		while (a[i] != k && i < n)
		{
			i++;
		}
		while (i < n)
		{
				   while (a[i] == k)
				   {
					   i++;
					   j++;
				   }
				   a[i - j] = a[i];
				   i++;
		}
		l = n - j;
		for (i = 0;i < l - 1;i++)
		{
		   System.out.print(a[i]);
		   System.out.print(' ');
		}
		System.out.print(a[l - 1]);
		return 0;

	}

}

