package <missing>;

public class GlobalMembers
{
	/**?????
	  *???2010/11/5
	  *??????
	  *???1000010449
	*/
	public static int Main()
	{
		int[] a = new int[16];
		int len;
		int count;
		int i;
		int j;
		while (true)
		{
			a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[0] == -1)
			{
				break;
			}
			len = 0;
			do
			{
				len++;
				a[len] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}while (a[len] != 0);
			count = 0;
			for (i = 0; i < len; i++)
			{
				for (j = 0; j < len; j++)
				{
					if (j == i)
					{
						continue;
					}
					else
					{
						if (a[j] == (2 * a[i]))
						{
							count++;
						}
					}
				}
			}
			System.out.print(count);
			System.out.print("\n");
		}
		return 0;
	}

}

