package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int len;
	   int i;
	   int j;
	   int maxASCII = 0;
	   int max;
	   String str = new String(new char[15]);
	   String substr = new String(new char[4]);
	   String p = str;
	   String q = substr;
	   while ((str = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0 && (substr = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
	   {
		  maxASCII = 0;
		  len = str.length();
		  for (i = 0;i < len;i++)
		  {
			  if (*(p.Substring(i)) > maxASCII)
			  {
				 maxASCII = (p.Substring(i));
				 max = i;
			  }
		  }
		  for (i = len - 1;i > max;i--)
		  {
			  *(p.Substring(i) + 3) = *(p.Substring(i));
		  }
		  for (i = max + 1,j = 0;i <= max + 3;i++,j++)
		  {
			  *(p.Substring(i)) = *(q.Substring(j));
		  }
		  for (i = 0;i < len + 3;i++)
		  {
			  System.out.print(str.charAt(i));
		  }
		  System.out.print("\n");
	   }
	   return 0;
	}
}

