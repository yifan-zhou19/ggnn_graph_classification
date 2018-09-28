package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[999]);
		char[][] d = new char[999][999];
		a = new Scanner(System.in).nextLine();
		int i;
		int j;
		int k = 0;
		int kk;
		for (i = 0;i < a.length();i++)
		{
			kk = 0;
			for (j = i;a.charAt(j) != ' ';j++)
			{
				kk = 1;
				d[k][j - i] = a.charAt(j);
				d[k][j - i + 1] = '\0';
				if (a.charAt(j) == '\0')
				{
					break;
				}
			}
			i = j;
			if (kk == 1)
			{
				k++;
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%d,",String.valueOf(d[i]).length());
		}
		System.out.printf("%d",String.valueOf(d[k - 1]).length());
		return 0;
	}
}
