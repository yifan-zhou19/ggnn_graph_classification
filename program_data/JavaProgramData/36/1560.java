package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String s1 = new String(new char[100]);
		int geshu;
		int geshu1;
		int l;
		int l1;
		int i;
		int j;
		int pd = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s1 = tempVar2.charAt(0);
		}
		l = s.length();
		l1 = s1.length();
		if (l != l1)
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0;i < l;i++)
			{
				geshu = 0;
				geshu1 = 0;
				for (j = 0;j < l;j++)
				{
					if (s.charAt(j) == s.charAt(i))
					{
						geshu++;
					}
					if (s1.charAt(j) == s.charAt(i))
					{
						geshu1++;
					}
				}
				if (geshu != geshu1)
				{
					pd = 1;
				}
			}
			if (pd == 0)
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}
		}
		return 0;
	}



}

