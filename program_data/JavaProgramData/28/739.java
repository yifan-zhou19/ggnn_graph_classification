package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[10000]);
		char[][] subs = new char[300][30];
		int i = 0;
		int j;
		int k;
		int[] len = new int[300];
		s = new Scanner(System.in).nextLine();
		for (j = 0;;j++)
		{
			for (k = 0;;)
			{
				if (s.charAt(i) != ' ' && s.charAt(i) != 0)
				{
					subs[j][k] = s.charAt(i);
					i++;
					k++;
				}
				else if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ' || s.charAt(i) == 0)
				{
					subs[j][k] = 0;
					i++;
					break;
				}
				else
				{
					i++;
				}
			}
			if (s.charAt(i - 1) == 0)
			{
				break;
			}
		}
		for (k = 0;k <= j;k++)
		{
			len[k] = String.valueOf(subs[k]).length();
		}
		System.out.printf("%d", len[0]);
		for (k = 1;k <= j;k++)
		{
			System.out.printf(",%d", len[k]);
		}
		scanf(" ");
		return 0;
	}
}
