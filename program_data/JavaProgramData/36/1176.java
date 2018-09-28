package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int i;
	int j;
	int x = 0;
	int y = 0;
	String a = new String(new char[10]);
	String b = new String(new char[10]);

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

	for (i = 0;i < a.length();i++)
	{
		x = x + a.charAt(i);
	}
	for (j = 0;j < b.length();j++)
	{
		y = y + b.charAt(j);
	}

	if (x == y)
	{
		System.out.print("YES");
	}
	else
	{
		System.out.print("NO");
	}
	}
}

