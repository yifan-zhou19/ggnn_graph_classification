package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[10][100000];
		String p = new String(new char[100000]);
		String q1;
		String q2;
		int t;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (p = a;p < a + t;p++)
		{
			*p = new Scanner(System.in).nextLine();
		}
		for (p = a;p < a + t;p++)
		{
			for (q1 = *p; q1 != 0;q1++)
			{
				k = 0;
				for (q2 = *p; q2 != 0;q2++)
				{
					if (q1 == q2)
					{
						k = k + 1;
					}
				}
				if (k == 1)
				{
					System.out.printf("%c\n", q1);
					break;
				}
			}
			if (k != 1)
			{
				System.out.print("no\n");
			}
		}
	}
}

