package <missing>;

public class GlobalMembers
{
	public static int panduan(String str)
	{
	 int n;
	 int i;
	 n = str.length();
	 if ((!str[0].equals('_')) && ((str[0].compareTo(65) < 0) || (str[0].compareTo(122) > 0) || ((str[0].compareTo(90) > 0) && (str[0].compareTo(97) < 0))))
	 {
	  return 0;
	 }
	 else
	 {
	  for (i = 0;i < n;i++)
	  {
	   if ((!str[i].equals('_')) && ((str[i].compareTo(48) < 0) || (str[i].compareTo(122) > 0) || ((str[i].compareTo(90) > 0) && (str[i].compareTo(97) < 0)) || ((str[i].compareTo(57) > 0) && (str[i].compareTo(65) < 0))))
	   {
		return 0;
	   }
	  }
	 }
	  return 1;
	}
	public static int Main()
	{
	 int n;
	 int i;
	 int a;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < n;i++)
	 {
	  String ch = new String(new char[100]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			ch = tempVar2.charAt(0);
		}
	  a = panduan(ch);
	  if (a != 0)
	  {
	   System.out.print("yes\n");
	  }
	  else
	  {
	   System.out.print("no\n");
	  }
	 }
	 return 0;
	}




}

