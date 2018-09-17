package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String str = new String(new char[1000]);
		  str = new Scanner(System.in).nextLine();
		  int i;
		  int k;
		  for (i = 0;str.charAt(i) != '\0';i = i + 1)
		  {
		  if (str.charAt(i) >= 'a')
		  {
		  str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 32);
		  }
		  }

		  i = 0;
		  k = 1;
		  for (;str.charAt(i) != '\0';)
		  {
		  if (str.charAt(i) == str.charAt(i + 1))
		  {
		  k = k + 1;
		  i = i + 1;
		  }
		  else
		  {
		  System.out.printf("(%c,%d)",str.charAt(i),k);
		  i = i + 1;
		  k = 1;
		  }


		  }

	}

}

