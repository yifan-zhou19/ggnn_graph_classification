package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String A = new String(new char[1000]);
	   int a;
	   int b;
	   int c;
	   int n;
	   int i;
	   int m;
	   A = new Scanner(System.in).nextLine();
	   b = 0;
	   n = A.length();
	   for (i = 0;i < n;i++)
	   {
	   if (A.charAt(i) == ' ' && A.charAt(i + 1) == ' ')
	   {
	   for (m = 0;m + i < n;m++)
	   {
		  A = tangible.StringFunctions.changeCharacter(A, i + m, A.charAt(i + 1 + m));
	   }
		i = i - 1;
	   }
	   }
	   for (i = 0;i < n;i++)
	   {
		  if (A.charAt(i) != ' ')
		  {
			  if (A.charAt(i + 1) == '\0')
			  {
			  b = b + 1;
			  System.out.printf("%d",b);
			  break;
			  }
		  b = b + 1;
		  }
		  else
		  {
		  System.out.printf("%d,",b);
		  b = 0;
		  }
	   }
	  return 0;
	}
}

