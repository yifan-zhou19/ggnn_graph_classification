package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[3000]);
		int i;
		int j = 0;
		int f;
		int[] b = new int[500];
		a = new Scanner(System.in).nextLine();
		for (i = 0,f = 0;a.charAt(i) != '\0';i++)
		{
			if (f == 0 && a.charAt(i) != ' ')
			{
				f = 1;

			}
			if (f == 1)
			{
				b[j]++;
			}
			if (f == 1 && a.charAt(i) == ' ')
			{
				b[j]--;
				f = 0;
				j++;
			}
		}
		if (a.charAt(i - 1) == ' ')
		{
			j--;
		}
		for (i = 0;i <= j;i++)
		{
			System.out.printf("%d",b[i]);
			if (i < j)
			{
			System.out.print(",");
			}
		}
	}
}
