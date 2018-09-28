package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int[] b = new int[100];
		int c = 0;
		int i;
		int n;
		for (i = 0;i < 100;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, '\0');
			b[i] = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		n = a.length();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if ((c * 10 + a.charAt(i) - '0') >= 13)
			{
				b[i] = ((c * 10 + a.charAt(i) - '0') - ((c * 10 + a.charAt(i) - '0') % 13)) / 13;
				c = (c * 10 + a.charAt(i) - '0') % 13;
			}
			else
			{
				b[i] = 0;
				c = (c * 10 + a.charAt(i) - '0') % 13;
			}
		}
		if (b[1] == 0 && b[2] == 0)
		{
			System.out.print("0");
		}
		else if (b[1] == 0 && b[2] != 0)
		{
			for (i = 2;i < n;i++)
			{
				System.out.printf("%d",b[i]);
			}
		}
		else
		{
			for (i = 1;i < n;i++)
			{
				System.out.printf("%d",b[i]);
			}
		}
		System.out.print("\n");
		System.out.printf("%d\n",c);
	return 0;
	}
}

