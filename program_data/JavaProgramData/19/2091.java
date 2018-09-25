package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[101]);
		String sor = new String(new char[101]);
		String rep = new String(new char[101]);
		int dec;
		int i;
		int j;
		zfc = new Scanner(System.in).nextLine();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sor = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			rep = tempVar2.charAt(0);
		}
		int n = zfc.length();
		int k = sor.length();


		for (i = 0;i < n;i++)
		{
			dec = 0;
			for (j = i;j <= i + k - 1;j++)
			{
				if (zfc.charAt(j) != sor.charAt(j - i))
				{
					dec = 1;
					break;
				}
			}

			if (((i == 0) && (dec == 0)) || ((dec == 0) && (zfc.charAt(i - 1) == ' ' || zfc.charAt(i - 1) == ',' || zfc.charAt(i - 1) == '.')))
			{
				System.out.printf("%s",rep);
				i = i + k - 1;
			}
			else
			{
				System.out.printf("%c",zfc.charAt(i));
				continue;
			}
		}
		return 0;
	}

}

