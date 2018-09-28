package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k; //??????
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		int[] a = new int[100];
		for (i = 0;i < k;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < (k - 1);i++)
		{

			System.out.print(a[(k - i - 1)]);
			System.out.print(" ");
		}
		System.out.print(a[(k - i - 2)]);
		return 0;
	}

}

