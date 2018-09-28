package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String s = new String(new char[100]);
	int m;
	int i;
	int p;
	for (i = 1;i <= n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		for (m = 0;s.charAt(m);m++)
		{
			if ((s.charAt(0) == '_') || (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z') || (s.charAt(0) >= 'a' && s.charAt(0) <= 'z'))
			{
				p = 1;
			}
			else
			{
				p = 0;
				break;
			}
			if ((s.charAt(m) == '_') || (s.charAt(m) >= 'A' && s.charAt(m) <= 'Z') || (s.charAt(m) >= 'a' && s.charAt(m) <= 'z') || (s.charAt(m) >= '0' && s.charAt(m) <= '9'))
			{
				p = 1;
			}
			else
			{
				p = 0;
				break;
			}
		}
		if (p == 1)
		{
			System.out.print("yes\n");
		}
		else
		{
			System.out.print("no\n");
		}

	}



	return 0;
	}




}

