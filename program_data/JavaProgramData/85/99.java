package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l = 0;
		int s;
		String a = new String(new char[30]);
		int[] b = new int[100];
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
				a = tempVar2.charAt(0);
			}
			l = a.length();
			if ((a.charAt(0) == '_') || (a.charAt(0) >= 'a' && a.charAt(0) <= 'z') || (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z'))
			{
				s = 0;
				for (j = 1;j < l;j++)
				{
					if ((a.charAt(j) == '_') || (a.charAt(j) >= '0' && a.charAt(j) <= '9') || (a.charAt(j) >= 'a' && a.charAt(j) <= 'z') || (a.charAt(j) >= 'A' && a.charAt(j) <= 'Z'))
					{
						s = s + 0;
					}
					else
					{
						s = s + 1;
					}
				}
			}
			else
			{
				s = 1;
			}
			b[i] = s;
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] == 0)
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

