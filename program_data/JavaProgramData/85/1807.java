package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String a = new String(new char[21]);
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
				a = tempVar2.charAt(0);
			}
			for (i = 0;a.charAt(i);i++)
			{
			if (a.charAt(i) == '_' || (a.charAt(i) >= '0' && a.charAt(i) <= '9') || (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') || (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z'))
			{
				if (i == 0 && (a.charAt(i) >= '0' && a.charAt(i) <= '9'))
				{
					System.out.print("no\n");
					break;
				}
			}
			if (!(a.charAt(i) == '_' || (a.charAt(i) >= '0' && a.charAt(i) <= '9') || (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') || (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')))
			{
				System.out.print("no\n");
				break;
			}
			}
			if (a.charAt(i) == '\0')
			{
				System.out.print("yes\n");
			}
		}
		return 0;
	}





}

