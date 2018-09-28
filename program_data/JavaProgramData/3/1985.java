package <missing>;

public class GlobalMembers
{
	public static int Main() //?????
	{
		int n; //???? ???
		int k;
		int[] a = new int[1000];
		int q = 0;
		int w = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++) //????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		do
		{
			for (int i = q + 1;i < n;i++) //?????
			{
				if (a[q] + a[i] == k)
				{
					System.out.print("yes");
					w++;
					break;
				}
			}
			q++;
		} while (w != 1 && q < n - 1);
		if (w == 0)
		{
			System.out.print("no");
		}
		return 0; //????
	}


}

