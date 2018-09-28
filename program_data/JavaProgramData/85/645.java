package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s = new String(new char[25]);
	int i;
	int j;
	int len;
	int k;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		k = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		len = s.length();
		if ((s.charAt(0) == '_') || ((s.charAt(0) >= 'A') && (s.charAt(0) <= 'Z')) || ((s.charAt(0) >= 'a') && (s.charAt(0) <= 'z')))
		{
			for (j = 1;j < len;j++)
			{
				if ((s.charAt(j) == '_') || ((s.charAt(j) >= 'A') && (s.charAt(j) <= 'Z')) || ((s.charAt(j) >= 'a') && (s.charAt(j) <= 'z')) || ((s.charAt(j) >= '0') && (s.charAt(j) <= '9')))
				{
					k++;
				}
			}
			if (k == (len - 1))
			{
				System.out.print("yes\n");
			}
			if (k != (len - 1))
			{
				System.out.print("no\n");
			}
		}
		else
		{
			System.out.print("no\n");
		}
	}
	return 0;
	}

}

