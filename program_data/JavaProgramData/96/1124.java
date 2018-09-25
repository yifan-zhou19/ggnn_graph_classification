package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
	int t;
	int i;
	int x;
	int cd;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	cd = a.length();
	for (i = 0;i < cd;i++)
	{
		  a.charAt(i) -= '0';
	}

		  if (cd == 1)
		  {
		  System.out.printf("0\n%d",a.charAt(0));
		  }
		  else if (cd == 2 && 10 * a.charAt(0) + a.charAt(1) < 13)
		  {
		  System.out.printf("0\n%d",10 * a.charAt(0) + a.charAt(1));
		  }
		  else
		  {
	for (i = 0;i <= cd - 2;i++)
	{
	   x = a.charAt(i) * 10 + a.charAt(i + 1);
	   b = tangible.StringFunctions.changeCharacter(b, i, x / 13);
	   a = tangible.StringFunctions.changeCharacter(a, i + 1, x - b.charAt(i) * 13);
	}
	   if (b.charAt(0) != 0)
	   {
	   System.out.printf("%d",b.charAt(0));
	   }
	   for (i = 1;i <= cd - 2;i++)
	   {
	   System.out.printf("%d",b.charAt(i));
	   }
	   System.out.printf("\n%d",a.charAt(i));
		  }
	}




}

