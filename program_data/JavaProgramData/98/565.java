package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  String a = new String(new char[20]);
	  int n;
	  int i;
	  int k = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  System.in.read();
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a = tempVar2.charAt(0);
	  }
	  System.out.printf("%s",a);
	  k = a.length();
	  for (i = 1;i < n;i++)
	  {
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   a = tempVar3.charAt(0);
		   }
		   k = k + 1 + a.length();
		   if (k > 80)
		   {
				System.out.printf("\n%s",a);
				k = a.length();
				continue;
		   }
		   if (k <= 80)
		   {
		   System.out.printf(" %s",a);
		   }
	  }
	}

}

