package <missing>;

public class GlobalMembers
{
	public static int Main(int argc)
	{
		int i;
		int n;
		int[] a = new int[7];
	int[] b = {100, 50, 20, 10, 5, 1};
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (i = 1;i <= 6;i++)
		 {
			 a[i] = n / b[i - 1];
		 n = n % b[i - 1];
		 System.out.print(a[i]);
		 System.out.print("\n");
		 }
	return 0;
	}
}

