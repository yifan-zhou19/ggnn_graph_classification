package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[LEN]);
		zfc = new Scanner(System.in).nextLine();
		int[] sz = new int[NUM];
		int i;
		int j;
		int count = 0;
		int s = zfc.length();
		for (i = 0;i < s;i++)
		{
			if (zfc.charAt(i) == ' ')
			{
				sz[count + 1] = i;
				count++;
			}
		}
		sz[count + 1] = i;
		sz[0] = 0 - 1;
		int len;
		int max = 0;
		int min = 50;
		int a;
		int b;
		for (i = 1;i <= count + 1;i++)
		{
			len = sz[i] - sz[i - 1] - 1;
			if (len > max)
			{
				max = len;
				a = i;
			}
			if (len < min)
			{
				min = len;
				b = i;
			}
		}
		for (j = sz[a - 1] + 1;j < sz[a];j++)
		{
			System.out.printf("%c",zfc.charAt(j));
		}
		System.out.print("\n");
		for (j = sz[b - 1] + 1;j < sz[b];j++)
		{
			System.out.printf("%c",zfc.charAt(j));
		}
		return 0;
	}
}
