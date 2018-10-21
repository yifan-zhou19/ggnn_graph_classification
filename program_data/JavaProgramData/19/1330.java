package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		str = new Scanner(System.in).nextLine();
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		int n = str.length();
		int i;
		int k = 0;
		int j = 0;
		char[][] c = new char[101][101];
		for (i = 0;i < n;i++)
		{
			if (str.charAt(i) == ' ')
			{
				str = tangible.StringFunctions.changeCharacter(str, i, '\0');
			 c[k] = (str.Substring(j));
			 k++;
			 j = i + 1;
			}
		}
		c[k] = (str.Substring(j));
		k++;
		for (i = 0;i < k;i++)
		{
			if (i > 0)
			{
				System.out.print(" ");
			}
			if (strcmp(c[i],a) == 0)
			{
				System.out.printf("%s",b);
			}
			else
			{
				System.out.printf("%s",c[i]);
			}
		}
		return 0;
	}
}

