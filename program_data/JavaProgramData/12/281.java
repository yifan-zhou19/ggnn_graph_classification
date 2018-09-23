package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i;
		int j;
		int k;
		int h;
		int[] b = new int[16];
	   while (true)
	   {
		   i = 0;
		  while ((a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		  {
			  if (a == (-1))
			  {
					return 0;
			  }
			  else
			  {
				  if (a != 0)
				  {
						b[i] = a;
						i++;
				  }
					else
					{
						break;
					}
			  }
		  }
			h = 0;

			for (j = 0;j <= i - 1;j++)
			{
					if (b[j] != 0)
					{
						for (k = 0;k <= i - 1;k++)
						{
							if (b[j] == b[k] * 2)
							{
							h++;
							}
						}
					}
					else
					{
						 break;
					}

			}
				System.out.print(h);
				System.out.print("\n");
	   }
			return 0;
	}




}

