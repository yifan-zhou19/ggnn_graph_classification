package <missing>;

public class GlobalMembers
{
	public static int Main()

	{

	  String string = new String(new char[256]);
	  String sub = new String(new char[256]);
	  String re = new String(new char[256]);

	  int i;
	  int j;

	  String = new Scanner(System.in).nextLine();

	  sub = new Scanner(System.in).nextLine();

	  re = new Scanner(System.in).nextLine();

	  int len1 = String.length();
	  int len2 = sub.length();
	  int len3 = re.length();

	  for (i = 0;i <= len1 - len2;i++)

	  {

		for (j = 0;j < len2;j++)

		{

		  if (sub.charAt(j) != string.charAt(i + j))
		  {
			  break;
		  }

		}

		if (j != len2)
		{
			continue;
		}

		if (j == len2)

		{

		  for (j = 0;j < len2;j++)
		  {
			  String[i + j] = re.charAt(j);
		  }

		  break;

		}

	  }

	  System.out.println(String);

	  return 0;

	}
}
