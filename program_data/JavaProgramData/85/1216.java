package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[21]);
		int i;
		int j;
		int k;
		int n;
		int l;
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
			l = s.length();
			k = 0;
			for (j = 0;j < l;j++)
			{
				if (j == 0)
				{
					if ((s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') || s.charAt(j) == '_')
					{
						k += 0;
					}
					else
					{
						k++;
					break;
					}
				}
				else if (j != 0)
				{
					if ((s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') || (s.charAt(j) >= '0' && s.charAt(j) <= '9') || s.charAt(j) == '_')
					{
						k += 0;
					}
					else
					{
						k++;
						break;
					}
				}
			}
				if (k == 0)
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

