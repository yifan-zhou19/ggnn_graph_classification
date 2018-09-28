package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[310]);
	public static void hui(int i,int l)
	{
		int j;
		for (j = 0;j < l;j++)
		{
			if (a.charAt(i + j) != a.charAt(l + i - 1 - j))
			{
			return;
			}
		}
		for (j = 0;j < l;j++)
		{
			System.out.print(a.charAt(i + j));
		}
		System.out.print("\n");
		return;
	}
	public static int Main()
	{
		int n;
		int x;
		int k;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		n = a.length();
		for (x = 2;x < n;x++)
		{
			for (k = 0;k < n;k++)
			{
			hui(k, x);
			}
		}
			return 0;
	}

}

