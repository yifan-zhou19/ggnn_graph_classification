package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			String a1 = new String(new char[257 * 2]);
			String a2 = new String(new char[257]);
			String b1 = new String(new char[257]);
			int i;
			int j;
			int k;
			int start = 0;
			int end = 0;
			a1 = new Scanner(System.in).nextLine();
			a2 = new Scanner(System.in).nextLine();
			b1 = new Scanner(System.in).nextLine();
			for (i = 0;a1.charAt(i) != 0;i++)
			{
				if (a1.charAt(i) == a2.charAt(0))
				{
					for (j = i + 1,k = 1;a2.charAt(k) != 0;j++,k++)
					{
						if (a1.charAt(j) != a2.charAt(k))
						{
							break;
						}
					}
					if (a2.charAt(k) == 0)
					{
						start = i;
						end = j;
						break;
					}
				}
			}
			if (start < end)
			{
					for (i = start,k = 0;b1.charAt(k) != 0;i++,k++)
					{
						a1 = tangible.StringFunctions.changeCharacter(a1, i, b1.charAt(k));
					}
					for (j = end;a1.charAt(j) != 0;i++,j++)
					{
						a1 = tangible.StringFunctions.changeCharacter(a1, i, a1.charAt(j));
					}
					a1 = a1.substring(0, i);
			}
			System.out.print(a1);
			return 0;
	}


}

