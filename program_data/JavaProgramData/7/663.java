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
		for (i = 0;i < n - k + 2;i++)
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

			if (dec == 0)
			{
				System.out.printf("%s",rep);
				break;
			}
			else if ((i != n - 1) && (dec != 0))
			{
				System.out.printf("%c",zfc.charAt(i));
				continue;
			}
			else if ((i == n - 1) && (dec != 0))
			{
				System.out.printf("%c\n",zfc.charAt(i));
			}
		}
		if (i == n - k + 2)
		{
			System.out.printf("%s\n", (zfc.charAt(i)));
		}
		else
		{
			System.out.printf("%s\n", (zfc.charAt(i + k)));
		}



		return 0;
	}

}

