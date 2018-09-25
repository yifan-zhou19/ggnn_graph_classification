package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  final String a = "";
		  int num = 1;
		  int i;
		  int N;
		  a = new Scanner(System.in).nextLine();
		  N = a.length();
		  i = 0;
		  do
		  {
			 if (a.charAt(i) == a.charAt(i + 1) || a.charAt(i) - a.charAt(i + 1) == 32 || a.charAt(i) - a.charAt(i + 1) == -32)
			 {
				  num++;
				  i++;
			 }
			  else
			  {
				  if (a.charAt(i) > 'Z')
				  {
							   a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
				  }
				  System.out.printf("(%c,%d)",a.charAt(i),num);
				  num = 1;
				  i++;
			  }
		  } while (i < N);

	}

}

