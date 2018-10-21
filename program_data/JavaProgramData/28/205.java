package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[3000]);
		a = new Scanner(System.in).nextLine();
		int[] counter = new int[300];
		int i = 0;
		int j = 0;
		int t;
		while (a.charAt(i) != '\0')
		{
			if (a.charAt(i) != ' ' && a.charAt(i + 1) != ' ')
			{
				counter[j]++;
				i++;
			}
			else if (a.charAt(i) != ' ' && a.charAt(i + 1) == ' ')
			{
				counter[j]++;
				j++;
				i++;
			}
			else
			{
				i++;
			}
		}
		for (t = 0;t < j;t++)
		{
			System.out.printf("%d,",counter[t]);
		}
		System.out.printf("%d\n",counter[j]);
		return 0;
	}
}
