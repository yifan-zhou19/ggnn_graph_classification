package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String str = new String(new char[257]);
		  String sub = new String(new char[257]);
		  String rep = new String(new char[257]);
		  int k;
		  int count = 0;
		  int i;
		  int j = 0;
		  str = new Scanner(System.in).nextLine();
		  sub = new Scanner(System.in).nextLine();
		  rep = new Scanner(System.in).nextLine();
		  k = sub.length();
		  for (i = 0;;)
		  {

				 if (count == k || str.charAt(j) == '\0')
				 {
					 break;
				 }
				 else
				 {
					 for (;str.charAt(j) != 0 && count != k;j++)
					 {
						  if (str.charAt(j) == sub.charAt(i))
						  {
							   count++;
							   i++;
						  }
						  else
						  {
							  count = 0;
							  i = 0;
						  }
					 }
				 }
		  }
		  if (count == k)
		  {

			  for (int t = 0;j - k + t < j;t++)
			  {
					  str = tangible.StringFunctions.changeCharacter(str, j - k + t, rep.charAt(t));
			  }
		  }
		  System.out.printf("%s",str);
	}
}

