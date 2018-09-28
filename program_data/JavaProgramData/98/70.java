package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int num = 0;
		int len;
		String s = new String(new char[100]);
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
			len = s.length();
			if (num == 0)
			{
				System.out.printf("%s",s);
				num = len;
				continue;
			}
		   if (num + len < 80)
		   {
			   System.out.printf(" %s",s);
			   num = num + len + 1;
			   continue;
		   }
		   if (num + len >= 80)
		   {
			   System.out.printf("\n%s",s);
			   num = len;
			   continue;
		   }
		}
		return 0;
	}

}

