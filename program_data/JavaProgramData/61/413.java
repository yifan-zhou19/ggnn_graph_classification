package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100];
	public static int F(int n)
	{
			if (n == 1 || n == 2)
			{
				return 1;
			}
		 else
		 {
			 return F(n - 1) + F(n - 2);
		 }
	}
	public static int Main()
	{
		int n;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (int i = 0;i < n;i++)
	 {
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 }
	 for (int j = 0;j < n;j++)
	 {
			System.out.print(F(a[j]));
			System.out.print("\n");
	 }
	 return 0;
	}

}

