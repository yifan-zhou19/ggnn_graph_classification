package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String s = new String(new char[256]);
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
				s = tempVar2.charAt(0);
			}
			int len = s.length();
			for (j = 0;j < len;j++)
			{
				if (j != len - 1)
				{
					switch (s.charAt(j))
					{
					   case 'A':
						   System.out.printf("%c",'T');
						   break;
					   case 'T':
						   System.out.printf("%c",'A');
						   break;
					   case 'C':
						   System.out.printf("%c",'G');
						   break;
					   case 'G':
						   System.out.printf("%c",'C');
						   break;
					}
				}
				else
				{
					switch (s.charAt(j))
					{
					   case 'A':
						   System.out.printf("%c\n",'T');
						   break;
					   case 'T':
						   System.out.printf("%c\n",'A');
						   break;
					   case 'C':
						   System.out.printf("%c\n",'G');
						   break;
					   case 'G':
						   System.out.printf("%c\n",'C');
						   break;
					}
				}
			}
		}
		return 0;
	}
}

