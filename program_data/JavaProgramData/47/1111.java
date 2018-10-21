package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100]; //??a???????n??????
		int n;
		int i;
		int j;
		int k;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = n - 1;j >= 0;j--)
		{
			for (k = 0;k < j;k++)
			{
			 {
				 t = a[n - k - 1];
				 a[n - k - 1] = a[n - k - 2];
				 a[n - k - 2] = t;
		 } //?????????????
			}

		}
		for (i = 0;i < n;i++)
		{
			System.out.print(a[i]);
			if (i != n - 1)
			{
				System.out.print(" ");
			}
		}
		return 0;

	}
}

