package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[101]; //????a????10?100?????????
		int[] b = new int[20000];
		int n;
		int i;
		for (i = 0;i < 101;i = i + 1)
		{
			a[i] = 0;
		} //??????0?
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(b[0]);
		a[b[0]] = 1; //???a???1??????
		for (i = 1;i < n;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[b[i]] == 0)
			{
				System.out.print(" ");
				System.out.print(b[i]);
				a[b[i]] = 1;
			}
		} //???????
		return 0;
	} //?????
}

