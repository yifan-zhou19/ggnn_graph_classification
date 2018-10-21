package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int n;
		  int count;
		  String a = new String(new char[1000]);
		  a = new Scanner(System.in).nextLine();
		  n = a.length();
		  for (i = 0;i < n;i++)
		  {
						  if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
						  {
						  a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a'+'A');
						  }
		  }



				   count = 0;
				for (j = 0;j < n;j++)
				{
										  if (a.charAt(j) == a.charAt(0))
										  {
										  count++;
										  }
										  else if (a.charAt(j) != a.charAt(0))
										  {
										  break;
										  }
				}
						  System.out.printf("(%c,%d)",a.charAt(0),count);

		  for (i = 1;i < n;i++)
		  {
						  count = 0;
						  if (a.charAt(i) != a.charAt(i - 1))


						  {
						  for (j = i;j < n;j++)
						  {
										  if (a.charAt(i) != a.charAt(j))
										  {
										  break;
										  }
										  if (a.charAt(i) == a.charAt(j))
										  {
										  count++;
										  }

						  }
						  System.out.printf("(%c,%d)",a.charAt(i),count);
						  }
		  }
		  System.in.read();
		  System.in.read();
		  System.in.read();
		   System.in.read();
		  System.in.read();
		  System.in.read();
	}

}

