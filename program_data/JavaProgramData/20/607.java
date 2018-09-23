package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int j = 0;
		int i;
		int ceshi;
		int max;
		int weizhi;
		final String str = "";
		final String substr = "";
		final String xin = "";
		String[] dizhi = new String[30];
		String a;
		String b;
		String c;
		while (scanf("%s %s",str.charAt(j),substr.charAt(j)) != EOF)
		{
			j++;
		}
		ceshi = j;


	for (j = 0;j < ceshi;j++)
	{
		dizhi[j] = str.charAt(j);
		weizhi = 1;
		max = (dizhi[j]);
		for (i = 0;str.charAt(j)[i] != '\0';i++)
		{
			if (*(str.charAt(j) + i) > max)
			{
				max = (str.charAt(j) + i);
				weizhi = i + 1;
			}
		}

			 a = str.charAt(j)[0];
			 b = substr.charAt(j)[0];
			 c = xin.charAt(j)[0];

		for (i = 0;i < weizhi;i++)
		{
			*(c.Substring(i)) = *(a.Substring(i));
		}

		for (i = weizhi;i < weizhi + 3;i++)
		{
			*(c.Substring(i)) = *(b.Substring(i) - weizhi);
		}

		for (i = weizhi;str.charAt(j)[i] != '\0';i++)
		{
			*(c.Substring(3) + i) = *(a.Substring(i));
		}

		for (i = 0;xin.charAt(j)[i] != '\0';i++)
		{
			System.out.printf("%c",*(c.Substring(i)));
		}
		System.out.print("\n");
	}
	}

}
