package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n; //a????????
		 int[] a = new int[10005];
		 int x;
		 int y;
		 int[] sum = new int[10005]; //sum????????????
		 int i;

		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 while (x != 0 || y != 0)
		 {
			   a[x] = 1;
			sum[y]++;
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
		  for (i = 0; i < n; i++)
		  {
			 if (sum[i] == n - 1 && a[i] == 0)
			 {
				System.out.print(i);
				System.out.print("\n");
				break;
			 }
		  }
		if (i == n)
		{
		   System.out.print("NOT FOUND");
		   System.out.print("\n");
		}

		 return 0;
	}
}

