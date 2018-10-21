package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  String a = new String(new char[50]);
	  int n;
	  int i;
	  int j;
	  int line;
	  int l;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a = tempVar2.charAt(0);
	  }
	  System.out.printf("%s",a);
	  line = a.length();
	  for (i = 2;i <= n;i++)
	  {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a = tempVar3.charAt(0);
		  }
		  line += a.length() + 1;
		  if (line <= 80)
		  {
			  System.out.printf(" %s",a);
		  }
		  else
		  {
			  System.out.printf("\n%s",a);
			  line = a.length();
		  }
	  }

	}
}

