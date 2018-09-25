package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s = new String(new char[100]);
	int i;
	int j;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 s = tempVar2.charAt(0);
	 }
	 if (!(s.charAt(0) >= 'a' && s.charAt(0) <= 'z' || s.charAt(0) >= 'A' && s.charAt(0) <= 'Z' || s.charAt(0) == '_' || s.charAt(0) == '$'))
	 {
	   System.out.print("no\n");
	 }
	 else
	 {
	  for (j = 0;j < s.length();j++)
	  {
	   if (!(s.charAt(j) >= 'a' && s.charAt(j) <= 'z' || s.charAt(j) >= 'A' && s.charAt(j) <= 'Z' || s.charAt(0) == '_' || s.charAt(0) == '$' || s.charAt(j) >= '0' && s.charAt(j) <= '9'))
	   {
		System.out.print("no\n");
		break;
	   }
	  }
	  if (j == s.length())
	  {
		System.out.print("yes\n");
	  }
	 }
	}
	return 0;
	}
}

