package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
		int count;
		int sum = 0;
		int num;
		int n;
		int i;
		int j;
		int k;
		int l;
		int[] a = new int[1000];
		count = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (l = 1; l <= count; l++)
		{
			  sum = 0;
			  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  if (n == 0)
			  {
				  System.out.print("60");
				  System.out.print("\n");
				  continue;
			  }
			  for (i = 0; i <= 999; i++)
			  {
				  a[i] = 1;
			  }
			  for (i = 0;i < n; i++)
			  {
				  num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				  a[num + 1 + 3 * i] = 0;
				  a[num + 2 + 3 * i] = 0;
				  a[num + 3 + 3 * i] = 0;
			  }
			  for (i = 1; i <= 60; i++)
			  {
				  sum = sum + a[i];
			  }
			  System.out.print(sum);
			  System.out.print("\n");
		}
		return 0;
	}
}

