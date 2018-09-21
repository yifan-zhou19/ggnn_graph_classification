package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p', so pointers on this parameter are left unchanged:
	public static swap(char * p, int n)
	{
		String q;
		String a;
		q = p - n + 1;
		for (;p >= q;p--)
		{
			if ((*p) == ' ')
			{
			   a = p;
			   if (a != q)
			   {
				   for (p = p.Substring(1); * p != '\0';p++)
				   {
					  System.out.printf("%c",*p);
					  if (*(p.Substring(1)) == '\0')
					  {
						  System.out.print(" ");
						  break;
					  }
					  else if ((*p) == ' ')
					  {
						  break;
					  }
				   }
				   p = a - 1;
			   }
			}
		}
		 p = q;
		 for (;;p++)
		 {
		   if ((*p) == ' ' || *p == '\0')
		   {
			   break;
		   }
		   else
		   {
			   System.out.printf("%c",*p);
		   }
		 }
			return 0;
	}
	public static int Main()
	{
		String p;
		String str = new String(new char[1000]);
		int len;
		str = new Scanner(System.in).nextLine();
		len = str.length();
		p = str.Substring(len) - 1;
		swap(p, len);
	}
}
