package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		 String a = new String(new char[20]);
		 String b = new String(new char[20]);
		 char m;
		 char n;
		 int i;
		 int j;
		 int t;
		 t = 1;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a = tempVar.charAt(0);
		 }
		 String tempVar2 = ConsoleInput.scanfRead(" ");
		 if (tempVar2 != null)
		 {
			 b = tempVar2.charAt(0);
		 }
		 for (i = 0;i < a.length();i++)
		 {
			 for (j = 0;j < a.length() - i;j++)
			 {
				 if (a.charAt(j) > a.charAt(j + 1))
				 {
					 m = a.charAt(j);
				 a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
				 a = tangible.StringFunctions.changeCharacter(a, j + 1, m);
				 }
			 }
		 }
		 for (i = 0;i < b.length();i++)
		 {
			 for (j = 0;j < b.length() - i;j++)
			 {
				 if (b.charAt(j) > b.charAt(j + 1))
				 {
					 n = b.charAt(j);
				 b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j + 1));
				 b = tangible.StringFunctions.changeCharacter(b, j + 1, n);
				 }
			 }
		 }
		 for (i = 0;i < a.length();i++)
		 {
			 if (a.charAt(i) != b.charAt(i))
			 {
				 t = 0;
				 break;
			 }
			 else
			 {
				 continue;
			 }
		 }
		 if (t == 0)
		 {
			 System.out.print("NO");
		 }
		 if (t == 1)
		 {
			 System.out.print("YES");
		 }
	}


}

