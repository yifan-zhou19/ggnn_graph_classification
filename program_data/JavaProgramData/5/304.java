package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String yuanshi = new String(new char[500]);
		String bijiao = new String(new char[500]);
		String laji = new String(new char[3]);
		double cankao;
		double shiji;
		int jishu = 0;
		int i;
		int m;
		int n;
		int panduan = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			cankao = Double.parseDouble(tempVar);
		}
		laji = new Scanner(System.in).nextLine();
		yuanshi = new Scanner(System.in).nextLine();
		bijiao = new Scanner(System.in).nextLine();
		m = yuanshi.length();
		n = bijiao.length();
		for (i = 0;i < m;i++)
		{
			if (yuanshi.charAt(i) == bijiao.charAt(i))
			{
				jishu++;
			}
			if (yuanshi.charAt(i) != 'A' && yuanshi.charAt(i) != 'T' && yuanshi.charAt(i) != 'G' && yuanshi.charAt(i) != 'C' && yuanshi.charAt(i) != '\0')
			{
				panduan++;
			}
			if (bijiao.charAt(i) != 'A' && bijiao.charAt(i) != 'T' && bijiao.charAt(i) != 'G' && bijiao.charAt(i) != 'C' && bijiao.charAt(i) != '\0')
			{
				panduan++;
			}
		}
		if (m != n || panduan != 0)
		{

			System.out.print("error");
		}
		else if (m == n && panduan == 0)
		{
			shiji = jishu * 1.0 / m;
			if (shiji > cankao)
			{
				System.out.print("yes");
			}
			else
			{
				System.out.print("no");
			}
		}


		return 0;
	}

}

