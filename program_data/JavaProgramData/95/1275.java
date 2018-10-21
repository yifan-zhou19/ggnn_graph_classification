package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String s1 = new String(new char[80]);
		  String s2 = new String(new char[80]);
		  s1 = new Scanner(System.in).nextLine();
		  s2 = new Scanner(System.in).nextLine();
		  int i = 0;
		  int j = 0;
		  while (s1.charAt(i) != '\0')
		  {
			  if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z')
			  {
				  s1 = tangible.StringFunctions.changeCharacter(s1, i, s1.charAt(i) + 'A'-'a');
			  }
			  i++;
		  }
		  while (s2.charAt(j) != '\0')
		  {
			  if (s2.charAt(j) >= 'a' && s2.charAt(j) <= 'z')
			  {
				  s2 = tangible.StringFunctions.changeCharacter(s2, j, s2.charAt(j) + 'A'-'a');
			  }
			  j++;
		  }
		  if (i < j)
		  {
			  int temp = j;
			  j = i;
			  i = temp;
		  } //?j??????
		  int flag = 0;
		  for (int t = 0;t < i;t++)
		  {
			  if (s1.charAt(t) > s2.charAt(t))
			  {
				  System.out.print(">");
				  flag = 1;
				  break;
			  }
			  if (s1.charAt(t) < s2.charAt(t))
			  {
				  System.out.print("<");
				  flag = 1;
				  break;
			  }

		  }
		  if (flag == 0)
		  {
			  System.out.print("=");
		  }
	}

}

