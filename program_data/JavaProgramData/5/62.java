package <missing>;

public class GlobalMembers
{
	//int a[10000];
	public static String a = new String(new char[500]);
	public static String b = new String(new char[10000]);
	//double c[10000];
	public static int Main()
	{
		double xg;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			xg = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		int i;
		int x = 0;
		int e = 0;
		if (a.length() != b.length())
		{
			System.out.print("error");
		}
		else
		{
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'G' && a.charAt(i) != 'C') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'G' && b.charAt(i) != 'C'))
			{
				System.out.print("error");
			e = 1;
			break;
			}
			else
			{
				if (a.charAt(i) == b.charAt(i))
				{
					x++;
				}
			}
		}
		if (e == 1)
		{
		}
		else
		{
		if ((x * 1.0) / (a.length()) > xg)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
		}
		}
		return 0;
	}
}

