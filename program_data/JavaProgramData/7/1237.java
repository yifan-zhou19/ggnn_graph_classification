package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[300]);
		String sub = new String(new char[300]);
		String rep = new String(new char[300]);
		int i;
		int j;
		int lenstr;
		int lensub;
		int judge;
		int state = 0;
		fgets(str,300,stdin);
		fgets(sub,300,stdin);
		fgets(rep,300,stdin);
		lenstr = str.length() - 1;
		lensub = sub.length() - 1;
		for (i = 0;i <= lenstr - lensub;i++)
		{
			judge = 0;
			for (j = 0;j < lensub;j++)
			{
				judge = judge + (str.charAt(i + j) - sub.charAt(j)) * (str.charAt(i + j) - sub.charAt(j));

			}
			if (judge == 0)
			{
					state = 1;
				break;
			}
		}
		if (state == 1)
		{
			for (j = 0;j <= i - 1;j++)
			{
				System.out.printf("%c",str.charAt(j));
			}
			for (j = 0;rep.charAt(j) != '\n';j++)
			{
				System.out.printf("%c",rep.charAt(j));
			}
			for (j = i + lensub;j <= lenstr - 1;j++)
			{
				System.out.printf("%c",str.charAt(j));
			}
		}
		else
		{
			for (j = 0;j < lenstr;j++)
			{
				System.out.printf("%c",str.charAt(j));
			}
		}
		return 0;
	}

}
