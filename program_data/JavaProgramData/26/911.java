package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int j;
	   int m;
	   int n;
		j = 0;
		m = 0;
	  String x = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	  char * a;
	  String y = new String(new char[100]);
	   x = new Scanner(System.in).nextLine();
	  for (a = x; * a != '\0';a++)
	  {
			if (*a != ' ')
			{
				;
			}
			{
				   y = tangible.StringFunctions.changeCharacter(y, j, *a);
				  j++;
		   }

			 if (*a == ' ')
			 {

				while (*a == ' ')
				{
					 a++;
				}
				 a--;
			 }

	  }
		  y = tangible.StringFunctions.changeCharacter(y, j, '\0');
		System.out.printf("%s",y);

		  return 0;

	}
}

