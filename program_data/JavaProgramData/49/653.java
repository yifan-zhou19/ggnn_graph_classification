package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int[] x = new int[510];
		int[] y = new int[510];
		int e;
		int f;
		int count = 0;
		String a = new String(new char[510]);
		char b;
		while (b != '\n')
		{
			cin.get(b);
			a = tangible.StringFunctions.changeCharacter(a, i++, b);
		} //a????0?i-2?
		int j1;
		int j2;
		int j3;
		for (j1 = 2;j1 <= i - 1;j1++) //??
		{
			for (j2 = 0;j2 <= i - 3;j2++)
			{
				for (j3 = 0;j3 <= j1 - 1;j3++) //?????????????
				{
					if (j2 + j3 <= i - 2)
					{
					e = a.charAt(j2 + j3);
					}
					f = a.charAt(j2 + j1 - 1 - j3);
					if (e == f)
					{
						count++;
					}
					if (count == j1)
					{
						for (int j4 = j2;j4 <= j2 + j1 - 1;j4++)
						{
							System.out.print(a.charAt(j4));
						}
						System.out.print('\n');
					}
				}
				count = 0;
			}
		}
		return 0;
	}
}

