package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		double s = 0;
		int len;
		int lon;
		int i;
		int z;
		String a = new String(new char[750]);
		String b = new String(new char[750]);
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
		z = 1;
		len = a.length();
		lon = b.length();
		if (len != lon)
		{
			z = 0;
		System.out.print("error");
		}
		else
		{
			for (i = 0;i < len;i++)
			{
			if ((a.charAt(i) != 'A') && (a.charAt(i) != 'T') && (a.charAt(i) != 'G') && (a.charAt(i) != 'C'))
			{
			z = 0;
		System.out.print("error");
		break;
			}
		if ((b.charAt(i) != 'A') && (b.charAt(i) != 'T') && (b.charAt(i) != 'G') && (b.charAt(i) != 'C'))
		{
			z = 0;
		System.out.print("error");
		break;
		}
			}
		if (z == 1)
		{
			for (i = 0;i < len;i++)
			{
				if (a.charAt(i) == b.charAt(i))
				{
			s++;
				}
			}
		double x = s / len;
		if (x > n)
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

