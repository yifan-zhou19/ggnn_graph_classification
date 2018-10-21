package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[2000]);
		String a = new String(new char[2000]);
		int i;
		int k;
		int n;
		int b;
		s = new Scanner(System.in).nextLine();
		n = s.length();
		k = 0;
		i = 0;
		while (i < n)
		{
			if (Character.isLetterOrDigit(s.charAt(i)))
			{
				b = 0;
				a = tangible.StringFunctions.changeCharacter(a, k, s.charAt(i));
				k++;
			}
			else if (b < 1)
			{
				a = tangible.StringFunctions.changeCharacter(a, k, s.charAt(i));
				k++;
				b++;
			}
			i++;
		}
		System.out.printf("%s",a);
	}










}

