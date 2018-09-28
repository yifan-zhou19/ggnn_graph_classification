package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100000];
		int n; //???????????
		int k;
		int i;
		int j;
		int l;
		l = 0; //???????????????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print("\n");
		for (i = 0;i < n;i++) //????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		System.out.print("\n");
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = 0;
		while (i < n)
		{
			   if (a[i] == k) //??????????
			   {
					for (j = i + 1;j < n - l;j++) //???????????
					{
						   a[j - 1] = a[j];
					}
					a[n - l - 1] = 0;
					l = l + 1;
					i = i - 1;
			   }
			   i = i + 1;
		}
		for (i = 0;i < n - l - 1;i++) //??
		{
				System.out.print(a[i]);
				System.out.print(" ");
		}
		System.out.print(a[n - l - 1]);
		return 0;
	}

}

