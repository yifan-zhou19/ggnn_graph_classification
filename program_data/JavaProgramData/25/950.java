package <missing>;

public class GlobalMembers
{
	public static int[] a = {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	public static int[] b = {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	public static int n;
	public static void sum(int c1, int c2)
	{
		 if (c1 == n)
		 {
		 for (int i = c2 - 1; i >= 0; i--)
		 {
				 System.out.print(a[i]);
		 }
		 System.out.print("\n");
		 }
		 else
		 {
			 if (a[c2 - 1] + b[c2 - 1] >= 10) //????
			 {
				c2++;
			 }
			 for (int i = 0; i < c2; i++) //??n????? ??
			 {
							 a[i] = (a[i] + b[i]) % 10;
							 a[i + 1] = (b[i] + b[i]) / 10 + a[i + 1];
							 b[i] = a[i];
			 }
			 sum(c1 + 1, c2);
		 }
	}
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			 System.out.print(1);
			 System.out.print("\n");
			 return 0;
		}
		for (int i = 1; i < 40; i++)
		{
				a[i] = 0, b[i] = 0;
		}
		sum(1, 1);
		return 0;
	}

}

