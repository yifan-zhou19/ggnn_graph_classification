package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int[] a = new int[16];

		   while (true)
		   {
				   int count = 0; //??????
			   for (i = 0;i < 16;i++) //????0?-1??
			   {
					a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i] == -1)
				{
					break;
				}
				 if (a[i] == 0)
				 {
					 break;
				 }
			   }
			   if (a[i] == -1)
			   {
				   break; //??????-1 ????????
			   }
			   for (j = 0;j < i;j++) //??????????
			   {
				 for (m = j + 1;m < i;m++)
				 {
					 if (a[j] == 2 * a[m])
					 {
						 count++;
					 }
				 }
			   }
			   for (j = 0;j < i;j++) //????????
			   {
							for (m = j + 1;m < i;m++)
							{
								if (2 * a[j] == a[m])
								{
									count++;
								}
							}
			   }
			System.out.print(count);
			System.out.print("\n");
		   }
	}
}

