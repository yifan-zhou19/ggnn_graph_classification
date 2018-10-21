package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int size;
		String zfc = new String(new char[100]);
		char qp;
		zfc = new Scanner(System.in).nextLine();
		size = zfc.length();
		for (i = 0;i < size;i++)
		{
			if (i == size-1)
			{
				qp = zfc.charAt(size-1) + zfc.charAt(0);
				System.out.printf("%c",qp);
			}
			else
			{
				qp = zfc.charAt(i) + zfc.charAt(i + 1);
				System.out.printf("%c",qp);
			}
		}
		return 0;
	}
}
