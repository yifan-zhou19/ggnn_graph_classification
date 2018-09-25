package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		int j = 0;
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
						a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		System.out.print(a[0]);
		for (i = 1;i < n;i++) //????
		{
						for (j = 0;j <= i;j++)
						{
										if (a[i] == a[j]) //?????????????????????j???i??????
										{
										break;
										}
						}
		if (i == j) //???????i?j?????a[i]
		{
		System.out.print(" ");
		System.out.print(a[i]);
		}
		}
	return 0;
	}
}

