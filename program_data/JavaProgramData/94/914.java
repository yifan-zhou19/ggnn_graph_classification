package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[500];
		int b;
		int c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n - 1;i++)
		{
			for (int j = i + 1;j < n;j++)
			{
				if (a[i] > a[j])
				{
					b = a[i];
					a[i] = a[j];
					a[j] = b;
				}
			}
		}
			 for (int i = n - 1;i >= 0;i--)
			 {
					  if (a[i] % 2 != 0)
					  {
						  c = i;
						  break;
					  }
			 }
		for (int i = 0;i < n;i++)
		{
					  if (i == c)
					  {
						  System.out.print(a[i]);
						  break;
					  }
			if (a[i] % 2 != 0)
			{
				System.out.print(a[i]);
				System.out.print(",");
			}
		}
		return 0;
	}
}

