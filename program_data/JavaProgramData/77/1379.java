package <missing>;

public class GlobalMembers
{
	public static final int N = 110;

	public static int[] q = new int[N];
	public static String str = new String(new char[N]);
	public static char a;

	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		for (int i = 0, t = 0; i < str.length(); i++)
		{
			if (str.charAt(i) == str.charAt(0))
			{
				q[++t] = i;
			}
			else
			{
				System.out.printf("%d %d\n", q[t--], i);
			}
		}
		return 0;
	}

}

