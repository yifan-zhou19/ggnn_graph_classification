package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int a;
		int[] x = new int[20];
		x[1] = 1;
		x[2] = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 1;j <= n;j++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 if (a == 1)
			 {
				 System.out.print("1");
			 }
			 else if (a == 2)
			 {
				 System.out.print("1");
			 }
			 else
			 {
				 {
					 for (i = 3;i <= a;i++)
					 {
				 x[i] = x[i - 1] + x[i - 2];
					 }
			 }
				 System.out.print(x[a]);
				 System.out.print("\n");
			 }
		}
	}
}

