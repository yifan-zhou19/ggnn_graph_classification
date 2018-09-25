package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 String a = new String(new char[1000]);
		 String b = new String(new char[1000]);
		 int[] c = new int[1000];
		 for (int i = 0;i < 1000;i++)
		 {
		 c[i] = 1;
		 }
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a = tempVar.charAt(0);
		 }
		 int l;
		 l = a.length();
		 for (int i = 0;i < l;i++)
		 {
			 if (a.charAt(i) > 'Z')
			 {
			 a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a'+'A');
			 }
		 }
		 int n;
		 n = 0;
		 for (int i = 0;i < l;i++)
		 {
			 if (i == 0)
			 {
					  b = tangible.StringFunctions.changeCharacter(b, 0, a.charAt(0));
			 }
			 else if (a.charAt(i) == a.charAt(i - 1))
			 {
				  c[n] = c[n] + 1;
			 }
			 else if (a.charAt(i) != a.charAt(i - 1))
			 {
				  n = n + 1;
				  b = tangible.StringFunctions.changeCharacter(b, n, a.charAt(i));
			 }
		 }
		 for (int i = 0;i <= n;i++)
		 {
			 System.out.printf("(%c,%d)",b.charAt(i),c[i]);
		 }
		 System.in.read();
		 System.in.read();
	}
}

