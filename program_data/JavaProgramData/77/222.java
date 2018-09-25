package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[10000]);
	public static int[] use = new int[10000];
	public static void f(int len)
	{
		int i;
		int j;
		for (i = 0;i < len;i++)
		{
			if (a.charAt(i) == a.charAt(len - 1) && use[i] == 0)
			{
				for (j = i - 1;j >= 0;j--)
				{
					if (a.charAt(j) == a.charAt(0) && use[j] == 0)
					{
						System.out.print(j);
						System.out.print(" ");
						System.out.print(i);
						System.out.print("\n");
						use[i] = 1;
						use[j] = 1;
						break;
					}
				}
			}
		}
	}
	public static int Main()
	{
		int len;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = a.length();
		f(len);
		return 0;
	}



}

