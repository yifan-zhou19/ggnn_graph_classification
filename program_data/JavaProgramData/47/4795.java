package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int[] num = new int[100];
	 int[] result = new int[100];
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (i = 0;i < n;i++)
	 {
	  num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 }
	 for (i = 0;i < n;i++)
	 {
	  result[n - 1 - i] = num[i];
	 }
	 for (i = 0;i < n - 1;i++)
	 {
	  System.out.print(result[i]);
	  System.out.print(" ");
	 }
	 System.out.print(result[i]);
	 System.out.print("\n");
	 return 0;
	}
}

