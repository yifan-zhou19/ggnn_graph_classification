package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] changdu = new int[200];
		String zfc = new String(new char[2000]);
		int[] weizhi = new int[200];
		int n;
		int i;
		int j;
		int k = 1;
		int l;
		int s = 0;
		int e;
		int f;
		zfc = new Scanner(System.in).nextLine();
		n = zfc.length();
		for (i = 0;i < n;i++)
		{
			if (zfc.charAt(i) == ' ' || zfc.charAt(i) == ',')
			{
				weizhi[k] = i;
				k++;
			}
		}
		l = k;
		weizhi[0] = -1;
		weizhi[l] = n;
		for (k = 0;k < l;k++)
		{
			changdu[k] = weizhi[k + 1] - weizhi[k] - 1;
			if (changdu[k] == 0)
			{
				changdu[k] = 10;
			}
		}
		for (j = 0;j < l;j++)
		{
			if (s < changdu[j])
			{
				s = changdu[j];
				e = j;
			}
		}
		s = 10;
		for (j = 0;j < l;j++)
		{
			if (s > changdu[j])
			{
				s = changdu[j];
				f = j;
			}
		}
		for (i = weizhi[e] + 1;i < weizhi[e+1];i++)
		{
			System.out.printf("%c",zfc.charAt(i));
		}
		System.out.print("\n");
		for (i = weizhi[f] + 1;i < weizhi[f + 1];i++)
		{
			System.out.printf("%c",zfc.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}
}
