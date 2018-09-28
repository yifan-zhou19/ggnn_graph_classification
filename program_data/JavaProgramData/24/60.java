package <missing>;

public class GlobalMembers
{
	 public static int shifouzimu(char c)
	 {
		 if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
		 {
		 return (1);
		 }
		  else
		  {
			  return (0);
		  }
	 }
	 public static int longl(String string)
	 {
	   int len = 0;
	   int i;
	   int length = 0;
	   int flag = 1;
	   int place = 0;
	   int point;
	   for (i = 0;i <= String.length();i++)
	   {
	 if (shifouzimu(String[i]) != 0)
	 {
		   if (flag != 0)
		   {
				point = i;
				flag = 0;
		   }
		 else
		 {
			len++;
		 }

	 }
		else
		{
	 flag = 1;
			if (len > length)
			{
	  length = len;
	  place = point;
	 //    len=0;
			}
	 len = 0;
		}
	   }
	   return (place);
	 }
	 public static int shortl(String string)
	 {
		 int len = 0;
		 int i;
		 int length = 5;
		 int flag = 1;
		 int place = 0;
		 int point;
		 for (i = 0;i <= String.length();i++)
		 {
		  if (shifouzimu(String[i]) != 0)
		  {
			 if (flag != 0)
			 {
				  point = i;
				  flag = 0;
			 }
		   else
		   {
				 len++;
		   }
		  }

			else
			{
		flag = 1;
			  if (len < length)
			  {
	  length = len;
				 place = point;
		//        len=0;
			  }
	  len = 0;
			}
		 }
			 return (place);
	 }
	public static void Main()
	{

		 int i;
		 String line = new String(new char[1000]);
		 line = new Scanner(System.in).nextLine();
		  for (i = longl(line);shifouzimu(line.charAt(i)) != 0;i++)
		  {
		System.out.printf("%c",line.charAt(i));
		  }
	System.out.print("\n");
		  for (i = shortl(line);shifouzimu(line.charAt(i)) != 0;i++)
		  {
	  System.out.printf("%c",line.charAt(i));
		  }
	}

}
