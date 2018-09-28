package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] qiwang = new int[1000];
	public static int qiwangs;
	public static int qiwange;
	public static int[] tianji = new int[1000];
	public static int tianjis;
	public static int tianjie;

	public static int Main()
	{
		int i;
		while ((n != 0 && n != 0 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			for (i = 0;i < n;i++)
			{
				tianji[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < n;i++)
			{
				qiwang[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			sort(tianji,tianji + n);
			sort(qiwang,qiwang + n);
			qiwangs = 0;
			qiwange = n - 1;
			tianjis = 0;
			tianjie = n - 1;
			int yinzi = 0;
			while (qiwangs <= qiwange)
			{
				while (tianji[tianjis] > qiwang[qiwangs] && qiwangs <= qiwange)
				{
					yinzi += 200;
					tianjis++;
					qiwangs++;
				}
				while (tianji[tianjie] > qiwang[qiwange] && qiwangs <= qiwange)
				{
					yinzi += 200;
					tianjie--;
					qiwange--;
				}
				if (tianji[tianjis] < qiwang[qiwange] && qiwangs <= qiwange)
				{
					yinzi -= 200;
				}
				qiwange--;
				tianjis++;
			}
			System.out.print(yinzi);
			System.out.print("\n");
		}
		return 0;
	}
}

