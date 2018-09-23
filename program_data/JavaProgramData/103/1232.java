package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		 String s = new String(new char[1000]);
		 String c = new String(new char[1000]);
		 int i;
		 int j;
		 int l;
		 int d = 0;
		 int[] t = new int[1000];
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 s = tempVar.charAt(0);
		 }
		 l = s.length();
		 c = tangible.StringFunctions.changeCharacter(c, 0, s.charAt(0));
		 t[0] = 1;
		 for (i = 1;i < l;i++)
		 {
			 if (s.charAt(i) == s.charAt(i - 1) || s.charAt(i) == s.charAt(i - 1) + 32 || s.charAt(i) == s.charAt(i - 1) - 32)
			 {
			 t[d]++;
			 }
			 else
			 {
				  d++;
				  c = tangible.StringFunctions.changeCharacter(c, d, s.charAt(i));
				  t[d]++;
			 }
		 }
		 for (i = 0;i <= d;i++)
		 {
		 if (c.charAt(i) <= 90)
		 {
		 System.out.printf("(%c,%d)",c.charAt(i),t[i]);
		 }
		 else
		 {
		 System.out.printf("(%c,%d)",c.charAt(i) - 32,t[i]);
		 }
		 }

	}

}

