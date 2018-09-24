package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int count = 0;
		int[] weizhi = new int[100];
		String zf = new String(new char[200]);
		zf = new Scanner(System.in).nextLine();
		for (i = 0;i < zf.length();i++)
		{
			if (zf.charAt(i) == ' ')
			{
				;
			}
			{
				weizhi[count] = i;
		}
		}
		for (i = 0;i < zf.length();i++)
		{
			if (zf.charAt(i) != ' ')
			{
				System.out.printf("%c",zf.charAt(i));
			}
			else if (zf.charAt(i) == ' ')
			{
				System.out.print(" ");
				while (true)
				{
					if (zf.charAt(i + 1) == ' ')
					{
						i++;
					}
					else
					{
						break;
					}
				}
			}
		}
		return 0;
	}
}
