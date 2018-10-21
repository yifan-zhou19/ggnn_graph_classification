package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (int i = 0;i < n;i++)
		{
			a[i] = i + 1;
		}
		for (int i = 0;i < n;i++)
		{
		 if (a[i] < 10 && a[i] % 7 != 0)
		 {
			 sum = sum + a[i] * a[i];
		 }
		 if (a[i] > 9 && a[i] % 7 != 0 && a[i] % 10 != 7 && (a[i] - a[i] % 10) % 7 != 0)
		 {
			 sum = sum + a[i] * a[i];
		 }
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

