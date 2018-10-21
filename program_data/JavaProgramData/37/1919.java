package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100000]);
		int t;
		int i;
		int j;
		int k;
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (k = 0;k < t;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			n = s.length();

			for (i = 0;i < n;i++)
			{
				m = 0;
				for (j = 0;j < n;j++)
				{
					if (s.charAt(i) == s.charAt(j))
					{
					m++;
					}
					else
					{
						;
					}
				}
				if (m == 1)
				{
				break;
				}
				else
				{
					;
				}
			}
			if (m != 1)
			{
			System.out.print("no\n");
			}
			else
			{
			System.out.printf("%c\n",s.charAt(i));
			}
		}


	}
}

