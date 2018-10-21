package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[2000]);
		int[] b = new int[300];
		int i;
		int j;
		a = new Scanner(System.in).nextLine();
		for (i = 0,j = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) != ' ')
			{
				b[j] = b[j] + 1;
			}
			else if (a.charAt(i) == ' ' && a.charAt(i - 1) != ' ')
			{
				j++;
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d",b[j]);

	}
}
