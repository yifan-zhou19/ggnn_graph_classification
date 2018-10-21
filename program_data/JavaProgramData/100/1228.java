package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String dk = new String(new char[300]);
		char su;
		int i;
		int j;
		int sum = 0;
		int m = 0;
		dk = new Scanner(System.in).nextLine();
		for (i = 97;i <= 122;i++)
		{

			for (j = 0;dk.charAt(j) != '\0';j++)
			{
				if (dk.charAt(j) == i)
				{
					sum += 1;

				}
				if (sum != 0)
				{
					m += 1;
				}
			}
		su = i;
		if (sum >= 1)
		{
			System.out.printf("%c=%d\n",su,sum);
		}
		sum = 0;
		}
		if (m == 0)
		{
			System.out.print("No");
		}

		return 0;
	}

}
