package <missing>;

public class GlobalMembers
{
	public static int Main()

	{

		   String str = new String(new char[13]);

		   String sub = new String(new char[4]);

		   int i;
		   int la;

		   int max;
		   int t;

		   while (scanf("%s %s",str,sub) != EOF)

		   {

				  max = 0;

				  la = str.length();

				  for (i = 0;i < la;i++)

				  {

						 if (max < str.charAt(i))
						 {
							 t = i;
							 max = str.charAt(i);
						 } // ????????

				  }

				  for (i = la - 1;i > t;i--)

				  {

						 str = tangible.StringFunctions.changeCharacter(str, i + 3, str.charAt(i)); //?????? ????????????

				  }

				  str = tangible.StringFunctions.changeCharacter(str, t + 1, sub.charAt(0));

				  str = tangible.StringFunctions.changeCharacter(str, t + 2, sub.charAt(1));

				  str = tangible.StringFunctions.changeCharacter(str, t + 3, sub.charAt(2));

				  for (i = 0;i < la + 3;i++)
				  {

				  System.out.printf("%c",str.charAt(i));
				  }

				  System.out.print("\n");

		   }

		   return 0;

	}

}

