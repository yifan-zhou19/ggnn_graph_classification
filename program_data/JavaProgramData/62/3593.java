package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		String n = new String(new char[100]);
		int a;
		int b;
		int c = 0;
		int d;
		int i;
		int j;
		int k;
		int l;
		n = new Scanner(System.in).nextLine();
		b = n.length();
		for (i = 0;i < b;i++)
		{
			if (n.charAt(i) == 32)
			{
				for (j = i + 1;n.charAt(j) == 32;j++)
				{
				if (n.charAt(j) == 32)
				{
						for (k = j;k < b - 1;k++)
						{
							n = tangible.StringFunctions.changeCharacter(n, k, n.charAt(k + 1));
						}
						b--;
						i = 0;
				}
				}
			}
		}

			for (l = 0;l < b;l++)
			{
			System.out.printf("%c",n.charAt(l));
			}

		return 0;
	}






}

