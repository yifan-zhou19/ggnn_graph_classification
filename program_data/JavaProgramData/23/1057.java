package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[101]);
		int indexa;
		int indexb;
		int i;
		a = new Scanner(System.in).nextLine();

		indexb = a.length() - 1;
		while (indexb > 0 && a.charAt(indexb) == ' ')
		{
			indexb--;
		}

		if (indexb == 0 && a.charAt(indexb) == ' ')
		{
			indexb--;
		}

		indexa = indexb - 1;
		int num = 0;
		while (indexa >= 0)
		{
			if (a.charAt(indexa) != ' ')
			{
				indexa--;
			}
			else
			{
				if (num != 0)
				{
					System.out.print(" ");
				}
				num++;
				for (i = indexa + 1;i <= indexb;i++)
				{
					System.out.printf("%c",a.charAt(i));
				}
				indexb = indexa - 1;
				while (indexb > 0 && a.charAt(indexb) == ' ')
				{
					indexb--;
				}
				if (indexb == 0 && a.charAt(indexb) == ' ')
				{
					indexb--;
				}
				indexa = indexb - 1;
			}
		}

		if (indexb >= 0)
		{
			if (num != 0)
			{
					System.out.print(" ");
			}
			num++;
			for (i = 0;i <= indexb;i++)
			{
				System.out.printf("%c",a.charAt(i));
			}
		}
		System.out.print("\n");
	}
}
