package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[30]);
		int i;
		int[] symbol = new int[30];
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != 0;i++)
		{
			if ((a.charAt(i) == '1') || (a.charAt(i) == '2') || (a.charAt(i) == '3') || (a.charAt(i) == '4') || (a.charAt(i) == '5') || (a.charAt(i) == '6') || (a.charAt(i) == '7') || (a.charAt(i) == '8') || (a.charAt(i) == '9') || (a.charAt(i) == '0'))
			{
				symbol[i] = 1;
				System.out.printf("%c",a.charAt(i));
			}
			else
			{
				symbol[i] = 0;
				if (symbol[i - 1] == 1)
				{
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}
