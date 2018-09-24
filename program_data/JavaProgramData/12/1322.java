package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20];
		int i = 0;
		int j;
		int count = 0;
		while ((a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			 if (a[i] == 0)
			 {
				 System.out.print(count);
				 System.out.print("\n");
				 count = 0;
					 i = 0;
				 continue;
			 }

			if (i != 0)
			{
				for (j = 0;j < i;j++)
				{
					if (a[j] == 2 * a[i] || a[i] == 2 * a[j])
					{
						count++;
					}
				}

			}
			 i++;
		}



		return 0;
	}

}

