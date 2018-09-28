package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String a = "";
		int[] n = new int[300];
		int i;
		int j = 0;
		int k;
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) != ' ')
			{
				n[j]++;
			}
			else
			{
				j++;
			}
		}
		k = j;
		for (j = 0;j < k;j++)
		{
			if (n[j] != 0)
			{
				System.out.printf("%d,",n[j]);
			}
		}
		System.out.printf("%d\n",n[k]);
	}
}
