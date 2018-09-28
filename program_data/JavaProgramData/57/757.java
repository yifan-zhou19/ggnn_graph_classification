package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int p;
	   int q;
	   int t;
	   int m;
	   int i;
	   String A = new String(new char[32]);
	   final String a = "er";
	   final String b = "ly";
	   final String c = "ing";
	   String e = new String(new char[3]);
	   String d = new String(new char[4]);
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
			   A = tempVar2.charAt(0);
		   }
		   m = A.length();
		   e = tangible.StringFunctions.changeCharacter(e, 0, A.charAt(m - 2));
		   e = tangible.StringFunctions.changeCharacter(e, 1, A.charAt(m - 1));
		   e = tangible.StringFunctions.changeCharacter(e, 2, '\0');
		   d = tangible.StringFunctions.changeCharacter(d, 0, A.charAt(m - 3));
		   d = tangible.StringFunctions.changeCharacter(d, 1, A.charAt(m - 2));
		   d = tangible.StringFunctions.changeCharacter(d, 2, A.charAt(m - 1));
		   d = tangible.StringFunctions.changeCharacter(d, 3, '\0');
			p = strcmp(e,a);
			q = strcmp(e,b);
			t = strcmp(d,c);
		   if (p == 0 || q == 0)
		   {
				A = tangible.StringFunctions.changeCharacter(A, m - 2, '\0');
				System.out.printf("%s\n",A);
		   }
		   else
		   {
			   if (t == 0)
			   {
					A = tangible.StringFunctions.changeCharacter(A, m - 3, '\0');
					System.out.printf("%s\n",A);
			   }
			   else
			   {
			   System.out.printf("%s\n",A);
			   }
		   }
	   }
		   return 0;

	}

}

