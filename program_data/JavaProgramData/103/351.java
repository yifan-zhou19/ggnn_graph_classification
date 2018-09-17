package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[10000]);
	a = ConsoleInput.readToWhiteSpace(true).charAt(0);
	int size = a.length();
	int i;
	int k;
	for (i = 0;i < size;i++)
	{
	if (a.charAt(i) > 'Z')
	{
	a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - ('a'-'A'));
	}
	}
	for (i = 0;i < size;)
	{
	   int j = 0;
	   for (k = 0;k < size - i;k++)
	   {
	   if (a.charAt(i + k + 1) == a.charAt(i + k))
	   {
		   j++;
	   }

	   else if (a.charAt(i + k + 1) == '\0')
	   {
	   j++;
	   System.out.print('(');
	   System.out.print(a.charAt(i + k));
	   System.out.print(',');
	   System.out.print(j);
	   System.out.print(')');
	   i = size;
	   }
	   else
	   {
			System.out.print('(');
			System.out.print(a.charAt(i + k));
			System.out.print(',');
			System.out.print(j + 1);
			System.out.print(')');
			i = i + j + 1;
			break;
	   }
	   }
	}
	return 0;
	}

}

