package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String a = new String(new char[100]);
	   String b = new String(new char[100]);
	   a = ConsoleInput.readToWhiteSpace(true).charAt(0);
	   b = ConsoleInput.readToWhiteSpace(true).charAt(0);
	   int sizea = a.length();
	   int sizeb = b.length();
	   if (sizea != sizeb)
	   {
	   System.out.print("NO");
	   }
	   else
	   {
		   int i;
		   int j;
		   for (i = 0;i < sizea;i++)
		   {
		   for (j = i + 1;j < sizea;j++)
		   {
			   char t;
			   if (a.charAt(j) > a.charAt(i))
			   {
				  t = a.charAt(j);
				  a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(i));
				  a = tangible.StringFunctions.changeCharacter(a, i, t);
			   }
			   if (b.charAt(j) > b.charAt(i))
			   {
				 t = b.charAt(j);
				 b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(i));
				 b = tangible.StringFunctions.changeCharacter(b, i, t);
			   }
		   }
		   }
		   for (i = 0;i < sizea;i++)
		   {
		   if (b.charAt(i) != a.charAt(i))
		   {
		   break;
		   }
		   }
		   if (i == sizea)
		   {
		   System.out.print("YES");
		   }
		   else if (i != sizea)
		   {
		   System.out.print("NO");
		   }
	   }
	   System.in.read();
	   System.in.read();
	   System.in.read();
	   return 0;
	}

}

