package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int d;
		int c;
		int n;
		int m;
		int i;
		int j;
		int k;
		int[] a = new int[20];
		int[] b = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
				m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m == 0)
			{
				b[i] = 60;
				continue;
			}
			for (j = 0;j < m;j++)
			{
					a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			if (a[m - 1] <= (60 - m * 3))
			{
					b[i] = (60 - m * 3);
			}
			else
			{
					{
						for (k = m - 1;;k--)
						{
				 if (a[k] + (k + 1) * 3 <= 60)
				 {
					 break;
				 }
						}
				}
				  c = 60 - ((k + 1) * 3);
				  if (c <= a[k + 1])
				  {
					  b[i] = c;
				  }
				  else
				  {
					  b[i] = a[k + 1];
				  }
			}
		}
		  for (i = 0;i < n;i++)
		  {
			  System.out.print(b[i]);
			  System.out.print("\n");
		  }
		return 0;
	}


}

