package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] n = new int[300];
		int i;
		int p = 0;
		int tou = 0;
		int wei;
		int l;
		int j = 0;
		int kongge = 0;
		String s = new String(new char[30000]);
		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (i = 0;i < l;i++)
		{
			if (s.charAt(i) == ' ')
			{
				kongge = 1;
			}
		}
		if (kongge == 1)
		{
			for (i = 0;i < l;i++)
			{
				if (s.charAt(i) == ' ' && p == 0)
				{
					wei = i;
					n[j] = wei - tou;
					j++;
					p = 1;
				}
				if (s.charAt(i) != ' ' && p == 1)
				{
					tou = i;
					p = 0;
				}
			}
			System.out.printf("%d",n[0]);
			for (i = 1;i < j;i++)
			{
				System.out.printf(",%d",n[i]);
			}
			System.out.printf(",%d",l - tou);
		}
		else
		{
			System.out.printf("%d",l);
		}
		return 0;
	}
}
