package <missing>;

public class GlobalMembers
{
	public static int work() //????;
	{
		int i; //????,????????;
		int n;
		int k;
		int[] a = new int[100];
		for (i = 0;i < 100;i++)
		{
			a[i] = 0;
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = k;
		do
		{
			a[0] = a[0] + n; //????????? ;
			for (i = 1;i < n;i++)
			{
				a[i] = a[i - 1] * n / (n - 1) + k; //?????????? ;
				if (a[i] % n != k)
				{
					break; //???I?????????N??????N??;
				}
			}
		}while (a[n - 1] % n != k); //?????????;
		System.out.print(a[n - 1]);
		System.out.print("\n");
		return 0;
	}
	public static int Main() //???;
	{
		work();
		return 0;
	}


}

