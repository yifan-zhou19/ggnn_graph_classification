package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  char c;
	  final String a = "";
	  int i;
	  int k;
	  a = new Scanner(System.in).nextLine();
	  for (i = 199;i >= 0;i--)
	  {
			 if (a.charAt(i) != '\0')
			 {
				 k = i;
			  break;
			 }
	  }
	  c = a.charAt(0);
	  for (i = 0;i < k;i++)
	  {
		 a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + a.charAt(i + 1) - '\0');
	  }
	  a = tangible.StringFunctions.changeCharacter(a, k, a.charAt(k) + c - '\0');
	  for (i = 0;i <= k;i++)
	  {
		System.out.printf("%c",a.charAt(i));
	  }
	}

}

