package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int lm = 0;
		String a = new String(new char[1000]);
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
			if (!((a.charAt(0) == '_') || (('a' <= a.charAt(0)) && (a.charAt(0) <= 'z')) || (('A' <= a.charAt(0)) && (a.charAt(0) <= 'Z'))))
			{
					lm++;
			}
			for (j = 1;a.charAt(j);j++)
			{
				if (!((a.charAt(j) == '_') || (('a' <= a.charAt(j)) && (a.charAt(j) <= 'z')) || (('A' <= a.charAt(j)) && (a.charAt(j) <= 'Z')) || ((48 <= a.charAt(j)) && (a.charAt(j) <= 57))))
				{
					lm++;
				}
			}
			if (lm == 0)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
			lm = 0;
		}
		return 0;
	}
}

