package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {3, 5, 7};
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int[] c = new int[3];
		int k = 0;
		for (i = 0;i <= 2;i++)
		{
						 if (n % a[i] == 0)
						 {
									  c[k] = a[i];
									  k++;
						 }
		}
		if (k == 0)
		{
			System.out.print("n");
		return 0;
		}
		for (i = 0;i < k - 1;i++)
		{
		System.out.print(c[i]);
		System.out.print(" ");
		}
		System.out.print(c[k - 1]);
		return 0;
	}

}

