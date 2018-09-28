package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int i;
	   int n;
	   int[] a = new int[5];
	   char c;
	   char t;
	   String str = new String(new char[5]);
	   str = new Scanner(System.in).nextLine();
	   n = 0;
	   for (i = 0;(c = str.charAt(i)) != '\0';i++)
	   {
		  n = n + 1;
	   }
	   for (i = 0;i < n / 2;i++)
	   {
		 t = str.charAt(i);
		 str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(n - 1 - i));
		 str = tangible.StringFunctions.changeCharacter(str, n - 1 - i, t);
	   }
		 for (i = 0;i < n;i++)
		 {
			 System.out.printf("%c",str.charAt(i));
		 }
	}



}

