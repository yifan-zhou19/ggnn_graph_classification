package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 String word = new String(new char[50]);
	 int a = 0;
	 int b = 0;
	 int c;
	 int d;
	 int i;
	 int n;
	 int j;
	 int k;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 word = tempVar2.charAt(0);
	 }
	  a = word.length() + 1;
	  b = b + a;
	  System.out.printf("%s",word);
	 for (i = 1;i < n;i++)
	 {
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  word = tempVar3.charAt(0);
	  }
	  a = word.length() + 1;
	  b = b + a;
	  if (b <= 81)
	  {
		  System.out.printf(" %s",word);
	  }
	   if (b > 81)
	   {
	   System.out.printf("\n%s",word);
	   b = a;
	   }
	 }
	}
}

