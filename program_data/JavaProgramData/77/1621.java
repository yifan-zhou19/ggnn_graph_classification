package <missing>;

public class GlobalMembers
{
	public static char Boy;
	public static char Girl;
	public static String queue = new String(new char[100]);
	public static int FindPartner(int i)
	{
		if (queue.charAt(i + 1) == Girl)
		{
			System.out.print(i);
			System.out.print(' ');
			System.out.print(i + 1);
			System.out.print("\n");
			return i + 1;
		}
		else
		{
			int pnt = i;
			while (queue.charAt(pnt + 1) == Boy)
			{
				pnt = FindPartner(pnt + 1);
			}
			System.out.print(i);
			System.out.print(' ');
			System.out.print(pnt + 1);
			System.out.print("\n");
			return pnt + 1;
		}
	}
	public static int Main()
	{
		queue = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int l = queue.length();
		Boy = queue.charAt(0);
		Girl = queue.charAt(l - 1);
		FindPartner(0);
		return 0;
	}
}

