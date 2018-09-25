package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  char a;
		  String str = new String(new char[1000]);
		  int i;
		  int k;
		  str = new Scanner(System.in).nextLine();
		  a = str.charAt(0);
		  k = 1;

		  if (('a' <= a) && (a <= 'z'))
		  {
		  a = a + 'A' - 'a';
		  }

		  for (i = 1;str.charAt(i) != '\0';i++)
		  {

			  if ((str.charAt(i) == a) || (str.charAt(i) == a - 'A' + 'a'))
			  {
			  k++;
			  }
			  else
			  {
				  System.out.printf("(%c,%d)",a,k);
				  a = str.charAt(i);
				  if (('a' <= a) && (a <= 'z'))
				  {
				  a = a + 'A' - 'a';
				  }
				  k = 1;
			  }
		  }
		  System.out.printf("(%c,%d)",a,k);

	}

}
