package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  String ml = new String(new char[300]);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int i;
	  for (i = 0;i < n;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  ml = tempVar2.charAt(0);
		  }
		  int l = ml.length();
		  for (int k = 0;k < l;k++)
		  {
			  if (ml.charAt(k) == 'A')
			  {
				  ml = tangible.StringFunctions.changeCharacter(ml, k, 'T');
			  }
			  else if (ml.charAt(k) == 'T')
			  {
				  ml = tangible.StringFunctions.changeCharacter(ml, k, 'A');
			  }
			  else if (ml.charAt(k) == 'C')
			  {
				  ml = tangible.StringFunctions.changeCharacter(ml, k, 'G');
			  }
			  else if (ml.charAt(k) == 'G')
			  {
				  ml = tangible.StringFunctions.changeCharacter(ml, k, 'C');
			  }
		  System.out.printf("%c",ml.charAt(k));
		  }
		  System.out.print("\n");
	  }


		return 0;
	}




}

