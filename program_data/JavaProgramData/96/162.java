package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String a = new String(new char[100]);
	  String d = new String(new char[100]);
	  String f = new String(new char[100]);
	  int n;
	  int i;
	  int j;
	  int l;
	  int k;
	  int[] b = new int[100];
	  int[] c = new int[100];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = tempVar.charAt(0);
	  }
	  j = a.length();
	  for (i = 0;i < j;i++)
	  {
	  b[i] = a.charAt(i) - '0';
	  }
	  if (j < 3 && b[0] * 10 + b[1] < 13)
	  {
		 System.out.print("0\n");
		 System.out.printf("%d",b[0] * 10 + b[1]);
	  }
		 else if (j == 1)
		 {
			  System.out.print("0\n");
			  System.out.printf("%d",b[0]);
		 }
	   else
	   {
		 for (i = 0;i < j;i++)
		 {
		   c[i] = b[i] / 13;
		   if (c[i] == 0)
		   {
		   b[i + 1] = b[i] * 10 + b[i + 1];
		   }
		   else
		   {
		   b[i + 1] = (b[i] - 13 * c[i]) * 10 + b[i + 1];
		   }
		   d = tangible.StringFunctions.changeCharacter(d, i, c[i] + '0');
		   k = b[i] - 13 * c[i];
		 }
	 d = tangible.StringFunctions.changeCharacter(d, j, '\0');
	 j = d.length();
	 if (d.charAt(1) == '0')
	 {
	 for (i = 0;i < (j - 2);i++)
	 {
					   d = tangible.StringFunctions.changeCharacter(d, i, d.charAt(i + 2));
	 }
	 d = tangible.StringFunctions.changeCharacter(d, j - 2, '\0');

	 }
	 else
	 {
		 for (i = 0;i < (j - 1);i++)
		 {
						   d = tangible.StringFunctions.changeCharacter(d, i, d.charAt(i + 1));
		 }
						   d = tangible.StringFunctions.changeCharacter(d, j - 1, '\0');
	 }
	  System.out.printf("%s\n",d);
	   System.out.printf("%d",k);
	   }
	  System.in.read();
	  System.in.read();
	}


}

