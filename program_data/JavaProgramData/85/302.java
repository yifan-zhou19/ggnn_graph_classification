package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int len;
		int j;
		int t;
		String a = new String(new char[30]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;++i)
		{
			t = 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			len = a.length();
			if (a.charAt(0) >= '0' && a.charAt(0) <= '9')
			{
				System.out.print("no\n");
			}
			else
			{
				for (j = 0;j < len;++j)
				{
					if (!(a.charAt(j) >= '0' && a.charAt(j) <= '9' || a.charAt(j) >= 'a' && a.charAt(j) <= 'z' || a.charAt(j) >= 'A' && a.charAt(j) <= 'Z' || a.charAt(j) == '_'))
					{
						t = 0;
					}
				}
				if (t != 0)
				{
					System.out.print("yes\n");
				}
				else
				{
					System.out.print("no\n");
				}
			}


		}


	}

}

