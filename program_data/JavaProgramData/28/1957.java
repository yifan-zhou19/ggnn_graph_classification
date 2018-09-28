package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		int m = 0;
		int[] sum = new int[301];
		String word = new String(new char[3000]);

		word = new Scanner(System.in).nextLine();

		for (i = 0; word.charAt(i) != '\0'; i++)
		{
			if (word.charAt(i) != ' ')
			{
				sum[j]++;
			}
			else
			{
				j++;
				while (word.charAt(i) == ' ')
				{
					i++;
				}
				i = i - 1;
			}
		}
			System.out.printf("%d", sum[0]);
			for (i = 1; i <= j; i++)
			{
				System.out.printf(",%d", sum[i]);
			}
		return 0;
	}
}
