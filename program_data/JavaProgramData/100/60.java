package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		a = new Scanner(System.in).nextLine();
		int[] num = new int[26];
		int i;
		int j;
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if ((a.charAt(i) - 'a') >= 0 && (a.charAt(i) - 'a') <= 25)
			{
				num[a.charAt(i) - 'a'] += 1;
			}
		}
		for (i = 0,j = 0;i <= 25;i++)
		{
			if (num[i] != 0)
			{
				System.out.print((char)(i + 'a'));
				System.out.printf("=%d\n",num[i]);
				j++;
			}
		}
		if (j == 0)
		{
			System.out.print("No");
		}
		return (0);
	}
}
