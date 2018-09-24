package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int[] a = new int[100];
	 int i = 0;
	 int j;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	do
	{
		 a[i] = n % 10;
					 n = n / 10;
	i++;

	}while (n != 0);
	 for (j = 0;j <= i - 1;j++)
	 {
					  System.out.print(a[j]);
	 }
	return 0;
	}

}

