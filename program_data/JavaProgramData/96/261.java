package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  final String z = "";
		  final String y = "";
		  int count = 0;
		  int i = 0;
		  int shu = 0;
		  int j;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  z = tempVar.charAt(0);
		  }
		  for (;;count++) //???????
		  {
			  if (z.charAt(count) == '\0')
			  {
				  break;
			  }
				i = shu * 10 + (z.charAt(count) - '0'); //i=the two number
				shu = i % 13;
				j = i / 13;
				y = tangible.StringFunctions.changeCharacter(y, count, j + '0');
		  }
		  count = 0;
		  j = 0;
		  for (;y.charAt(count) != '\0';count++)
		  {
				if (j == 0)
				{
						if (y.charAt(count) == '0')
						{
						   continue;
						}
						else
						{
									j = 1;
									System.out.printf("%c",y.charAt(count));
									continue;
						}
				}
				System.out.printf("%c",y.charAt(count));
		  }
		 if (j == 0)
		 {
		 System.out.printf("%c",y.charAt(0));
		 }
		  System.out.printf("\n%d",shu);

	}
}

