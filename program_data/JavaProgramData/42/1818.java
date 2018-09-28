package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????????       **
	//*?????? 1300012965      **
	//*???2013.10.30             **
	//********************************
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int m;
		int x;
		int count;
		count = 0;
		int[] a = new int[100000]; //????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= n - 1; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0;j <= n - 1; j++)
		{
			if (a[j] == k) //?????????????
			{
				count++;
			}
			else
			{
				a[j - count] = a[j]; //????????????
			}
		}
		x = 0;
		System.out.print(a[x]);
		for (x = 1; x <= n - count - 1;x++) //????n-1?????????
		{
			System.out.print(" ");
			System.out.print(a[x]);
		}
		System.out.print("\n");
		return 0;
	}
}

