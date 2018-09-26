package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int i;
		 int j;
		 int n;
		 int k;
		 int x;
		 int y;
		 int[] a = new int[50001];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (i = 1;i <= n;i = i + 2)
		 {
			 a[i] = 1;
		 }
		 for (i = 9;i <= n;i = i + 2)
		 {
			  for (j = 3;j <= Math.sqrt(i);j = j + 2)
			  {
				  if (i % j == 0)
				  {
					   a[i] = 0;
					   break;
				  }
			  }
		 }
		 for (j = 6;j <= n;j = j + 2)
		 {

		 for (i = 3;i <= (j / 2);i = i + 2)
		 {
			 if ((a[i] == 1) && (a[j - i] == 1))
			 {
				 System.out.print(j);
				 System.out.print("=");
				 System.out.print(i);
				 System.out.print("+");
				 System.out.print((j - i));
				 System.out.print("\n");
				 break;
			 }
		 }
		 }

	return 0;
	}
}

