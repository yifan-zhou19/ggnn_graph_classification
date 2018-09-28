package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int pd;
		String bsf = new String(new char[81]);
		String p;
		p = bsf;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < n;i++)
		{
			pd = 1;
			bsf = new Scanner(System.in).nextLine();
			m = bsf.length();
			if (p >= 48 && p <= 57)
			{
				pd = 0;
			}
			else
			{
				for (j = 0;j < m;j++)
				{
					if (!(*(p.Substring(j)) == 95 || (*(p.Substring(j)) > 96 && *(p.Substring(j)) < 123) || (*(p.Substring(j))>47 && *(p.Substring(j)) < 58) || (*(p.Substring(j))>64 && *(p.Substring(j)) < 91)))
					{
						pd = 0;
					}
				}
			}
			System.out.printf("%d\n",pd);
		}
		return 0;
	}
}

