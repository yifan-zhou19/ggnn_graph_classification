package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int isbreak;
		String s = new String(new char[21]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			isbreak = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			if (s.charAt(0) == '_' || (s.charAt(0) <= 'Z' && s.charAt(0) >= 'A') || (s.charAt(0) <= 'z' && s.charAt(0) >= 'a'))
			{
				   for (i = 1;s.charAt(i) != '\0';i++)
				   {
					   if (s.charAt(i) == '_' || (s.charAt(i) <= 'Z' && s.charAt(i) >= 'A') || (s.charAt(i) <= 'z' && s.charAt(i) >= 'a') || (s.charAt(i) <= '9' && s.charAt(i) >= '0'))
					   {
						   continue;
					   }
					   else
					   {
						   isbreak = 1;
						   System.out.print("no\n");
						   break;
					   }
				   }
			}
			 else
			 {
						System.out.print("no\n");
						isbreak = 1;
			 }

			 if (isbreak == 1)
			 {
				 continue;
			 }
			 else if (isbreak == 0)
			 {
				 System.out.print("yes\n");
				 continue;
			 }
		}
	}

}

