package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int len;
	   int j;
	   int k;
	   int num = 0;
	   String str = new String(new char[81]);
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   System.in.read();
	   for (i = 0;i < n;i++)
	   {
			   num = 0;
			   str = new Scanner(System.in).nextLine();
			   if ((str.charAt(0) != '_') && ((str.charAt(0) > 'Z' && str.charAt(0) < 'a') || (str.charAt(0)>'z') || (str.charAt(0) < 'A')))
			   {
					 System.out.print(0);
					 System.out.print("\n");
					 continue;
			   }
			   len = str.length();
			   if (len == 1)
			   {
				   System.out.print(1);
				   System.out.print("\n");
			   }

			   else
			   {
					 for (j = 1;j < len;j++)
					 {
						   if ((str.charAt(j) >= '0' && str.charAt(j) <= '9') || ((str.charAt(j) >= 'A' && str.charAt(j) <= 'Z') || (str.charAt(j) >= 'a' && str.charAt(j) <= 'z')) || str.charAt(j) == '_')
						   {
						   num++;
						   }
					 }
					  if (num == len - 1)
					  {
						  k = 1;
					  }
					  else
					  {
						  k = 0;
					  }
					  System.out.print(k);
					  System.out.print("\n");
			   }
	   }
		return 0;
	}


}

