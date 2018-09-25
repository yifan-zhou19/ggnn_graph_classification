package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] b = new int[20];
		int p = 2;
		int j = 1;
		int k = 2;
		int num = 0;

		while ((b[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{




			 if (b[1] != -1)
			 {
			  for (p = 2; ;p++)
			  {
				 b[p] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				 if (b[p] != 0)
				 {
					 continue;
				 }
				 else
				 {

					for (j = 1;j < p - 1;j++)
					{
					  for (k = j + 1;k <= p - 1;k++)
					  {
						if ((b[j] == b[k] * 2) || (b[k] == b[j] * 2))
						{
							num++;

						}
					  }
					}
					System.out.print(num);
					System.out.print("\n");
					num = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
					memset(b,(Integer.SIZE / Byte.SIZE),0);
					break;
				 }
			  }

			 }
			 else
			 {
				 break;
			 }


		}

		return 0;
	}







}

