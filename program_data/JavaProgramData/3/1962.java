package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0; //????
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[1000]; //????
		int i = 0; //????
		int c = 0; //??????
		for (i = 0;i < n;i++) //????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int b = 0; //?i??????
		for (i = 0;i < n && c != 250;i++)
		{
			for (b = 0;b < n - i && c != 250;b++)
			{
				if (k == a[i] + a[i + b])
				{
					System.out.print("yes");
					System.out.print("\n");
					c = 250;
				}
			}
		}
		if (c == 0)
		{
			System.out.print("no");
			System.out.print("\n");
		}
		return 0;
	}

}

