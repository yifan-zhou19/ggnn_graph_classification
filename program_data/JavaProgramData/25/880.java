package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int i;
		int j;
		int n;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			t = 0; //??
			for (j = 0; j < 35; j++) //?????
			{
				a[j] = a[j] + a[j] + t;
				t = a[j] / 10;
				a[j] = a[j] % 10;
			}
		}
		for (i = 34; a[i] == 0; i--)
		{
			;
		}
		for (; i >= 0; i--)
		{
			System.out.print(a[i]);
		}
		System.out.print("\n");
		return 0;
	}

}

