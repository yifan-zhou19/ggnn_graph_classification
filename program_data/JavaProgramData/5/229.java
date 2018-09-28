package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m = 0;
		float k = 0F;
		float n;
		String a = new String(new char[502]);
		String b = new String(new char[502]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Float.parseFloat(tempVar);
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
		for (i = 0;i < (a.length());i++)
		{
			if (a.length() != b.length())
			{
				m = 0;
				break;
			}
			if (a.charAt(i) == 'A' || a.charAt(i) == 'T' || a.charAt(i) == 'C' || a.charAt(i) == 'G')
			{
				m++;
				if (a.charAt(i) == b.charAt(i))
				{
					k++;
				}
			}
			else
			{
				m = 0;
				break;
			}
		}
		if (m == 0)
		{
			System.out.print("error");
		}
		else
		{
			if ((k / (a.length() * 1.00)) > n)
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

