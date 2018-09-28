package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[600]);
	String b = new String(new char[600]);
	double n;
	double x;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Double.parseDouble(tempVar);
	}
	a = new Scanner(System.in).nextLine();
	b = new Scanner(System.in).nextLine();
	int i;
	int j;
	int a1;
	int b1;
	int xiangtong = 0;
	int zhengfou = 1;
	int y = 0;
	a1 = a.length();
	b1 = b.length();
	if (a1 != b1)
	{
		System.out.print("error");
		y = 1;
	}
	else
	{
		for (i = 0;i < a1;i++)
		{
		if (a.charAt(i) == b.charAt(i))
		{
			xiangtong++;
		}
		if (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'G' && a.charAt(i) != 'C')
		{
			zhengfou = 0;
		}
		if (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'G' && b.charAt(i) != 'C')
		{
			zhengfou = 0;
		}
		}
	}
	if (zhengfou == 0)
	{
	System.out.print("error");
	}
	else
	{
	if (y != 1)
	{
	  x = xiangtong * 1.0 / a1;
	  if (x <= n)
	  {
		  System.out.print("no");
	  }
	  else
	  {
		  System.out.print("yes");
	  }

	}
	}
	return 0;
	}
}

