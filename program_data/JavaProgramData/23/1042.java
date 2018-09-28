package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[200]);
		int num;
		int i;
		int lens;
		int max;
		int min;
		int w1;
		int w2;
		int[] len = new int[200];
		int[] beg = new int[200];
		int j;
		s = new Scanner(System.in).nextLine();
		num = 1;
		beg[1] = 0;
		lens = s.length();
		for (i = 0;i < lens;i++)
		{
			if (s.charAt(i) == ' ')
			{
				num++;
				beg[num] = i + 1;
				len[num] = -1;
			}
			len[num]++;
		}

		for (i = num;i > 1;i--)
		{
			for (j = beg[i];j < beg[i] + len[i];j++)
			{
				  System.out.printf("%c",s.charAt(j));
			}
			System.out.print(" ");
		}
		for (j = beg[1];j < beg[1] + len[1];j++)
		{
				  System.out.printf("%c",s.charAt(j));
		}

		return 0;
	}

}
