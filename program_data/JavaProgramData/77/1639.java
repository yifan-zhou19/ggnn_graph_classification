package <missing>;

public class GlobalMembers
{
	public static int[] flag = new int[101];
	public static String str = new String(new char[101]);
	public static char b;
	public static char g;
	public static void match(int girl) //int girl's pos
	{
		int j;
		for (j = girl;j >= 0;j--)
		{
			if (str.charAt(j) == b && flag[j] == 0)
			{
				System.out.print(j);
				System.out.print(' ');
				System.out.print(girl);
				System.out.print("\n");
				flag[j] = 1;
				break;
			}
		}
		return;
	}

	public static int Main()
	{
		int i = 0;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = str.charAt(0);
		int len = str.length();
		while (str.charAt(i) == b)
		{
			i++;
		}
		g = str.charAt(i);
		for (;i <= len - 1;i++)
		{
			if (str.charAt(i) == g)
			{
				match(i);
			}
		}
		return 0;
	}



}

