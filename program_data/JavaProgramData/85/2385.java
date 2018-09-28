package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[MAX + 1]);
		int n;
		int i;
		int j;
		int len;
	str = new Scanner(System.in).nextLine();
	n = Integer.parseInt(str);
	  for (i = 0;i < n;i++)
	  {
		  str = new Scanner(System.in).nextLine();
	 len = str.length();
		  if ((str.charAt(0) <= 'z' && str.charAt(0) >= 'a') || (str.charAt(0) <= 'Z' && str.charAt(0) >= 'A') || str.charAt(0) == '_')
		  {
		   for (j = 1;j < len;j++)
		   {
			   if ((str.charAt(j) <= 'z' && str.charAt(j) >= 'a') || (str.charAt(j) <= 'Z' && str.charAt(j) >= 'A') || (str.charAt(j) == '_') || (str.charAt(j) <= '9' && str.charAt(j) >= '0'))
			   {
				   continue;
			   }
			   else
			   {
				   break;
			   }
		   }
		   if (j == len)
		   {
			   System.out.print("yes\n");
		   }
			else
			{
	System.out.print("no\n");
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
