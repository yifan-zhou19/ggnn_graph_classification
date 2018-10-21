package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String b = new String(new char[1000]);

		int i;
		int[] wz = new int[300];
		int x = 0;
		int d = 0;
		int word;


		b = new Scanner(System.in).nextLine();
		for (i = 0;i < 300;i++)
		{
			wz[i] = 0;
		}

		for (i = 0;i < b.length();i++)
		{

			if (b.charAt(i) != ' ')
			{

				wz[x]++;

			}

			else
			{
				x++;
			}
		}
		word = x;


		for (i = 0;i < word;i++)
		{
			if (wz[i] != 0)
			{
				System.out.printf("%d,",wz[i]);
			}
		}
		System.out.printf("%d",wz[word]);

		return 0;
	}


}
