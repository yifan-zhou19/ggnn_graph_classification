package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		String b = new String(new char[500]);
		int len;
		int lmn;
		int sum = 0;
		int i;
		int flag = 1;
		double n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
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
		len = a.length();
		lmn = b.length();
		if (len != lmn)
		{
			System.out.print("error");
		}
	else
	{

	for (i = 0;i < len;i++)
	{
	  if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G'))
	  {
		flag = 0;
	  System.out.print("error");
	break;
	  }
	}
	}

	if (len == lmn && flag == 1)
	{
	for (i = 0;i < len;i++)
	{
		if (a.charAt(i) == b.charAt(i))
		{
			sum += 1;
		}
	}
	if ((double)sum / len > n)
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

