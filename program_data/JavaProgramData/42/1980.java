package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100010]; //??????
		int n;
		int k;
		int i;
		int s;
		int del = 0;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++) //???????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++) //????????
		{
			if (a[i] == k) //?????????????
			{
				for (j = i;j <= n;j++) //??????????
				{
					a[j] = a[j + 1];
				}
					i = i - 1;
				del++; //???????
			}
		}
				for (i = 1;i < n - del;i++) //???
				{
					System.out.print(a[i]);
					System.out.print(' ');
				}
					System.out.print(a[i]);
	}

}

