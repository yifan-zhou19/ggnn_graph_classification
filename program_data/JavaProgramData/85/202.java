package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a = 0;
		int m;
		String s = new String(new char[20]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			m = s.length();
			a = 0;
		for (j = 0;j < m;j++)
		{
			  if ((j == 0) && (s.charAt(0) >= '0') && (s.charAt(0) <= '9'))
			  {
				  a = 1;
				  break;
			  }
			if ((s.charAt(j) == '_') || ((s.charAt(j) <= 'z') && (s.charAt(j) >= 'a')) || ((s.charAt(j) <= 'Z') && (s.charAt(j) >= 'A')) || ((s.charAt(j) <= '9') && (s.charAt(j) >= '0')))
			{
			a = 0;
			}
		else
		{
			a = 1;
			break;
		}
		}
		if (a == 0)
		{
			System.out.print("yes\n");
		}
		if (a == 1)
		{
			System.out.print("no\n");
		}
		}
		return 0;
	}
}

