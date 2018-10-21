package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[85]);
		int i;
		int j;
		int k;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			m = 1;
			a = new Scanner(System.in).nextLine();
			if ((a.charAt(0) >= 'a' && a.charAt(0) <= 'z') || (a.charAt(0) <= 'Z' && a.charAt(0) >= 'A') || a.charAt(0) == '_')
			{
				for (j = 1;a.charAt(j) != '\0';j++)
				{
					if ((a.charAt(j) >= 'a' && a.charAt(j) <= 'z') || (a.charAt(j) <= 'Z' && a.charAt(j) >= 'A') || a.charAt(j) == '_' || (a.charAt(j) >= '0' && a.charAt(j) <= '9'))
					{
						continue;
					}
					else
					{
						m = 0;
						break;
					}
				}
			}
			else
			{
				m = 0;
			}
			System.out.printf("%d\n",m);
		}
	}



}

