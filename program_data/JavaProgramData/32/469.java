package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 void usd(char x[100]);
		 String a = new String(new char[100]);
		 String b = new String(new char[100]);
		 final String c = "";
		 int i;
		 int j;
		 int k;
		 int p;
		 int n;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (p = 0;p < n;p++)
		 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a = tempVar2.charAt(0);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 b = tempVar3.charAt(0);
		 }
		 usd(a);
		 usd(b);
		 k = 0;
		 for (i = 0;b.charAt(i) != '\0';i++)
		 {
			 if (a.charAt(i) >= b.charAt(i))
			 {
				 c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(i) - b.charAt(i) + 48);
			 }
			 else
			 {
				  c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(i) + 58 - b.charAt(i));
				  a = tangible.StringFunctions.changeCharacter(a, i + 1, a.charAt(i + 1) - 1);
			 }
			 k++;
		 }
		 for (j = k;a.charAt(j) != '\0';j++)
		 {
			 c = tangible.StringFunctions.changeCharacter(c, j, a.charAt(j));
		 }
		 c = tangible.StringFunctions.changeCharacter(c, j, '\0');
		 usd(c);
		 System.out.printf("%s\n",c);
		 }
	}
	public static void usd(String x)
	{
		 int r;
		 int h;
		 int i;
		 char w;
		 r = x.length();
		 h = r / 2;
		 for (i = 0;i < h;i++)
		 {
			 w = x[i];
			 x[i] = x[r - 1 - i];
			 x[r - 1 - i] = w;
		 }
	}






}

