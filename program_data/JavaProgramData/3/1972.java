package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //??????
		int k;
		int i;
		int p;
		int q;
		int sum;
		int s = 0;
		int[] a = new int[1000]; //??????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++) //????a[1000]
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (p = 1;p < n;p++) //?????
		{
			for (q = 0;q < p;q++)
			{
				sum = a[p] + a[q];
				if (sum == k)
				{
					s = s + 1;
				}
			}
		}
		if (s != 0) //?????
		{
			System.out.print("yes");
			System.out.print("\n");
		}
		else
		{
			System.out.print("no");
			System.out.print("\n");
		}
		return 0;
	}


}

