package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int len;
		String s = new String(new char[81]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n;i++)
		{
			int flag = 0;
			s = new Scanner(System.in).nextLine();
			len = s.length();
			for (j = 0;j < len;j++)
			{
				if (j == 0)
				{
				   if (s.charAt(j) == '_' || (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') || (s.charAt(j) >= 'a' && s.charAt(j) <= 'z'))
				   {
					  flag = 1;
				   }
				   else
				   {
						  System.out.printf("%d\n",flag);
						  break;
				   }
				}
				else
				{
					 if (s.charAt(j) == '_' || (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') || (s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || (s.charAt(j) >= '0' && s.charAt(j) <= '9'))
					 {
					 flag = 1;
					 }
					 else
					 {
						 flag = 0;
						 System.out.printf("%d\n",flag);
						 break;
					 }
				}
			 if (j == len - 1)
			 {
			   System.out.printf("%d\n",flag);
			 }
			}
		}
	}
}

