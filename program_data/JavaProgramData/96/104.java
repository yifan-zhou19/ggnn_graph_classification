package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[100]);
	a = new Scanner(System.in).nextLine();
	String b = new String(new char[99]);
	int x;
	int y;
	int j;
	  if (a.length() == 1)

	  {
			   System.out.printf("%d\n%d",0,a.charAt(0) - 48);
	  }
			   else
			   {
	for (j = 0;j < a.length() - 1;j++)
	{
		 x = (a.charAt(j) - 48) * 10 + (a.charAt(j + 1) - 48);
		b = tangible.StringFunctions.changeCharacter(b, j, x / 13);
		if (j != 0 || b.charAt(j) != 0 || a.length() == 2)
		{
		System.out.printf("%d",b.charAt(j));
		}
		 a = tangible.StringFunctions.changeCharacter(a, j + 1, x % 13 + 48);
	}
		 System.out.print("\n");
		 System.out.printf("%d",a.charAt(j) - 48);
			   }
	System.in.read();
	System.in.read();
	}


}

