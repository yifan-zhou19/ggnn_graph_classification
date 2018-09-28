package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m = 0;
		int i;
		int j;
		String sz = new String(new char[N]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz = tempVar2.charAt(0);
			}
		if ((sz.charAt(0) == '_') || (sz.charAt(0) >= 'A' && sz.charAt(0) <= 'Z') || (sz.charAt(0) >= 'a' && sz.charAt(0) <= 'z'))
		{
			for (i = 1;sz.charAt(i);i++)
			{
			if ((sz.charAt(i) == '_') || (sz.charAt(i) >= '0' && sz.charAt(i) <= '9') || (sz.charAt(i) >= 'a' && sz.charAt(i) <= 'z') || (sz.charAt(i) >= 'A' && sz.charAt(i) <= 'Z'))
			{
				continue;
			}
			else
			{
				m++;
			}
			}
		if (m != 0)
		{
			m = 0;
			System.out.println("no");
		}
			else
			{
				System.out.println("yes");
			}
		}
		else
		{
			System.out.println("no");
		}
		}
		return 0;
	}



}

