package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String word = new String(new char[50]);
	 int n;
	 int l;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (int i = 0; i < n; i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  word = tempVar2.charAt(0);
	  }
		  l = word.length();
		 if ((word.charAt(l - 1) == 'r') || (word.charAt(l - 1) == 'y'))
		 {
	  l = l - 2;
		 }
	  else
	  {
		  l = l - 3;
	  }
		 for (int j = 0; j < l; j++)
		 {
	   System.out.printf("%c", word.charAt(j));
		 }
	  System.out.print("\n");
	 }
	 return 0;
	}

}

