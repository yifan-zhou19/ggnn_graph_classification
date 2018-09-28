package <missing>;

public class GlobalMembers
{
	public static int legal(String zfc)
	{
		int lenth;
		int i;
		int m = 1;
		lenth = zfc.length();

		if (zfc[0].equals('_') || (zfc[0].compareTo('A') >= 0 && zfc[0].compareTo('Z') <= 0) || (zfc[0].compareTo('a') >= 0 && zfc[0].compareTo('z') <= 0))
		{
			for (i = 1;i < lenth;i++)
			{
				if ((zfc[i].compareTo('A') >= 0 && zfc[i].compareTo('Z') <= 0) || (zfc[i].compareTo('a') >= 0 && zfc[i].compareTo('z') <= 0) || (zfc[i].compareTo('0') >= 0 && zfc[i].compareTo('9') <= 0) || zfc[i].equals('_'))
				{
					m = 1;
				}
				else
				{
					m = 0;
					break;
				}
			}
			if (m != 0)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		else
		{
			return 0;
		}
	}

	public static void Main(String[] args)
	{
		int n;
		int i;
		int judge;
		String str = new String(new char[81]);
			 str = new Scanner(System.in).nextLine();
			 n = Integer.parseInt(str);
		for (i = 0;i < n;i++)
		{
			str = new Scanner(System.in).nextLine();
			judge = legal(str);
			System.out.printf("%d\n",judge);
		}

	}

}
