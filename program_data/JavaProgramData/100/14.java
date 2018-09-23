package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[300]);
		int sum;
		int i;
		int j;
		int k = 1;
		a = new Scanner(System.in).nextLine();
		for (j = 'a';j <= 'z';j++)
		{
			sum = 0;
			for (i = 0;i < a.length();i++)
			{
				if (a.charAt(i) == j)
				{
					sum++;
				}
			}
			if (sum != 0)
			{
				System.out.printf("%c=%d\n",j,sum);
				k = 0;
			}
		}
		if (k != 0)
		{
			System.out.print("No");
		}
	}
}
