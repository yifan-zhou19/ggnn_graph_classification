package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String n = new String(new char[102]);
		String r = new String(new char[102]);
		int[] b = new int[102];
		int m;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = tempVar.charAt(0);
		}
		if (n.charAt(1) == '\0')
		{
			System.out.printf("0\n%s",n);
		}


		else
		{
		if (((n.charAt(0) - '0') * 10 + n.charAt(1) - '0' < 13) && n.charAt(2) == '\0')
		{
			System.out.printf("0\n%s",n);
		}

		else
		{

		b[0] = 10 * (n.charAt(0) - '0') + n.charAt(1) - '0';

		for (i = 0;i <= n.length() - 2;i++)
		{
			r = tangible.StringFunctions.changeCharacter(r, i, (b[i] / 13) + '0');
			m = b[i] % 13;
			b[i + 1] = n.charAt(i + 2) + m * 10 - '0';
		}

		r = tangible.StringFunctions.changeCharacter(r, n.length() - 1, '\0');

		 if (r.charAt(0) == '0')
		 {
				for (i = 1;i <= n.length() - 2;i++)
				{
				System.out.printf("%c",r.charAt(i));
				}
			 System.out.printf("\n%d",m);
		 }
		else
		{
		System.out.printf("%s\n",r);
		System.out.printf("%d",m);
		}
		}
		}

	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	}
}

