package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sent = new String(new char[100]);
		String zfc = new String(new char[100]);
		int i;
		int k = 0;
		int count;
		sent = new Scanner(System.in).nextLine();
		int n = sent.length();
		for (i = 0;i < n;i++)
		{
			if (sent.charAt(i) == ' ')
			{
			  zfc = tangible.StringFunctions.changeCharacter(zfc, i, '\0');
			  break;
			}
			else
			{
			zfc = tangible.StringFunctions.changeCharacter(zfc, i, sent.charAt(i));
			}
		}
		if (i == 1)
		{
			for (k = i + 1;k < n;k++)
			{

			if (zfc.charAt(0) == sent.charAt(k))
			{
				System.out.printf("%d",k - i);
				break;
			}
			}
		}
		else
		{
		for (k = i + 1;k < n;k++)
		{
			count = 0;
			for (int m = 0;m < i - 1;m++)
			{
				if (zfc.charAt(m) != sent.charAt(m + k))
				{
					break;
				}
				else
				{
					count++;
				}
			}
			if (count == i - 1)
			{
				k = k - i - 1;
				System.out.printf("%d",k);
				break;
			}
		}
		}
		return 0;
	}

}

