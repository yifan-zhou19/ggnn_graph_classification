package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String origin = new String(new char[256]);
	  String sub = new String(new char[256]);
	  String replace = new String(new char[256]);
	  String after = new String(new char[256]);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  origin = tempVar.charAt(0);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  sub = tempVar2.charAt(0);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  replace = tempVar3.charAt(0);
	  }

	  int i;
	  int j;
	  int k = 0;

	  for (i = 0; origin.charAt(i); i++)
	  {
		int shouldChange = 1;
		for (j = 0; sub.charAt(j); j++)
		{
		  if (origin.charAt(i + j) != sub.charAt(j))
		  {
			shouldChange = 0;
		  }
		}
		if (shouldChange == 1)
		{
		  after = origin;
		  after = after.substring(0, i);
		  after += replace;
		  after += origin.charAt(i + sub.length());
		  origin = after;
		  i += replace.length();
		  break;
		}
	  }
	  System.out.printf("%s", origin);
	  return 0;
	}
}

