package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[1000]);
		int[] num = new int[300];
		int i;
		int j;
		a = new Scanner(System.in).nextLine();
		for (i = 0,j = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) != ' ')
			{
				num[j]++;
			}
			if (a.charAt(i) == ' ')
			{
				j++;
			}
		}
		for (i = 0;i <= j;i++)
		{
			if (num[i] != 0)
			{
			System.out.printf("%d",num[i]);
			if (i <= j - 1)
			{
				System.out.print(",");
			}
			}
		}
	}
}
