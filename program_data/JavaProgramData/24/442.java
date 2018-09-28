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
		max = len[1];
		w1 = 1;
		min = len[1];
		w2 = 1;
		for (i = 2;i < num + 1;i++)
		{
			if (max < len[i])
			{
				w1 = i;
				max = len[i];
			}
			if (min > len[i])
			{
				w2 = i;
				min = len[i];
			}
		}
		for (i = beg[w1];i < beg[w1] + len[w1];i++)
		{
		System.out.printf("%c",s.charAt(i));
		}
		System.out.print("\n");
		for (i = beg[w2];i < beg[w2] + len[w2];i++)
		{
		System.out.printf("%c",s.charAt(i));
		}
		return 0;
	}
}
