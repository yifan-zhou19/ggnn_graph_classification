package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int n;
	  int i;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  while (n-- != 0)
	  {
	  String a = new String(new char[25]);
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a = tempVar2.charAt(0);
	  }
	  int len = a.length();
	  int t = 1;
	  if (!(a.charAt(0) >= 'A' && a.charAt(0) <= 'Z' || a.charAt(0) >= 'a' && a.charAt(0) <= 'z' || a.charAt(0) == '_'))
	  {
		System.out.print("no\n");
		continue;
	  }
	  for (i = 0;i < len;i++)
	  {
		if (!(a.charAt(i) >= 'A' && a.charAt(i) <= 'Z' || a.charAt(i) >= 'a' && a.charAt(i) <= 'z' || a.charAt(i) == '_' || a.charAt(i) >= '0' && a.charAt(i) <= '9'))
		{
		  t = 0;
		  break;
		}

	  }
	  if (t != 0)
	  {
	  System.out.print("yes\n");
	  }
	  else
	  {
	  System.out.print("no\n");
	  }
	  }
	}
}

