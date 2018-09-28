package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int flag;
		int bigflag = 0;
		int len;
		int i;
		int j;
		String s = new String(new char[100000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			bigflag = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			len = s.length();
			for (i = 0;i < len - 1;i++)
			{
				flag = 0;
				for (j = 0;j != i;j++)
				{
				if (s.charAt(i) == s.charAt(j))
				{
					   flag = 1;
				} //over our search
				}
				for (j = len - 1;j != i;j--)
				{
				if (s.charAt(i) == s.charAt(j))
				{
					   flag = 1;
				} //over our search
				}

				if (flag == 0)
				{
					System.out.printf("%c\n",s.charAt(i));
					bigflag = 1;
					break;
				}
			}
			if (bigflag == 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;

	}
}

