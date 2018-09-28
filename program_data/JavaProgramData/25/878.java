package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[55];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,-1,55 * (Integer.SIZE / Byte.SIZE));
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = 1;
		while (n > 0)
		{
			int i;
			int yu = 0;
			int ji = 0;
			for (i = 0;;i++)
			{
				if (a[i] == -1)
				{
					a[i] = a[i] + yu * 2;
					break;
				}
				else
				{
					ji = a[i] * 2;
					ji = ji + yu;
					a[i] = ji % 10;
					if (ji > 9)
					{
						yu = 1;
					}
					else
					{
						yu = 0;
					}


				}

			}
			n--;
		}
		int i = 0;
		while (a[i] != -1)
		{
			i++;
		}
		i--;
		while (i > -1)
		{
			System.out.print(a[i]);
			i--;
		}

		return 0;
	}
}

