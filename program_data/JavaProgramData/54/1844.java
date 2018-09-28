package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int[] a = new int[100];
		int m;
		int n;
		int k;
		int i;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		a[n] = n + k;

		for (a[n] = n + k;;a[n] = a[n] + n)

		{

		 for (i = n;i >= 2;i--)

		 {

			 if (a[i] % (n - 1) != 0)
			 {

				break;
			 }

			a[i - 1] = a[i] * n / (n - 1) + k;

		 }

		 if (a[1] == 0)
		 {

			 continue;
		 }

		 else
		 {

			 break;
		 }

		}

		System.out.print(a[1]);

		return 0;

	}
}

