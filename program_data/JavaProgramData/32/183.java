package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int j;
	  int n;
	  int a;
	  int b;
	  int m;
	  String c = new String(new char[100]);
	  String d = new String(new char[100]);
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
			 c = tempVar2.charAt(0);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 d = tempVar3.charAt(0);
		 }
		 a = c.length();
		 b = d.length();
		 m = b - 1;
		 for (j = a;j > a - b;j--)
		 {

			  if (c.charAt(j - 1) >= d.charAt(m))
			  {
				  c = tangible.StringFunctions.changeCharacter(c, j - 1, c.charAt(j - 1) - d.charAt(m) + 48);
				  m--;
			  }
				else
				{
				  c = tangible.StringFunctions.changeCharacter(c, j - 1, c.charAt(j - 1) + 10 - d.charAt(m) + 48);
				  c.charAt(j - 2)--;
				  m--;
				}
		 }
		 j = 0;
		 while (c.charAt(j) == 0)
		 {
			 j++;
		 }
		  for (;j < a;j++)
		  {
		  System.out.printf("%c",c.charAt(j));
		  }
		  System.out.print("\n");

	   }

	return 0;
	}
}

