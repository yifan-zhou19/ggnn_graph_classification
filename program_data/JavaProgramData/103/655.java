package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
	  String a = new String(new char[1000]);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = tempVar.charAt(0);
	  }
	  int i;
	  int k;
	  int[] j = new int[1000];
	  k = 1;
	  for (i = 1 ; i < 1000 ; i++)
	  {
		if (a.charAt(i) == '\0')
		{
			  if ('A' <= a.charAt(i - 1) && a.charAt(i - 1) <= 'Z')
			  {
				 System.out.printf("(%c,%d)",a.charAt(i - 1),j[k] + 1);
			  }
			  else
			  {
					a = tangible.StringFunctions.changeCharacter(a, i - 1, a.charAt(i - 1) - 'a'+'A');
					System.out.printf("(%c,%d)",a.charAt(i - 1),j[k] + 1);
			  }
			  break;
		}
		else if (a.charAt(i) == a.charAt(i - 1) || a.charAt(i) == a.charAt(i - 1) + 'a'-'A' || a.charAt(i) == a.charAt(i - 1) - 'a'+'A')
		{
			  j[k]++;
		}
		else
		{
			  if ('A' <= a.charAt(i - 1) && a.charAt(i - 1) <= 'Z')
			  {
				 System.out.printf("(%c,%d)",a.charAt(i - 1),j[k] + 1);
			  }
			  else
			  {
					a = tangible.StringFunctions.changeCharacter(a, i - 1, a.charAt(i - 1) - 'a'+'A');
					System.out.printf("(%c,%d)",a.charAt(i - 1),j[k] + 1);
			  }
			  k++;
		}
	  }


	  return 0;
	}

}

