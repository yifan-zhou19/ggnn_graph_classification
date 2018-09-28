package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int[] t = new int[200];
		String a = new String(new char[200]);
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
			for (j = 0;a.charAt(j);j++)
			{
				if ((a.charAt(j) == '_') || (a.charAt(j) >= 'A' && a.charAt(j) <= 'Z') || (a.charAt(j) >= 'a' && a.charAt(j) <= 'z') || (a.charAt(j) >= '0' && a.charAt(j) <= '9' && j>0))
				{
					t[i] = 1;
					continue;
				}
				else
				{
					t[i] = 0;
					break;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (t[i] != 0)
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

