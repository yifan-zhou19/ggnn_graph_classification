package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int i;
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 if (n == 0)
		 {
			 System.out.print(0);
		 }
		 else
		 {
		 for (i = 0;i <= 5;i++)
		 {
			 if (n / Math.pow(10.0,i * 1.0) < 1)
			 {
				 break;
			 }
		 }
		 for (int j = 1;j <= i;j++)
		 {
			 int k = n % 10;
			 System.out.print(k);
			 n = (n - k) / 10;
		 }
		 System.out.print("\n");
		 }
		 return 0;
	}
}

