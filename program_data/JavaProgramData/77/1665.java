package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int[] b = new int[100];
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		b[0] = 0;
		for (i = 1;i < a.length();i++)
		{
			if (a.charAt(i) == a.charAt(0))
			{
				b[++j] = i;
			}
			else
			{
				System.out.print(b[j--]);
				System.out.print(" ");
				System.out.print(i);
				System.out.print("\n");
			}
		}

		return 0;
	}

}
