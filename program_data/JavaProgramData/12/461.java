package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int i;
		int j;
		int k;
		int n = 0;
		int N = 0;
		int t;
		for (k = 1;k < 100;k++)
		{
			for (i = 0;i < 100;i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n++;
			if (a[i] == 0)
			{
				i = 100;
			}
			}
		if (a[0] != -1)
		{
			  for (i = 1;i <= n - 2;i++)
			  {
				for (j = 0;j <= n - i - 2;j++)
				{
				  if (a[j] > a[j + 1])
				  {
				  t = a[j];
			  a[j] = a[j + 1];
			  a[j + 1] = t;
				  }
				}
			  }
		  for (i = n - 2;i >= 0;i--)
		  {
			  for (j = i - 1;j >= 0;j--)
			  {
				  if (a[i] == 2 * a[j])
				  {
					  N++;
				  }
			  }
		  }
			  System.out.print(N);
			  System.out.print("\n");
			  N = 0;
			  n = 0;
		}

		else
		{
			break;
		}
		}
	return 0;
	}

}

