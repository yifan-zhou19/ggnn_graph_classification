package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int j;
	   int k = 0;
	   int l;
	   String a = new String(new char[100]);
	   String b = new String(new char[100]);
	   a = new Scanner(System.in).nextLine();
	   l = a.length();
	   for (i = 0;i < l;i++)
	   {
		if (a.charAt(i) != ' ')
		{
		   b = tangible.StringFunctions.changeCharacter(b, k, a.charAt(i));
	   k++;
		}
		else
		{
			j = i;
			b = tangible.StringFunctions.changeCharacter(b, k, ' ');
			k++;
			while (a.charAt(j) == ' ')
			{
		 j++;
			}
		 i = j - 1;
		}
		 b = tangible.StringFunctions.changeCharacter(b, k + 1, '\0');
	   }
	   System.out.println(b);
	   System.in.read();
	   System.in.read();
	   System.in.read();
	}

}

