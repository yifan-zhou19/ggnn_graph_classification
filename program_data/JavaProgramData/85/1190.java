package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		String s = new String(new char[2000]);
		int r = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			r = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			if ((s.charAt(0) >= 'A' && s.charAt(0) <= 'Z') || (s.charAt(0) >= 'a' && s.charAt(0) <= 'z') || (s.charAt(0) == '_'))
			{
				for (j = 0;s.charAt(j) != '\0';j++)
				{
					if ((s.charAt(j) >= '0' && s.charAt(j) <= '9') || (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') || (s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || s.charAt(j) == '_')
					{
						r = 0;
					}
					else
					{
						r = 1;
					}
					if (r == 1)
					{
						break;
					}
				}
			}
			else
			{
				r = 1;
			}
			if (r == 0)
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

