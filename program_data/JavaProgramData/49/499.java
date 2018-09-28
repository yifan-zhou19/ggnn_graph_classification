package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[501]);
	public static int len;
	public static int i = 0;
	public static int t = 2;
	public static int p = 0;
	public static int j = 0;
	public static int n = 1;

	public static void back(String m)
	{
		len = m.length();
		do
		{
			for (j = 0;j <= len - t;j++)
			{
				for (i = j;i < j + t;i++)
				{
					if (m[i].equals(m[j + t - n]))
					{
						if (i + 1 >= j + t - n)
						{
							for (i = j;i < j + t;i++)
							{
								System.out.print(m[i]);
							}
							System.out.print('\n');
							break;
						}
					}
					else
					{
						break;
					}
					n++;
				}
				n = 1;
			}
			t++;
		}while (t <= len);
	}
	public static int Main()
	{
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		back(a);
		return 0;
	}


}

