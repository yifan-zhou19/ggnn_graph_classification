package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   String s = new String(new char[102]);
	   String a = new String(new char[50]);
	   String b = new String(new char[50]);
	   int i = 0;
	   s = new Scanner(System.in).nextLine();
	   while (s.charAt(i) != ' ')
	   {
		   a = tangible.StringFunctions.changeCharacter(a, i, s.charAt(i));
		   i++;
	   }
	   a = tangible.StringFunctions.changeCharacter(a, i, '\0');
		i++;
		int j = i;
		while (s.charAt(i) != '\0')
		{
			b = tangible.StringFunctions.changeCharacter(b, i - j, s.charAt(i));
			i++;
		}
		b = tangible.StringFunctions.changeCharacter(b, i - j, '\0');

		i = 0;
		j = 0;
		int ip;
		int jp;

		while (b.charAt(j) != '\0')
		{
			ip = i;
			jp = j;
			do
			{
				if (a.charAt(ip) == '\0')
				{
					System.out.printf("%d",j);

					return;
				}
			}while (a.charAt(ip++) == b.charAt(jp++));

			j++;
		}
		System.out.printf("%d",0);
	   return;
	}
}

