package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		int l = a.length();
		int[] p = new int[100];
		for (int i = 0;i < l;i++)
		{
			if ((a.charAt(i) == a.charAt(l - 1)) && (p[i] == 0)) //?????
			{
				for (int j = i - 1;j >= 0;j--)
				{
					if ((a.charAt(j) == a.charAt(0)) && (p[j] == 0)) //???????????
					{
						p[j] = i;
						p[i] = -1;
						System.out.print(j);
						System.out.print(' ');
						System.out.print(i);
						System.out.print("\n");
						break;
					}
				}
			}
		}
		return 0;
	}
}
