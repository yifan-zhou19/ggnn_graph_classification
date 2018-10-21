package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[100]);
		final String d = "";
		String c = new String(new char[100]);
		int i = 0;
		int j = 0;
		int k;
		int weizhi1 = -1;
		int weizhi2;
		int dancishu;
		s = new Scanner(System.in).nextLine();

		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) == ' ')
			{
				weizhi2 = i;
			 for (k = 0;k < weizhi2 - weizhi1 - 1;k++)
			 {
				 d.charAt(j)[k] = s.charAt(weizhi1 + k + 1);
			 }

			 weizhi1 = weizhi2;
			 j++;
			}
		}
		weizhi2 = i;
		for (k = 0;k < weizhi2 - weizhi1 - 1;k++)
		{
				 d.charAt(j)[k] = s.charAt(weizhi1 + k + 1);
		}
		j++;
		dancishu = j;

		for (i = dancishu - 1;i > 0;i--)
		{
			System.out.printf("%s ",d.charAt(i));
		}
		System.out.printf("%s",d.charAt(0));
	}
}
