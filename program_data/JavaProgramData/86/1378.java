package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[20];
		int t;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n -- != 0)
		{
			a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 1 ; i <= a[0] ; i++)
			{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			t = 1;
			 while ((a[0] + 1 - t) * 3 + a[a[0] - t + 1] > 63)
			 {
				 t++;
			 }
			  if ((a[0] + 1 - t) * 3 + a[a[0] - t + 1] >= 60)
			  {
					System.out.print(a[a[0] - t + 1]);
					System.out.print("\n");
			  }
			  else
			  {
				  System.out.print((60 - (a[0] - t + 1) * 3));
				  System.out.print("\n");
			  }
		}
		return 0;
	}
}

