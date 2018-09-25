package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  final String bei = "";
		  final String shang = "";
		  int i;
		  int wei;
		  int a;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  bei = tempVar.charAt(0);
		  }
		  for (i = 0;;i++)
		  {
			  if (bei.charAt(i + 1) == '\0')
			  {
			  wei = i;
		  break;
			  }
		  }

		  if (wei < 1)
		  {
			  System.out.printf("0\n%c\n",bei.charAt(0));
		  }

		  if (wei >= 1)
		  {
			  a = 10 * (bei.charAt(0) - '0') + bei.charAt(1) - '0';
		  shang = tangible.StringFunctions.changeCharacter(shang, 0, a / 13 + '0');
		  for (i = 1;i < wei;i++)
		  {
			  a = (a % 13) * 10 + bei.charAt(i + 1) - '0';
		   shang = tangible.StringFunctions.changeCharacter(shang, i, a / 13 + '0');
		  }
		   a = a % 13;



		   if ((shang.charAt(0) == '0') && (wei > 1))
		   {
					  for (i = 0;i <= wei - 2;i++)
					  {
					  shang = tangible.StringFunctions.changeCharacter(shang, i, shang.charAt(i + 1));
					  }
					  shang = tangible.StringFunctions.changeCharacter(shang, wei - 1, '\0');
		   }


		   System.out.printf("%s\n",shang);
		   System.out.printf("%d\n",a);
		  }

	}
}

