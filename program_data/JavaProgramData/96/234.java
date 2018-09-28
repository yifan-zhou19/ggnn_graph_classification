package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int length;
		int n;
		a = new Scanner(System.in).nextLine();
		length = a.length();
		if ((length == 1) || ((length == 2) && (a.charAt(0) == '1') && (a.charAt(1) < '3')))
		{
			System.out.print("0\n");
			System.out.println(a);
		}
		else
		{


																   //the main part of calculation


			if (((a.charAt(0) == '1') && (a.charAt(1) < '3')) != 0)
			{
				for (i = 0;i < length - 1;i++)
				{
				b = tangible.StringFunctions.changeCharacter(b, i, (10 * (a.charAt(i) - '0') + a.charAt(i + 1) - '0') / 13 + '0');
				a = tangible.StringFunctions.changeCharacter(a, i + 1, (10 * (a.charAt(i) - '0') + a.charAt(i + 1) - '0') - 13 * (b.charAt(i) - '0') + '0');
				}
				for (i = 1;i < length - 1;i++)
				{
					System.out.printf("%c",b.charAt(i));

				}
				System.out.printf("\n%d",a.charAt(length - 1) - '0'); //don't print zero( b[0]=0)

			}
			else
			{
			   for (i = 0;i < length - 1;i++)
			   {
				b = tangible.StringFunctions.changeCharacter(b, i, (10 * (a.charAt(i) - '0') + a.charAt(i + 1) - '0') / 13 + '0');
				a = tangible.StringFunctions.changeCharacter(a, i + 1, (10 * (a.charAt(i) - '0') + a.charAt(i + 1) - '0') - 13 * (b.charAt(i) - '0') + '0');
			   }
				for (i = 0;i < length - 1;i++)
				{
					System.out.printf("%c",b.charAt(i));
				}
				System.out.printf("\n%d",a.charAt(length - 1) - '0'); //normally print

			}


		}
	}

}

