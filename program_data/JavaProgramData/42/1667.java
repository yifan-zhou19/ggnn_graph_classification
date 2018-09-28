package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0; //n?????????,i?????,??k?????
		int i = 0;
		int k = 0;
		int c = 0; //c?????????????????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] num = new int[n]; //??????
		for (i = 0;i <= n - 1;i++)
		{
			k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			num[i] = k;
		}
		int del; //del??????
		del = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n - 1;i++)
		{
			if (num[i] != del)
			{
			  c = i;
			}
		} //??c??
		for (i = 0;i <= c - 1;i++)
		{
			if (num[i] != del)
			{
				System.out.print(num[i]);
				System.out.print(" ");
			}
		} //??num[c]????????
		System.out.print(num[c]);
		return 0;
	}

}

