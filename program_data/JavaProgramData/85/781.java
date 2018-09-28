package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int len;
		int j;
		int e;
		String name = new String(new char[LEN]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			e = 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				name = tempVar2.charAt(0);
			}
			len = name.length();
			if (name.charAt(0) != '_' && Character.isLetter(name.charAt(0)) == 0)
			{
				System.out.print("no\n");
			}
			else
			{
				for (j = 1;j < len;j++)
				{
					if (name.charAt(j) == '_' || (name.charAt(j) < 58 && name.charAt(j)>47) || Character.isLetter(name.charAt(j)))
					{
						e = 1;
					}
					else
					{
						e = 0;
						break;
					}
				}
				if (e == 1)
				{
					System.out.print("yes\n");
				}
				else
				{
					System.out.print("no\n");
				}
			}
		}
		return 0;
	}
}

