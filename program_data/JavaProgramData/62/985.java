package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		String zfc = new String(new char[1000]);
		String ans = new String(new char[1000]);
		String p1;
		String p2;
		 zfc = new Scanner(System.in).nextLine();
		 p1 = zfc;
		 p2 = ans;
		 m = 0;
		for (i = 0; * (p1.Substring(i)) != '\0'; i++)
		{
			if (*(p1.Substring(i)) != ' ')
			{
				*(p2.Substring(m)) = *(p1.Substring(i));
				m++;
			}
			else if (*(p1.Substring(i)) == ' ' && *(p1.Substring(i) + 1) != ' ')
			{
				*(p2.Substring(m)) = *(p1.Substring(i));
				m++;
			}
			else
			{
				continue;
			}
		}
		*(p2.Substring(m)) = '\0';
				System.out.print(p2);
		return 0;
	}

}
