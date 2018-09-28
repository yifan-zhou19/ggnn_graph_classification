package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int m;
	 int i;
	 int k;
	 int num = 0;
	 String in = new String(new char[255]);
	 final String out = "0";
	 String a2 = new String(new char[128]);
	 final String a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	 for (i = 0;i <= '9';i++)
	 {
	  a2 = tangible.StringFunctions.changeCharacter(a2, i, i - '0');
	 }
	 for (i = 'a';i <= 'z';i++)
	 {
	  a2 = tangible.StringFunctions.changeCharacter(a2, i, i - 'a' + 10);
	 }
	 for (i = 'A';i <= 'Z';i++)
	 {
	  a2 = tangible.StringFunctions.changeCharacter(a2, i, i - 'A' + 10);
	 }

	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 in = tempVar2.charAt(0);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 m = Integer.parseInt(tempVar3);
	 }

	 for (i = 0;in.charAt(i) != '\0';i++)
	 {
	  num = num * n + a2.charAt(in.charAt(i));
	 }

	 if (num == 0)
	 {
	  k = 1;
	 }
	 else
	 {
		 k = 0;
	 }

	 while (num > 0)
	 {
	  out = tangible.StringFunctions.changeCharacter(out, k, a.charAt(num % m));
	  k++;
	  num = num / m;
	 }

	 for (i = k - 1;i >= 0;i--)
	 {
	  System.out.printf("%c",out.charAt(i));
	 }
	 System.out.print("\n");
	 return 0;
	}




}

