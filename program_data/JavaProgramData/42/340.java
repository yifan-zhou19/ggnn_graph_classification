package <missing>;

public class GlobalMembers
{
	//????????
	public static int Main()
	{
		int[] a = new int[100001]; //b????????n??????a[]???,
		int b;
		int n;
		int k = 0;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i <= n - 1;i++) //?????????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0;j <= (n - 1);j++) //???????????????????
		{
			if (a[j] != b)
			{
				System.out.print(a[j]);
				break;
			}
		}
		for (int l = j + 1;l <= (n - 1);l++) //???????????
		{
			if (a[l] != b)
			{
				System.out.print(" ");
				System.out.print(a[l]);
			}
		}
	return 0;
	}

}

