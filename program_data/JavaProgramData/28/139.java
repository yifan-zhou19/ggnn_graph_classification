package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[10000]);
		int[] b = new int[300];
		int i;
		int j = 0;
		for (i = 0;i < 300;i++)
		{
			b[i] = 0;
		}
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) != ' ' && a.charAt(i - 1) == ' ')
			{
				j++;
			}
			if (a.charAt(i) != ' ')
			{
				b[j]++;
			}
		}
		for (i = 0;i <= j;i++)
		{
			if (i > 0)
			{
				System.out.print(",");
			}
			System.out.printf("%d",b[i]);
		}


	}
}
