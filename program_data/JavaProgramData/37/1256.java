package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String zfc = new String(new char[1000]);
	char tmp;
	int n;
	int i;
	int t;
	int e;
	int f;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{

	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		zfc = tempVar2.charAt(0);
	}
	for (t = 0;zfc.charAt(t) != '\0';t++)
	{
		f = 0;
		for (e = 0;1;e++)
		{
			if (zfc.charAt(t) == zfc.charAt(e) && t != e)
			{
			break;
			}
			else if (e == zfc.length())
			{
			System.out.printf("%c\n",zfc.charAt(t));
			f = 1;
			break;
			}

		}
	if (f == 1)
	{
		break;
	}
	}
	if (f == 0)
	{
	System.out.print("no\n");
	}

	}

		return 0;
	}

}

