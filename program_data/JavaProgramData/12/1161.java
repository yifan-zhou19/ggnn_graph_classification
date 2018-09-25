package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] data = new int[16];
		int i;
		int j;
		int len;
		int count;

		while (true)
		{
					  count = 0;
					  String tempVar = ConsoleInput.scanfRead();
					  if (tempVar != null)
					  {
						  data[0] = Integer.parseInt(tempVar);
					  }
					  if (data[0] == -1)
					  {
								 break;
					  }

					  for (i = 1; i <= 15; i++)
					  {
							String tempVar2 = ConsoleInput.scanfRead();
							if (tempVar2 != null)
							{
								data[i] = Integer.parseInt(tempVar2);
							}
							if (data[i] == 0)
							{
									   len = i;
									   break;
							}
					  }

					  for (i = 0; i <= len - 1; i++)
					  {
							for (j = 0 ; j <= len - 1; j++)
							{
								  count = count + (data[i] == 2 * data[j]);
							}
					  }

					  System.out.printf("%d\n", count);
		}



		return 0;
	}


}

