package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[30000]);
		int[] b = new int[300];
		int n;
		int i;
		int j = 0;
		int k = 0;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) != ' ' && k == 0)
			{
				b[j] = b[j] + 1;
			}
			else if (a.charAt(i) == ' ' && k == 0)
			{
				j++;
				k = 1;
			}
			else if (a.charAt(i) != ' ' && k == 1)
			{
				k = 0;
				b[j] = b[j] + 1;
			}
		}
		if (b[j] == 0)
		{
			j = j - 1;
		}
		if (a.charAt(0) == ' ')
		{
			for (i = 1;i <= j - 1;i++)
			{
				System.out.printf("%d,",b[i]);
			}
			System.out.printf("%d",b[j]);
		}
		else
		{
			for (i = 0;i <= j - 1;i++)
			{
				System.out.printf("%d,",b[i]);
			}
			System.out.printf("%d",b[j]);
		}
	}
}
