package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int n;
		int j;
		int m;
		int b;
		String s = new String(new char[21]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			b = 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			m = s.length();
			for (j = 0;j < m;j++)
			{
				if (j == 0)
				{
				if ((s.charAt(0) >= '0') && (s.charAt(0) <= '9'))
				{
					System.out.print("no\n");
					b = 0;
				}
				}
				if (b == 0)
				{
					break;
				}
				if (((s.charAt(j) >= '0') && (s.charAt(j) <= '9')) || ((s.charAt(j) >= 'A') && (s.charAt(j) <= 'Z')) || ((s.charAt(j) >= 'a') && (s.charAt(j) <= 'z')) || (s.charAt(j) == '_'))
				{
					b = b + 0;
				}
				else
				{
					System.out.print("no\n");
					b = 0;
				}
				if (b == 0)
				{
					break;
				}
			}
			if (b == 1)
			{
				System.out.print("yes\n");
			}
		}
	}
}

