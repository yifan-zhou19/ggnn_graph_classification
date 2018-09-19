package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int[] save = new int[20000];
		int count = 0;
		for (i = 0;i < 20000;i++)
		{
		save[i] = 0;
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
				  int flag = 1;
				  m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				  for (i = 0;i < 20000;i++)
				  {
					  if (save[i] == m)
					  {
						  flag = 0;
						  break;
					  }
				  }
				  if (flag == 1)
				  {
							  for (i = 0;i < 20000;i++)
							  {
								  if (save[i] == 0)
								  {
									  save[i] = m;
									  break;
								  }
							  }
							  count++;
				  }
		}
							  for (i = 0;i < count - 1;i++)
							  {
							  System.out.print(save[i]);
							  System.out.print(" ");
							  }
							  System.out.print(save[count - 1]);

							  return 0;
	}




}

