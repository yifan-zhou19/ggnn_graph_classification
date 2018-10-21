package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int k;
	   int i;
	   int j;
	   int[] a = new int[1000];
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = 1;i <= n;i++)
	   {
		   a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   }
	   for (i = 1;i < n;i++)
	   {
		j = i;
		while (j <= n)
		{
			if (a[i] + a[j] == k)
			{
			System.out.print("yes");
			return 0;
			}
			j++;
		}
	   }
		System.out.print("no");
		return 0;
	}


}

