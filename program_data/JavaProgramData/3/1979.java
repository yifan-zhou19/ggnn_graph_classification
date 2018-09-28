package <missing>;

public class GlobalMembers
{
	// ???K?????
	// ?????????
	// ???2012.10.24 
	public static int Main() //???
	{
		int n; //?????s????t???
		int k;
		int i;
		int j;
		int s;
		int t = 0;
		int[] a = new int[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		} //???????
		for (i = 0;i < n - 1;i++)
		{
			for (j = 1;j < n;j++)
			{
				s = a[i] + a[j];
				if (s == k)
				{
					t = t + 1;
				}
			}
		} //????????k???
		if (t == 0)
		{
			System.out.print("no");
			System.out.print("\n");
		}
		else
		{
			System.out.print("yes");
			System.out.print("\n");
		}
		return 0;
	}

}

