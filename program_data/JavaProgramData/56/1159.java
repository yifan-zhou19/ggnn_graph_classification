package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int j;
	   String num = new String(new char[5]);
	   for (i = 0;i < 5;i++)
	   {

	   String tempVar = ConsoleInput.scanfRead(null, 1);
	   if (tempVar != null)
	   {
		   num = tangible.StringFunctions.changeCharacter(num, i, tempVar);
	   }
	   }
	   for (j = 4;j >= 0;j--)
	   {
		  if (num.charAt(j) != 0)
		  {
		System.out.printf("%c",num.charAt(j));
		  }
	   }

	}
}

