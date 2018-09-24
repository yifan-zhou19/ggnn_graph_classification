package <missing>;

public class GlobalMembers
{
	/*
	?????
	???2010?10?29?
	??????????
	????????? ????????
	*/
	public static int Main()
	{
		int n;
		int i;
		int b;
		int t;
		int k;
		int d;
		int j;
		int s = 0;
		int[] a = new int[100000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (d = 0;d <= n - 1;d++)
		{
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[d] = b;
		} //?????????
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n - 1 - s;)
		{
			if (t == a[i]) //??????
			{
				s++;
				for (j = i;j <= n - 1;j++)
				{
					a[j] = a[j + 1]; //???????
				}
				i--;
			}
			else
			{
				i++;
			}
		}
		System.out.print(a[0]);
		for (k = 1;k < n - s;k++)
		{
			System.out.print(" ");
			System.out.print(a[k]);
		} //??????????
		return 0;
	}

}

