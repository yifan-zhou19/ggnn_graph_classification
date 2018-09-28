package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int k = 0;
		int a;
		int j;
		String s = new String(new char[100]);
		String b = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		n = s.length();
		if (n == 1)
		{
			System.out.print("0\n");
			k = s.charAt(0) - '0';
			System.out.printf("%d",k);
		}
		else
		{
			if (n == 2 && s.charAt(0) == '1' && (s.charAt(1) - '0') < 3)
			{
				System.out.print("0\n");
			k = 10 + s.charAt(1) - '0';
			System.out.printf("%d",k);
			}

			else
			{
				for (i = 0;i < n;i++)
				{
					k = s.charAt(i) - '0' + k * 10;
			a = k / 13;
			b = tangible.StringFunctions.changeCharacter(b, i, a + '0');
			k = k % 13;
				}
		b = tangible.StringFunctions.changeCharacter(b, i, '\0');

			for (j = 0;j < i;j++)
			{
				if (b.charAt(j) != '0')
				{
				System.out.printf("%c",b.charAt(j));
				break;
				}
			}
			for (j++;j < i;j++)
			{
			System.out.printf("%c",b.charAt(j));
			}
			System.out.print("\n");
			System.out.printf("%d\n",k);
			}
		}



		return 0;
	}
}

