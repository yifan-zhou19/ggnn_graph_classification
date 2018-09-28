package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String text = new String(new char[200]);
	char a;
	char b;
	int i;
	int j;
	text = new Scanner(System.in).nextLine();
	System.out.print("\n");
	a = text.charAt(0);
	for (i = 0;i < text.length();i++)
	{
		if (text.charAt(i) != a)
		{
		b = text.charAt(i);
		break;
		}
	}
	for (i = 0;i < text.length();i++)
	{
		if (text.charAt(i) == b)
		{
		  for (j = i;j >= 0;j--)
		  {
			  if (text.charAt(j) == a)
			  {
			text = tangible.StringFunctions.changeCharacter(text, j, 'c');
			System.out.printf("%d %d\n",j,i);
			break;
			  }
		  }
		}
	}
	}


}

