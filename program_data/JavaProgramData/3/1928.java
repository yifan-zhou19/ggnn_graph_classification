package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int[] a = new int[1001];
		int j;
		int i;
		int count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++) //???a[i]????????
			{
				if (a[i] + a[j] == k)
				{
					count = count + 1; //??????
				}
			}
		}
			if (count == 0) //?????
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

