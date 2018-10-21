package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int p;
		int n = 0;
		int s = 0;
		String snt = new String(new char[1000]);
		snt = new Scanner(System.in).nextLine();
		for (i = 0;snt.charAt(i) != '\0';i++)
		{
			n++;
		}
		for (i = 0;i <= n;i++)
		{
			s = 0;
			if (snt.charAt(i) == ' ')
			{
				for (p = i + 1;snt.charAt(p) == ' ';p++)
				{
					s++;
				}
				for (p = i + 1;p <= n - s;p++)
				{
					snt = tangible.StringFunctions.changeCharacter(snt, p, snt.charAt(p + s));
				}
			}
			n -= s;
		}
		System.out.printf("%s\n",snt);
		return 0;
	}


}

