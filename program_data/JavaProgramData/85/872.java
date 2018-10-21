package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 1;
		int j;
		int len;
		String s = new String(new char[21]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			i = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
		if (s.charAt(0) == '_' || (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z') || (s.charAt(0) >= 'a' && s.charAt(0) <= 'z'))
		{
			while (s.charAt(i) != '\0')
			{
				if ((s.charAt(i) < '0' || (s.charAt(i)>'9' && s.charAt(i) < 'A') || (s.charAt(i)>'Z' && s.charAt(i) < 'a') || s.charAt(i)>'z') && s.charAt(i) != '_')
				{
					System.out.print("no\n");
					break;
				}
				i++;
			}
			if (s.charAt(i) == '\0')
			{
				System.out.print("yes\n");
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

