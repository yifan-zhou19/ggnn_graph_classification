package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[10000];
		while (n > 1)
		{
			count++;
			if (n % 2 == 0)
			{
				System.out.printf("%d/2=%d\n",n,n / 2);
				a[count] = 1,n = n / 2;
			}
			else
			{
				System.out.printf("%d*3+1=%d\n",n,n * 3 + 1);
				a[count] = 2,n = n * 3 + 1;
			}
		}
		System.out.print("End");


		return 0;
	}

}

