package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0; //??????nkijs?????a
		int k = 0;
		int i = 0;
		int j = 0;
		int[] a = new int[1001];
		int s = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++) //???n??
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= n;i++) //?????????????k
		{
			for (j = i + 1;j <= n;j++)
			{
				if (a[i] + a[j] == k) //??????????k
				{
					s = s + 1; //s??1
				}
			}
		}
		if (s == 0) //??s???????????????k?
		{
			System.out.print("no");
			System.out.print("\n");
		}
		else //??s???????????????k?
		{
			System.out.print("yes");
			System.out.print("\n");
		}

		return 0;
	}
}

