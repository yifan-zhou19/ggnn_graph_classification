package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = {100, 50, 20, 10, 5, 1};
	int[] count = {0, 0, 0, 0, 0, 0};
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 0;i < 6;i++)
	{
		   if (n >= a[i])
		   {
			   count[i] = n / a[i];
			   n = n - count[i] * a[i];
		   }
			 System.out.print(count[i]);
			 System.out.print("\n");
	}
	return 0;
	}

}

