package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20];
		int i;
		int[] b = new int[20];
		int n;
		a[0] = 1;
		a[1] = 1; //??????????
		for (i = 2;i < 20;i++)
		{
			a[i] = a[i - 1] + a[i - 2];
		} //???????????a[i]
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(a[b[i] - 1]);
			System.out.print("\n");
		} //????????????
		return 0;
	}

}

