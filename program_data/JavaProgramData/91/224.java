package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		str1 = new Scanner(System.in).nextLine();
		n = str1.length();
		for (i = 0;i < n;i++)
		{
			a[i] = str1.charAt(i) - '0';
		}
		for (i = 0;i < n - 1;i++)
		{
			str2 = tangible.StringFunctions.changeCharacter(str2, i, 'a' + a[i] + a[i + 1] - 1);
		}
		str2 = tangible.StringFunctions.changeCharacter(str2, n - 1, 'a' + a[n - 1] + a[0] - 1);
		str2 = tangible.StringFunctions.changeCharacter(str2, n, '\0');
		System.out.println(str2);
		return 0;
	}



}

