package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		short length;
		short i;
		short j = 1;
		String number = new String(new char[6]);
			while (j <= 4)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					number = tempVar.charAt(0);
				}
				length = number.length();
				for (i = length - 1;i != -1;i--)
				{
					System.out.printf("%c",number.charAt(i));
				}
				System.out.print('\n');
				j++;
			}
		return (0);
	}
}

