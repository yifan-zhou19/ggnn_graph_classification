package <missing>;

public class GlobalMembers
{
	//????????13

	public static final int chushu = 13;
	public static int Main()
	{
		 String n = new String(new char[101]);
		 String answer = new String(new char[100]);
		 int a = 1;
		 int b = 1;
		 int c = 1;
		 int i = 0;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = tempVar.charAt(0);
		 }

		 if (n.length() < 2)
		 {
			System.out.printf("0\n%c",n.charAt(0));
		 }
		 else if (n.length() < 3)
		 {
			 c = 10 * (n.charAt(0) - '0') + (n.charAt(1) - '0');
			 System.out.printf("%d\n%d",c / chushu,c % chushu);
		 }
		 else
		 {
		 a = (n.charAt(0) - '0');
		 a = a * 10 + (n.charAt(1) - '0');
			 if (a < chushu)
			 {
							a = a % chushu;
						 for (i = 1;n.charAt(i + 1) != '\0';i++)
						 {
									a = a * 10 + (n.charAt(i + 1) - '0');
									answer = tangible.StringFunctions.changeCharacter(answer, i - 1, (a / chushu + '0'));
										a = a % chushu;
						 }
						  answer = tangible.StringFunctions.changeCharacter(answer, i - 1, '\0');
			 }
			 else
			 {

				 answer = tangible.StringFunctions.changeCharacter(answer, 0, (a / chushu) + '0');
				 a = a % chushu;
				  for (i = 1;n.charAt(i + 1) != '\0';i++)
				  {
						a = a * 10 + (n.charAt(i + 1) - '0');
						answer = tangible.StringFunctions.changeCharacter(answer, i, (a / chushu) + '0');
							a = a % chushu;
				  }
				  answer = tangible.StringFunctions.changeCharacter(answer, i, '\0');
			 }




		 System.out.printf("%s\n%d",answer,a);

		 }
		 return 0;


	}
}

