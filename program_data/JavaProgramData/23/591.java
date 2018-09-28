package <missing>;

public class GlobalMembers
{
	//Yang Lingbo   1200017623


	public static int Main()
	{
		int i;
		int j = 0;
		int k = 0;
		int len_total;
		int count = 0;
		String str = new String(new char[100]); //str????  word???
		final String word = "";
		str = new Scanner(System.in).nextLine();
		len_total = str.length();
		for (i = 0;i < len_total;i++)
		{ //????
			if (str.charAt(i) != ' ')
			{
				word.charAt(count)[k++] = str.charAt(i);
			}
			else
			{
				k = 0;
				count++;
			}
		}

		//????,??count???????????1??????????count++????
		for (i = count;i >= 0;i--)
		{
			System.out.print(word.charAt(i));
			if (i != 0)
			{
				System.out.print(' ');
			}
		}
		System.out.print("\n");
		return 0;
	}

}
