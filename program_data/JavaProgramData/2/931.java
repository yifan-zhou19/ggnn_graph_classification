package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int i;
	public static int p;
	public static int j;
	public static int t;
	public static int q;
	public static int[] SAVER = new int[1500];
	public static char[][] R = new char[1500][50];
	public static int[] RR = new int[50];

	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		t = 0;
		for (i = 1;i <= n;i++)
		{
			SAVER[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.in.read();
			R[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			j = 0;
			while (R[i][j] != '\0')
			{
				RR[R[i][j] - 'A']++;
				j++;
			}
		}
		for (i = 'A';i <= 'Z';i++)
		{
			if (RR[i - 'A'] > t)
			{
				t = RR[i - 'A'];
				q = i;
			}
		}
		System.out.print((char)q);
		System.out.print("\n");
		System.out.print(t);
		System.out.print("\n");
		for (i = 1;i <= n;i++)
		{
			j = 0;
			while (R[i][j] != '\0')
			{
				if (R[i][j] == q)
				{
					System.out.print(SAVER[i]);
					System.out.print("\n");
				}
				j++;
			}
		}
		return 0;
	}

}

