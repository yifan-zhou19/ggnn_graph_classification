package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String str = new String(new char[999]);
	String temp = new String(new char[300]);
	int len;
	int k = 0;
	int j;
	int i = 0;
	int a;
	int b;
	int c;
	str = new Scanner(System.in).nextLine();
	len = str.length();
	for (j = 0;j <= len;j++)
	{
	   if (str.charAt(j) == ' ')
	   {
		 while (i < j)
		 {
		 temp = tangible.StringFunctions.changeCharacter(temp, k, str.charAt(i));
		 i++;
		 k++;
		 }
		 temp = tangible.StringFunctions.changeCharacter(temp, k, '\0');
		 i++;
		 a = temp.length();
		 if (a != 0)
		 {
		 System.out.printf("%d,",a);
		 }
		 k = 0;
	   }
	   if (str.charAt(j) == '\0')
	   {
		 while (i < j)
		 {
		 temp = tangible.StringFunctions.changeCharacter(temp, k, str.charAt(i));
		 i++;
		 k++;
		 }
		 temp = tangible.StringFunctions.changeCharacter(temp, k, '\0');
		 a = temp.length();
		 System.out.printf("%d",a);
	   }
	}
	return 0;
	}

}

