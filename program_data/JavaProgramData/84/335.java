package <missing>;

public class GlobalMembers
{
	public static int Main() //?????
	{ //?????
		int[] a = new int[100]; //?????????
		int i = 0;
		int j = 0;
		int p = 0;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++) //??a[1]?a[n]
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 1;j <= n - 1;j++) //?????????
		{
			for (i = 1;i <= n - j;i++) //????
			{
				if (a[i] < a[i + 1]) //?a[i]<a[i+1]
				{
					p = a[i]; //?a[i]?a[i+1]??
					a[i] = a[i + 1];
					a[i + 1] = p;
				}
			}
		}
		System.out.print(a[1]);
		System.out.print("\n");
		System.out.print(a[2]);
		System.out.print("\n");
		return 0; //???????????????????
	} //????
}

