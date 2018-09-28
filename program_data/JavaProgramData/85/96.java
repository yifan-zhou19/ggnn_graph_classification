package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s = new String(new char[20]);
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		for (j = 0;s.charAt(j) != '\0';j++)
		{
			if (j == 0)
			{
		if ((s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') || (s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || s.charAt(j) == '_')
		{
			if (s.charAt(j + 1) == '\0')
			{
					System.out.print("yes\n");
			}
			continue;
		}
		else
		{
				System.out.print("no\n");
			break;
		}
			}
			else
			{
		if ((s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') || (s.charAt(j) >= '0' && s.charAt(j) <= '9') || (s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || s.charAt(j) == '_')
		{
			if (s.charAt(j + 1) == '\0')
			{
					System.out.print("yes\n");
			}
			continue;
		}
		else
		{
				System.out.print("no\n");
			break;
		}
			}
		}
		}

	}


}

