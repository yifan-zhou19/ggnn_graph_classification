package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		 String a = new String(new char[2000]);
		 int b = 1;
		 int i;
		 int j;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a = tempVar.charAt(0);
		 }
		 for (i = 0;a.charAt(i) != '\0';i++)
		 {
							if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
							{
							a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
							}
		 }
		 for (j = 0;a.charAt(j) != '\0';j++)
		 {
							if (a.charAt(j) == a.charAt(j + 1))
							{
							b = b + 1;
							}
							else
							{
								System.out.printf("(%c,%d)",a.charAt(j),b);
								b = 1;
							}
		 }
		 System.in.read();
		 System.in.read();
		 System.in.read();
		 System.in.read();
		 System.in.read();

	 }
}

