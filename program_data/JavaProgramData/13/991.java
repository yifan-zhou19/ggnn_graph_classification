package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[20000];
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= n - 1; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0; j <= i - 1; j++)
			{
				if (a[i] == a[j])
				{
					i = i - 1;
					n--;
					break;
				}
			}
		}
		if ((n - 2) >= 0)
		{
		  for (i = 0; i <= n - 2; i++)
		  {
			System.out.print(a[i]);
			System.out.print(" ");
		  }
		  System.out.print(a[n - 1]);
		}
		else
		{
			System.out.print(a[0]);
		}

		return 0;
	}

}

