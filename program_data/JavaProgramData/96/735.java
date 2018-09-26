package <missing>;

public class GlobalMembers
{
	//*************************
	//*  ?????13 
	//*  ????? 
	//*  ???1200012941 
	//*  ???2012?11?12? 
	//*************************
	public static int Main()
	{
		int i;
		int count = 0;
		int y;
		String num = new String(new char[100]);
		int[] s = new int[100];
		num = ConsoleInput.readToWhiteSpace(true).charAt(0);
		y = num.charAt(0) - '0';
		for (i = 1; num.charAt(i) != '\0'; i++)
		{
			 s[i] = (y * 10 + num.charAt(i) - '0') / 13;
			 y = (y * 10 + num.charAt(i) - '0') % 13;
			 count++;
		}
		if (count == 0)
		{
		   System.out.print(0);
		   System.out.print("\n");
		   System.out.print(y);
		   System.out.print("\n");
		}
		if (count > 0)
		{
		   if (((num.charAt(0) - '0') * 10 + num.charAt(1) - '0') / 13 == 0)
		   {
			  if (s[2] == 0)
			  {
				 System.out.print(0);
				 System.out.print("\n");
				 System.out.print((num.charAt(0) - '0') * 10 + num.charAt(1) - '0');
				 System.out.print("\n");
			  }
			  else
			  {
				 for (i = 2; i <= count; i++)
				 {
					 System.out.print(s[i]);
				 }
				 System.out.print("\n");
				 System.out.print(y);
				 System.out.print("\n");
			  }
		   }
		   else
		   {
			  for (i = 1; i <= count; i++)
			  {
				  System.out.print(s[i]);
			  }
			  System.out.print("\n");
			  System.out.print(y);
			  System.out.print("\n");
		   }
		}
		return 0;
	}
}

