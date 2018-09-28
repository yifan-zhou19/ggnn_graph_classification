package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l;
		int t;
		int i;
		int j;
		int k;
		int m;
		String s = new String(new char[100001]);
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
			l = s.length();
			for (i = 0;i < l;i++)
			{
				for (j = 0;j < i;j++)
				{
					if (s.charAt(j) == s.charAt(i))
					{
					break;
					}
				}
				for (m = i + 1;m < l;m++)
				{
					if (s.charAt(m) == s.charAt(i))
					{
					break;
					}
				}
				if (j == i && m == l)
				{
					System.out.printf("%c\n",s.charAt(i));
					break;
				}
			}
		   if (i == l)
		   {
			   System.out.print("no\n");
		   }
		}
	System.in.read();
	System.in.read();
	}
}

