package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] s = new int[500];
		int i;
		int k;
		int x;
		String d = new String(new char[10000]);
		d = new Scanner(System.in).nextLine();
		k = 0;
		for (i = 0;d.charAt(i) != 0;i++)
		{
			if (d.charAt(i) != ' ')
			{
				s[k]++;
			}
			else
			{
				k++;
				s[k] = 0;
			}
		}
		for (x = 0;x <= k;x++)
		{
			if (x == 0 && s[x] != 0)
			{
				System.out.printf("%d",s[x]);
			}
			if (x > 0 && s[x] != 0)
			{
				System.out.printf(",%d",s[x]);
			}
		}
		return 0;
	}

}
