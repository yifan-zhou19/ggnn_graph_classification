package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double n;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Double.parseDouble(tempVar);
	}
	String sza = new String(new char[600]);
	String szb = new String(new char[600]);
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		sza = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		szb = tempVar3.charAt(0);
	}
	int a = 0;
	int b = sza.length();
	int c = szb.length();
	for (i = 0;i < b;i++)
	{
		if (sza.charAt(i) != 'A' && sza.charAt(i) != 'T' && sza.charAt(i) != 'C' && sza.charAt(i) != 'G')
		{
		  a = 1;
		}
		if (szb.charAt(i) != 'A' && szb.charAt(i) != 'T' && szb.charAt(i) != 'C' && szb.charAt(i) != 'G')
		{
		  a = 1;
		}
			 if (b != c)
			 {
		  a = 1;
			 }
	}
	double d = 0;
	double e;
	if (a == 1)
	{
	  System.out.print("error");
	}
	else
	{
		for (i = 0;i < b;i++)
		{
			if (sza.charAt(i) == szb.charAt(i))
			{
			   d++;
			}
		}
		e = d / b;
		if (e > n)
		{
		  System.out.print("yes");
		}
		else
		{
		  System.out.print("no");
		}
	}
	return 0;
	}

}

