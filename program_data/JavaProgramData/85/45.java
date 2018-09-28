package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int y;
		int[] b = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String a = new String(new char[20]);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			if ((a.charAt(0) >= 'a') && (a.charAt(0) <= 'z') || (a.charAt(0) >= 'A') && (a.charAt(0) <= 'Z') || (a.charAt(0) == '_'))
			{
				b[i] = 1;
				for (j = 1;j < (int)a.length();j++)
				{
					if ((a.charAt(j) >= 'a') && (a.charAt(j) <= 'z') || (a.charAt(j) >= 'A') && (a.charAt(j) <= 'Z') || (a.charAt(j) == '_') || (a.charAt(j) >= '0') && (a.charAt(j) <= '9'))
					{
						b[i] = 1;
					}
					else
					{
						b[i] = 0;
					}
					if (b[i] == 0)
					{
						break;
					}
				}
			}
			else
			{
				b[i] = 0;
			}
		}
		for (y = 0;y < n;y++)
		{
			if (b[y] == 0)
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.print("yes\n");
			}
		}
		return 0;
	}



}

