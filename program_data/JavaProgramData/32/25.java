package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int La;
		int Lb;
		int k = 0;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		final String c = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			a = new Scanner(System.in).nextLine();
			b = new Scanner(System.in).nextLine();
			La = a.length();
			Lb = b.length();
			for (j = Lb - 1;j >= 0;j--)
			{
				a = tangible.StringFunctions.changeCharacter(a, j + La - Lb, a.charAt(j + La - Lb) - b.charAt(j) + 48);
				if (a.charAt(j + La - Lb) < 48)
				{
					a.charAt(j + La - Lb) += 10;
					a.charAt(j + La - Lb - 1) -= 1;
				}
			}
			System.in.read();
			c = tangible.StringFunctions.changeCharacter(c, k++, a);
		}
		for (j = 0;j <= n - 1;j++)
		{
			System.out.println(c.charAt(j));
		}
	}
}

