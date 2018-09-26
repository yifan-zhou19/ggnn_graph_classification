package <missing>;

public class GlobalMembers
{
	/*???:????
	**???:??
	**?  ?:2010?12?11?
	*/
	public static int Main()
	{
		int i;
		int j;
		int n;
		int flag = 0;
		int[] know = new int[10000]; //???????
		int[] count = new int[10000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while ((i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (i == 0 && j == 0)
			{
				break;
			}
			know[i]++; //i????,+1
			count[j]++; //j???,+1
		}
		for (i = 0; i < n; i++)
		{
			if (know[i] == 0 && count[i] == n - 1) //????i??i???????,????????
			{
				System.out.print(i);
				System.out.print("\n");
				flag = 1; //??
			}
		}
		if (flag == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}
}

