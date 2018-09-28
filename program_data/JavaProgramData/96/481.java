package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int temp;
		  int yushu = 0;
		  String a = new String(new char[105]);
		  String b = new String(new char[105]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }
		  for (i = 0;a.charAt(i) != '\0';i++)
		  {
								 temp = a.charAt(i) - '0' + yushu * 10;
								 b = tangible.StringFunctions.changeCharacter(b, i, temp / 13);
								 yushu = temp % 13;
		  }
		  if (b.charAt(0) == 0)
		  {
					 if (b.charAt(1) == 0)
					 {
								if (i == 1 || i == 2)
								{
									System.out.print("0");
								}
								for (j = 2;j < i;j++)
								{
									System.out.printf("%c",b.charAt(j) + '0');
								}
					 }
					 else
					 {
						 for (j = 1;j < i;j++)
						 {
							 System.out.printf("%c",b.charAt(j) + '0');
						 }
					 }
		  }
		  else
		  {
			  for (j = 0;j < i;j++)
			  {
				  System.out.printf("%c",b.charAt(j) + '0');
			  }
		  }
		  System.out.printf("\n%d",yushu);

	}

}

