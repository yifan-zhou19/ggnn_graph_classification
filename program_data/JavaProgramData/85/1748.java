package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int len;
		String s = new String(new char[30]);
		char t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			t = tempVar2.charAt(0);
		}
		for (i = 0;i < n;i++)
		{
			s = new Scanner(System.in).nextLine();
			len = s.length();
			for (j = 0;j < len;)
			{
				if (s.charAt(j) >= '0' && s.charAt(j) <= '9' || s.charAt(j) >= 'a' && s.charAt(j) <= 'z' || s.charAt(j) >= 'A' && s.charAt(j) <= 'Z' || s.charAt(j) == '_')
				{
					j++;
				}
				else
				{
					break;
				}
			}
			if (j == len)
			{
				if (s.charAt(0) >= '0' && s.charAt(0) <= '9')
				{
					System.out.print("no\n");
				}
				else
				{
					System.out.print("yes\n");
				}
			}
			else
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}



}

