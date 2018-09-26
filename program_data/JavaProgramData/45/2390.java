package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[50]);
	public static String w = new String(new char[50]);

	public static int judge(int n1,int x)
	{
		int result = 1;
		int i;
		for (i = x;i < x + n1;i++)
		{
			if (s.charAt(i - x) != w.charAt(i))
			{
				result = 0;
				break;
			}
		}
		return result;
	}

	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		int i;
		int n1 = s.length();
		int n2 = w.length();
		for (i = 0;i < n2;i++)
		{
			if (w.charAt(i) != s.charAt(0))
			{
				continue;
			}
			else
			{
				if (judge(n1, i) != 0)
				{
					break;
				}
			}
		}
		System.out.printf("%d",i);
		return 0;
	}
}

