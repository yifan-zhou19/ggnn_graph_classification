package <missing>;

public class GlobalMembers
{
	public static void f()
	{
	 int i;
	 int x;
	 int y;
	 int n = 0;
	 final String a = "";
	 final String b = "";
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = tempVar.charAt(0);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 b = tempVar2.charAt(0);
	 }
	 x = a.length();
	 y = b.length();
	 for (i = 0;i <= y - 1;i++)
	 {
		 if (a.charAt(x - 1 - i) >= b.charAt(y - 1 - i))
		 {
			 a = tangible.StringFunctions.changeCharacter(a, x - 1 - i, a.charAt(x - 1 - i) - b.charAt(y - 1 - i) + 48);
		 }
		 else
		 {
			 a = tangible.StringFunctions.changeCharacter(a, x - 2 - i, a.charAt(x - 2 - i) - 1);
			 a = tangible.StringFunctions.changeCharacter(a, x - 1 - i, a.charAt(x - 1 - i) - b.charAt(y - 1 - i) + 10 + 48);
		 }
	 }
	 while (a.charAt(n) == '0')
	 {
		 n++;
	 }
	 for (i = n;i <= x - 1;i++)
	 {
		 System.out.printf("%c",a.charAt(i));
	 }
	 System.out.print("\n");
	}
	public static void Main()
	{
	 int n;
	 int i;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < n;i++)
	 {
		 f();
	 }
	}
}

