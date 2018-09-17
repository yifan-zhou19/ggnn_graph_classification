package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		String b = new String(new char[123]);
		a = new Scanner(System.in).nextLine();
		int[] num = new int[123];
		int i;
		int j;
		int total = 0;
		for (i = 97;i < 123;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, i);
			num[i] = 0;
			for (j = 0;a.charAt(j) != '\0';j++)
			{
				if (a.charAt(j) == i)
				{
					num[i]++;
					total++;
				}

			}
		}


		if (total == 0)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 97;i < 123;i++)
			{
				if (num[i] != 0)
				{
					System.out.printf("%c=%d\n",b.charAt(i),num[i]);
				}
			}
		}
		return 0;

	}
}

