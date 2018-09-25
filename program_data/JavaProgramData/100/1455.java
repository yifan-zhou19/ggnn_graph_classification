package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[300]);
		int i;
		int j;
		int count;
		int sum = 0;
		a = new Scanner(System.in).nextLine();
		for (i = 65; i <= 90; i++)
		{
			count = 0;
			for (j = 0; a.charAt(j) != '\0'; j++)
			{
				if ((int)a.charAt(j) == i)
				{
					count++;
				}
			}
			if (count == 0)
			{
				continue;
			}
			System.out.printf("%c=%d\n", i, count);
			sum = sum + count;
		}
		for (i = 97; i <= 122; i++)
		{
			count = 0;
			for (j = 0; a.charAt(j) != '\0'; j++)
			{
				if ((int)a.charAt(j) == i)
				{
					count++;
				}
			}
			if (count == 0)
			{
				continue;
			}
			System.out.printf("%c=%d\n", i, count);
			sum = sum + count;
		}
		if (sum == 0)
		{
			System.out.print("No");
		}
	}
}
