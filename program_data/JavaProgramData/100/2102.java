package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		String b = new String(new char[100]);
		int flag = 0;
		int i;
		int k;
		int len;
		int[] c = new int[52];
		a = new Scanner(System.in).nextLine();
		len = a.length();
		b = tangible.StringFunctions.changeCharacter(b, 0, 'A');
		b = tangible.StringFunctions.changeCharacter(b, 26, 'a');
		for (i = 1;i < 26;i++)
		{
		b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i - 1) + 1);
		}
		for (i = 27;i < 52;i++)
		{
		b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i - 1) + 1);
		}
		for (i = 0;i < 52;i++)
		{
			for (k = 0;k < len;k++)
			{
				if (b.charAt(i) == a.charAt(k))
				{
			c[i]++;
			flag = 1;
				}
			}
		}
		if (flag == 0)
		{
			System.out.print("No\n");
		}
		else
		{
		for (i = 0;i < 52;i++)
		{
		if (c[i] != 0)
		{
			System.out.printf("%c=%d\n",b.charAt(i),c[i]);
		}
		}
		}
	return 0;
	}

}

