package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int n;
		int n1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (n1 = 0;n1 < n;n1++)
		{
			final String a = "\0";
			final String b = "\0"; //????'\0'
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			int i;
			int lena = a.length(); //****?????????????strlen(a)???????????????????
			int lenb = b.length();
			//?????strlen(a)?????�???�......*******???????????????????~~~~~�
			for (i = 99;i >= 99 - lena + 1;i--)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(lena + i - 100));
			}
			for (i = 99 - lena;i >= 0;i--)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, '0');
			}
			for (i = 99;i >= 99 - lenb + 1;i--)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(lenb + i - 100));
			}
			for (i = 99 - lenb;i >= 0;i--)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, '0');
			}

			int[] c = new int[100];
			for (i = 0;i < 100;i++)
			{
				c[i] += a.charAt(99 - i) - b.charAt(99 - i);
				if (c[i] < 0)
				{
					c[i] = c[i] + 10;
					c[i + 1]--;
				}
			}
			int test = 0;
			for (i = 99;i >= 0;i--)
			{
				if (c[i] == 0 && test == 0)
				{
					continue;
				}
				if (c[i] != 0 && test == 0)
				{
					System.out.printf("%d",c[i]);
					test++;
					continue;
				}
				if (test != 0)
				{
					System.out.printf("%d",c[i]);
					continue;
				}
			}
			System.out.print("\n");



		}

		return 0;
	}
}

