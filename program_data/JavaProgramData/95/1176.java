package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	char c;
	String text1 = new String(new char[81]);
	String text2 = new String(new char[81]);
	int i = 0;
	text1 = new Scanner(System.in).nextLine();
	System.out.print("\n");
	text2 = new Scanner(System.in).nextLine();
	System.out.print("\n");
	while (text1.charAt(i) != '\0')
	{
	   if ((text1.charAt(i) == text2.charAt(i)) || (Math.abs(text1.charAt(i) - text2.charAt(i)) == 32))
	   {
		   c = '=';
		   i++;
	   }
	   else if ((text1.charAt(i) - text2.charAt(i)) != 0)
	   {
			if (text1.charAt(i) < 'a')
			{
				text1.charAt(i) += 32;
			}
			if (text2.charAt(i) < 'a')
			{
				text2.charAt(i) += 32;
			}
	   if (text1.charAt(i) > text2.charAt(i))
	   {
		   c = '>';
	   }
	   if (text1.charAt(i) < text2.charAt(i))
	   {
		   c = '<';
	   }
	   break;
	   }
	}
	System.out.printf("%c",c);
	}
}
