package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int l;
		int j;
	 final String a = "";
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
			 a = tangible.StringFunctions.changeCharacter(a, i, tempVar2);
		 }
	 }
	 for (i = 0;i < n;i++)
	 {
		 l = String.valueOf(a.charAt(i)).length();
	  if (a.charAt(i)[l - 1] == 'r')
	  {
		  for (j = 0;j < l - 2;j++)
		  {
	   System.out.printf("%c",a.charAt(i)[j]);
		  }
	   System.out.print("\n");
	  }
	  else if (a.charAt(i)[l - 1] == 'y')
	  {
		  for (j = 0;j < l - 2;j++)
		  {
	   System.out.printf("%c",a.charAt(i)[j]);
		  }
	   System.out.print("\n");
	  }
	  else if (a.charAt(i)[l - 1] == 'g')
	  {
		  for (j = 0;j < l - 3;j++)
		  {
	   System.out.printf("%c",a.charAt(i)[j]);
		  }
	   System.out.print("\n");
	  }
	 }
	}



}

