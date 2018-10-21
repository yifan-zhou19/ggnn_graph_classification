package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int t;
	 int[] num = new int[100];
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (i = 0;i < n;i++)
	 {
	  num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 }
	 for (i = 0;i < (n + 1) / 2;i++)
	 {
		 t = num[n - 1 - i];
		 num[n - 1 - i] = num[i];
		 num[i] = t;
	 }
	 for (i = 0;i < n - 1;i++)
	 {
	  System.out.print(num[i]);
	  System.out.print(" ");
	 }
	 System.out.print(num[i]);
	 System.out.print("\n");
	 return 0;
	}
}

