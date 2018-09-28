package <missing>;

public class GlobalMembers
{
	public static char[][] p = new char[1000][21];
	public static int judge(String s, String w, int x)
	{
		int l;
		int k;
		l = s.length();
		for (k = 0;k < l;k++)
		{
			if (!s[k].equals(w[k + x]))
			{
				break;
			}
		}
		if (k == l)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static void Main()
	{
		int l1;
		int l2;
		int i;
		String s = new String(new char[50]);
		String w = new String(new char[50]);
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
		l1 = s.length();
		l2 = w.length();
		for (i = 0;i < l2 - l1;i++)
		{
			if (judge(s, w, i) == 1)
			{
				break;
			}
		}
		System.out.printf("%d\n",i);
	}
}

