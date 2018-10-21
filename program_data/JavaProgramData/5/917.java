package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int s = 0;
	int i;
	int x;
	int y;
	int e = 0;
	double r;
	String a = new String(new char[500]);
	String b = new String(new char[500]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		r = Double.parseDouble(tempVar);
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
	x = a.length();
	y = b.length();
	if (x != y)
	{
		System.out.print("error");
	}
	else
	{
		for (i = 0;i < x;i++)
		{
		 if (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G')
		 {
			 e = e+1;
		 }
		 else
		 {
			 if (a.charAt(i) == b.charAt(i))
			 {
				 s = s + 1;
			 }
		 }
		}
	if (e != 0)
	{
		System.out.print("error");
	}
	else
	{
	if (1.0 * s / x > r)
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

