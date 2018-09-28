package <missing>;

public class GlobalMembers
{
	//******************************************
	//*???????.cpp                     **
	//*??: ??     1100012808              **
	//*???2011.12.17                       **
	//******************************************
	public static int Main() //???
	{ //?????
		int n;
		int j;
		int m;
		int i;
		int[] a = new int[200];
		int[] t = new int[200];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0; j < n; j++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(t, 0, (Integer.SIZE / Byte.SIZE));
			if (m == 0)
			{
				System.out.print(60);
				System.out.print("\n");
			}
			for (i = 0; i < m; i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				t[i] = a[i] + (i + 1) * 3 + 1;
			}
			for (i = 0; i < m; i++)
			{
				if ((t[i] <= 60 && t[i + 1] > 60) || (t[i] <= 60 && t[i + 1] == 0))
				{
					if (t[i + 1] == 61 || t[i + 1] == 62 || t[i + 1] == 63)
					{
						System.out.print(a[i + 1]);
						System.out.print("\n");
						break;
					}
					else
					{
						System.out.print(60 - 3 * (i + 1));
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	} //?????

}

