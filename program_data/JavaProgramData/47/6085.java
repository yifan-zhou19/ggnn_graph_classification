package <missing>;

public class GlobalMembers
{
	//????


	public static int Main()
	{
		int n; //?????i?j?k??????
		int i;
		int j;
		int k;
		int[] a = new int[100]; //????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++) //??????????????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int c; //c?d????????????
		int d;
		for (j = 0;j < (n + 1) / 2;j++) //???????n/2?(n+1)/2???
		{
			c = a[j];
			d = a[n - j - 1];
			a[j] = d;
			a[n - j - 1] = c;
		}
		for (k = 0;k < n - 1;k++) //????
		{
			System.out.print(a[k]);
			System.out.print(" ");
		}
		System.out.print(a[n - 1]);
		return 0;
	}
}

