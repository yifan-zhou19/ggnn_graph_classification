package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
	   int k;
	   int s;
	   int g;
	   int[] a = new int[20];
	   a[1] = 1;
	   a[2] = 1;
	   for (int j = 3;j <= 20;j = j + 1)
	   {
		a[j] = a[j - 1] + a[j - 2];
	   }
	   k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (int i = 0;i < k;i++)
	   {
		 g = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 s = a[g];
		 System.out.print(s);
		 System.out.print("\n");
	   }
	 }
}

