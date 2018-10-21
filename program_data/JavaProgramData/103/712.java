package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		String a = new String(new char[1000]);
		str = new Scanner(System.in).nextLine();
		int i;
		int n = 1;
		int j = 0;
		int[] b = new int[1000];
		for (i = 0;str.charAt(i) != '\0';i++)
		{
		if (str.charAt(i) > 'Z')
		{
		str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 32);
		}
		}
		for (i = 0;str.charAt(i) != '\0';i++)
		{
		if (str.charAt(i + 1) == str.charAt(i))
		{
		n++;
		}
		else
		{
		a = tangible.StringFunctions.changeCharacter(a, j, str.charAt(i));
		b[j] = n;
		j++;
		n = 1;
		}
		}
		for (i = 0;i < j;i++)
		{
		System.out.printf("(%c,%d)",a.charAt(i),b[i]);
		}
	return 0;
	}

}

