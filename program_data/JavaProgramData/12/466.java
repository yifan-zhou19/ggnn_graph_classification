package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int i;
		int m = 0;
		int j;
		int k = 0;
		while ((a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (a[0] == -1)
			{
				break;
			}
			  for (i = 1;i < 16;i++)
			  {
				  a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				  if (a[i] == 0)
				  {
					  m = i;
					  break;
				  }
			  }
				  for (i = 0;i <= m;i++)
				  {
					 for (j = 0;j <= m;j++)
					 {
						 if (i == j)
						 {
							 continue;
						 }
					if (a[i] == 2 * a[j])
					{
							 k++;
					}
					else
					{
						continue;
					}
					 }
				  }
				  System.out.print(k);
				  System.out.print("\n");
				  k = 0;
		}
		return 0;
	}
}

