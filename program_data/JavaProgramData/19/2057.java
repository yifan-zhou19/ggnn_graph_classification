package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] zfc = new char[100][100];
		String bth = new String(new char[100]);
		String th = new String(new char[100]);
		String s = new String(new char[100]);
		int i;
		int e;
		int j = 0;
		int t = 0;
		int p;
		s = new Scanner(System.in).nextLine();
		bth = new Scanner(System.in).nextLine();
		th = new Scanner(System.in).nextLine();
		e = s.length();
		for (i = 0;i < 100;i++)
		{
			for (p = 0;p < 100;p++)
			{
				zfc[i][p] = 0;
			}
		}
		for (i = 0;i < e;i++)
		{
			if (s.charAt(i) != ' ')
			{
			   zfc[j][t] = s.charAt(i);
			   t++;
			}
			else
			{
				j++;
				t = 0;
			}
		}

		for (i = 0;i < j;i++)
		{
			if (strcmp(zfc[i],bth) == 0)
			{
				System.out.printf("%s ",th);
			}
			else
			{
				System.out.printf("%s ",zfc[i]);
			}
		}
		if (strcmp(zfc[j],bth) == 0)
		{
			System.out.printf("%s",th);
		}
		else
		{
			System.out.printf("%s",zfc[j]);
		}
		return 0;
	}



}
