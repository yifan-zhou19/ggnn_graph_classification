package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int i;
	  int j;
	  int n = 0;
	  final String a = "";
	  a = new Scanner(System.in).nextLine();
	  for (i = 0;i < 1000;i++)
	  {
			if (a.charAt(i) == '\0')
			{
			break;
			}
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a'+'A');
			}
	  }
	  for (i = 0;i < 1000;i++)
	  {
		   if (a.charAt(i) == '\0')
		   {
		   break;
		   }
		   if (a.charAt(i) != a.charAt(i + 1))
		   {
				 n = 0;
				 for (j = i;a.charAt(j) == a.charAt(i);j--)
				 {
				 n++;
				 }
				 System.out.printf("(%c,%d)",a.charAt(i),n);
		   }
	  }
	}

}

