package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  final String word = "";
		  int i;
		  int n;
		  int sum;
		  int len;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }

		  for (i = 0;i < n;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  word = tangible.StringFunctions.changeCharacter(word, i, tempVar2);
			  }
		  }
		  System.out.printf("%s",word.charAt(0));
		  sum = String.valueOf(word.charAt(0)).length();
		  for (i = 1;i < n;i++)
		  {
			  len = String.valueOf(word.charAt(i)).length();
			  sum += len + 1;
			  if (sum <= 80)
			  {
				  System.out.printf(" %s",word.charAt(i));

			  }
			  else
			  {
				  System.out.print("\n");
				  System.out.printf("%s",word.charAt(i));
				  sum = String.valueOf(word.charAt(i)).length();
			  }
		  }

	}

}

