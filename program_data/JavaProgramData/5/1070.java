package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int z = 0;
		int len1;
		int len2;
		double n;
		String a = new String(new char[500]);
		String b = new String(new char[500]);
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

		len1 = a.length();
		len2 = b.length();
		if (len1 != len2)
		{
			System.out.print("error");
		}
		else
		{
		for (i = 0;i < len1;i++)
		{
			if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'G' && a.charAt(i) != 'C') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'G' && b.charAt(i) != 'C'))
			{
				System.out.print("error");
				z = -1;
				break;
			}
			else
			{
			if (a.charAt(i) == b.charAt(i))
			{
			z += 1;
			}
			}
		}
		if (z >= 0)
		{
		   if ((1.0 * z / len1) > n)
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

