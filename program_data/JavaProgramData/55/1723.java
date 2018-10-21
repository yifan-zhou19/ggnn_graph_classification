package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int m;
		 int x = 0;
		 int sum = 0;
		 int i;
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 String a = new String(new char[110]);
		 String b = new String(new char[110]);
		 a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		 m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (i = 0;i < a.length();i++)
		 {
		 if (a.charAt(i) >= '0' && a.charAt(i) <= '9')
		 {
		 x = a.charAt(i) - '0';
		 }
		 if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
		 {
		 x = 10 + a.charAt(i) - 'A';
		 }
		 if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
		 {
		 x = 10 + a.charAt(i) - 'a';
		 }
		 sum = sum * n + x;
		 }
		 i = 0;
		 do
		 {
		 b = tangible.StringFunctions.changeCharacter(b, i, sum % m);
		 if (b.charAt(i) >= 10)
		 {
		 b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 10 + 'A');
		 }
		 else
		 {
			 b.charAt(i) += '0';
		 }
		 sum = sum / m;
		 i++;
		 }while (sum > 0);
		 for (int k = i - 1;k >= 0;k--)
		 {
		 System.out.print(b.charAt(k));
		 }
		 return 0;
	}

}

