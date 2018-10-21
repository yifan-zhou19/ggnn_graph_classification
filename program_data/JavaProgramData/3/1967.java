package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int t = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int ia = 0,ib = 1;ia < n - 1;ia++)
		{
			for (ib = ia + 1;ib < n;ib++)
			{
				if (a[ia] + a[ib] == k)
				{
					System.out.print("yes");
					t = 1; //t????????t=1???????�yes�
					break; //???�yes�???????
				}
			}
			if (t == 1)
			{
				break; //?????????????????t???
			}
		}
		if (t == 0)
		{
			System.out.print("no");
		}
		return 0;
	}

}

