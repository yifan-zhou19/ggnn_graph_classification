package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[300]);
		char j;
		char i;
		int b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		for (i = 'A';i <= 'Z';i++)
		{
			int num1 = 0;
			for (j = 0;j < s.length();j++)
			{
				if (i == s.charAt(j))
				{
					num1++;
				}
			}
			if (num1 != 0)
			{
			   System.out.printf("%c=%d\n",i,num1);
			   b = 1;
			}
		}
		for (i = 'a';i <= 'z';i++)
		{
			int num = 0;
			for (j = 0;j < s.length();j++)
			{
				if (i == s.charAt(j))
				{
					num++;
				}
			}
			if (num != 0)
			{
			   System.out.printf("%c=%d\n",i,num);
			   b = 1;
			}
		}
		if (b == 0)
		{
			System.out.print("No");
		}
		return 0;
	}









}

