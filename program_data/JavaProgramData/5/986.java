package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double n;
	double y;
	int a;
	int b;
	int x = 0;
	int k = 1;
	String sy = new String(new char[501]);
	String se = new String(new char[501]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Double.parseDouble(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		sy = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		se = tempVar3.charAt(0);
	}
	a = sy.length();
	b = se.length();
	if (a != b)
	{
	  System.out.print("error");
	}
	else
	{
		for (int i = 0;i < a;i++)
		{
			if ((sy.charAt(i) == 'A' || sy.charAt(i) == 'T' || sy.charAt(i) == 'C' || sy.charAt(i) == 'G') && (se.charAt(i) == 'A' || se.charAt(i) == 'T' || se.charAt(i) == 'C' || se.charAt(i) == 'G'))
			{
			if (sy.charAt(i) == se.charAt(i))
			{
			  x += 1;
			}
			}
			else
			{
			  k = 0;
			  break;
			}
		}
		if (k == 0)
		{
		System.out.print("error");
		}
		else
		{
		y = 1.0 * x / a;
		if (y >= n)
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

