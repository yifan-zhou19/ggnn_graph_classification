package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
	int i;
	int j = 0;
	int x;
	int y;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		b = tempVar2.charAt(0);
	}
	x = a.length();
	for (i = 0;i < 50;i++)
	{
		if (b.charAt(i) == a.charAt(j))
		{
	j++;
		}
	if (j > (x - 1) && j != 0)
	{
		break;
	}
	}
	System.out.printf("%d",i + 1 - x);
	}

}

