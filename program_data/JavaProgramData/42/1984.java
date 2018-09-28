package <missing>;

public class GlobalMembers
{
	//**************************
	//*???????????  **
	//*?????? 1300012863 **
	//*???2013.11.1        **
	//**************************
	public static int Main()
	{
		int n;
		int i;
		int k;
		int j;
		int t;
		int[] a = new int[100020]; //????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		t = n;
		for (i = 1;i <= n;i++) //???????????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= t;i++) //?????????????????
		{
			if (a[i] == k) //?????
			{
				t--;
				for (j = i;j <= t;j++) //????????????
				{
					a[j] = a[j + 1];
				}
				i--;
			}
		}
		for (int m = 1;m <= (t - 1);m++) //????
		{
			System.out.print(a[m]);
			System.out.print(" ");
		}
		System.out.print(a[t]);
		return 0;
	}
}

