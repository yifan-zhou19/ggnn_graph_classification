package <missing>;

public class GlobalMembers
{
	/* Note:Your choice is C IDE */
	public static void Main()
	{
		 String str = new String(new char[11]);
		 String substr = new String(new char[4]);
		 String A = new String(new char[15]);
		 int i;
		 int M;
		 int N;
		 int n;
		 int h;
		 while (scanf("%s%s",str,substr) != EOF)
		 {
		 n = str.length();
		 i = 1;
		 N = str.charAt(0);
		 while (i <= n - 1)
		 {
			 if (str.charAt(i) > N)
			 {
				 N = str.charAt(i);
				 M = i;
			 }
			 else
			 {
				 N = N;
				 M = M;
			 }
			 i++;
		 }
		 i = 0;
		 while (i <= M)
		 {
			 A = tangible.StringFunctions.changeCharacter(A, i, str.charAt(i));
			 i++;
		 }
		 A = tangible.StringFunctions.changeCharacter(A, M + 1, substr.charAt(0));
		 A = tangible.StringFunctions.changeCharacter(A, M + 2, substr.charAt(1));
		 A = tangible.StringFunctions.changeCharacter(A, M + 3, substr.charAt(2));
		 while (i <= n - 1)
		 {
			 A = tangible.StringFunctions.changeCharacter(A, i + 3, str.charAt(i));
			 i++;
		 }
		 i = 0;
		 while (i <= n + 2)
		 {
		   System.out.printf("%c",A.charAt(i));
		   i++;
		 }
		 System.out.print("\n");
		 }
	}

}

