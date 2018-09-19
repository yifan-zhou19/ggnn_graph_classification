public class book
{
	public int id;
	public String writer = new String(new char[26]);
	public int length;
}

package <missing>;

public class GlobalMembers
{
	public static book[] zz = tangible.Arrays.initializeWithDefaultbookInstances(999);
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] letter = new int[26];
		int[][] letter_book = new int[26][999];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < n; i++)
		{
			zz[i].id = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			zz[i].writer = ConsoleInput.readToWhiteSpace(true).charAt(0);
			zz[i].length = String.valueOf(zz[i].writer).length();
		}

		for (j = 0 ; j < n ; j++)
		{
			for (k = 0 ; k < zz[j].length ; k++)
			{

				letter_book[zz[j].writer.charAt(k) - 'A'][letter[zz[j].writer.charAt(k) - 'A']] = zz[j].id;
				letter[zz[j].writer.charAt(k) - 'A']++;
			}
		}
		int max = 0;
		int t;
		for (i = 0 ; i < 26 ; i++)
		{
			if (letter[i] > max)
			{
				max = letter[i];
				t = i;
			}
		}
		char m;
		m = 'A' + t;
		System.out.print(m);
		System.out.print("\n");
		System.out.print(max);
		System.out.print("\n");
		for (i = 0 ; i < max ; i++)
		{
			System.out.print(letter_book[t][i]);
			System.out.print("\n");
		}
	}
}

