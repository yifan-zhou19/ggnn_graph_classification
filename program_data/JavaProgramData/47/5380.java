package <missing>;

public class GlobalMembers
{
	/*??????*/
	public static int Main()
	{
		int n;
		int[] num = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int t;
		for (i = 0;i < n;i++) //????num
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0,j = n - 1;i <= (n - 1) / 2;i++,j--) //??????
		{
			t = num[i];
			num[i] = num[j];
			num[j] = t;
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.print(num[i]);
			System.out.print(" ");
		}
		System.out.print(num[n - 1]);
		System.out.print("\n");
		return 0;
	}
}

