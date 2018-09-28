package <missing>;

public class GlobalMembers
{
	public static void fun(String a)
	{
	 String p = a;
	 String t = new String(new char[100]);
	 String s = new String(new char[100]);
	 int index;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	 memset(s,0,100);
	 while (*p != null)
	 {
	  if (!Character.isLetter(*p))
	  {
		  *p = ' ';
	  }
	  p = p.Substring(1);
	 }
	 p = a;
	 while (tangible.StringFunctions.strStr(p," ") != null)
	 {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	  memset(t,0,100);
	  index = tangible.StringFunctions.strStr(p," ") - p;
	  if (index > 0)
	  {
	   t = p.substring(0, index);
	   t += " ";
	   t += s;
	   s = t;
	  }
	  else
	  {
	   t = " ";
	   t += s;
	   s = t;
	  }
	  p += index + 1;
	 }
	 if (*p != null)
	 {
	  t = p;
	  t += " ";
	  t += s;
	  s = t;
	 }
	 a = s;
	}
	public static void Main()
	{
	 String s = new String(new char[100]);
	 int i;
	 s = new Scanner(System.in).nextLine();
	 fun(s);
	 for (i = 0;i < s.length() - 1;i++)
	 {
		 System.out.printf("%c",s.charAt(i));
	 }
	}
}

