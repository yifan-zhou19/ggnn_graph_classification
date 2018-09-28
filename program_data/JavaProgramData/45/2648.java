package <missing>;

public class GlobalMembers
{
	public static int compare(String a, String b, int x)
	{
		int i;
		int l;
		l = a.length();
		for (i = 0;i < l;i++)
		{
			if (a[i].equals(b[i + x]))
			{
				continue;
			}
			else
			{
				return 0;
			}
		}
		return 1;
	}

	public static void Main()
	{
		int i;
		int l;
		int m;
		String a = new String(new char[51]);
		String b = new String(new char[51]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		l = a.length();
		m = b.length();
		for (i = 0;i <= m - l;i++)
		{
			if (compare(a, b, i) == 1)
			{
				System.out.printf("%d\n",i);
				break;
			}
		}
	}
}

