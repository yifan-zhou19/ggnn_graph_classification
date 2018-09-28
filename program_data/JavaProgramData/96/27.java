package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int[] c = new int[100];
		a = new Scanner(System.in).nextLine();
	if (Integer.parseInt(a) < 13)
	{
		System.out.printf("0\n%d",Integer.parseInt(a));
	}
	else
	{
		int len;
		len = a.length();
		int j;
		int i;
		int wei;
		wei = a.charAt(0) - '0';
		for (i = 1;i < len;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i - 1, (10 * wei + a.charAt(i) - '0') / 13 + '0');
			wei = (10 * wei + a.charAt(i) - '0') % 13;
		}

		if (b.charAt(0) == '0')
		{
			i = 1;
		}
		else
		{
			i = 0;
		}

		for (j = i;j < len - 1;j++)
		{
			c[j] = b.charAt(j) - '0';
			System.out.printf("%d",c[j]);
		}

		System.out.print("\n");
		System.out.printf("%d",wei);
	}
	}



}

