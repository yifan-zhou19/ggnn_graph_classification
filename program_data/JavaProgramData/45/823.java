package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int len;
	int x;
	String s = new String(new char[50]);
	String w = new String(new char[50]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		s = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		w = tempVar2.charAt(0);
	}
	len = s.length();
	for (i = 0;i < 50;i++)
	{
		x = 0;
		for (j = i;j < len + i;j++)
		{
				if (s.charAt(j - i) != w.charAt(j))
				{
					x++;
				}
		}
		if (x == 0)
		{
			break;
		}
	}
	System.out.printf("%d",i);
	}
}

