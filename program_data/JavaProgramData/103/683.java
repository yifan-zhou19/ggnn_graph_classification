package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct comp
	//	{
	//		char A;
	//		int n;
	//	};
		int i;
		int j;
		int k = 0;
		String P = new String(new char[1000]);
		comp[][] C =
		{
			{'A', 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
		};
		P = new Scanner(System.in).nextLine();
		for (i = 0;i < P.length();i++)
		{
			if (i > 0)
			{
				if (P.charAt(i) == P.charAt(i - 1) || P.charAt(i) == P.charAt(i - 1) + 'A'-'a' || P.charAt(i) == P.charAt(i - 1) + 'a'-'A')
				{
				;
				}
				else
				{
					k++;
				}
			}
			for (j = 0;j < 26;j++)
			{
				if (j + 'A' == P.charAt(i) || j + 'a' == P.charAt(i))
				{
					C[k][j].n++;
					C[k][j].A = j + 'A';
					break;
				}
			}
		}
		for (k = 0;k < 100;k++)
		{
		for (j = 0;j < 26;j++)
		{
			if (C[k][j].n != 0)
			{
				System.out.printf("(%c,%d)",C[k][j].A,C[k][j].n);
			}
		}
		}
		return 0;
	}
}
