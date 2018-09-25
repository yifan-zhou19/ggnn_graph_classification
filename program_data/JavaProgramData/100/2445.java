package <missing>;

public class GlobalMembers
{
	public static void Main(String args)
	{
		String cArray = new String(new char[300]);
		char ch;
		int i;
		int j;
		int len;
		int[] Cap1 = new int[26];
		int[] Cap2 = new int[26];
		int flag = 0;

		for (i = 0; i < 26; i++)
		{
			Cap1[i] = 0;
			Cap2[i] = 0;
		}

		cArray = new Scanner(System.in).nextLine();

		len = cArray.length();

		//for(i=0; i<len; i++)

		for (i = 0; i < len; i++)
		{
			ch = cArray.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
			{
				Cap1[ch - 'A']++;
				flag++;
			}
			else if (ch >= 'a' && ch <= 'z')
			{
				Cap2[ch - 'a']++;
				flag++;
			}
		}

		if (flag > 0)
		{
		for (i = 0; i < 26; i++)
		{
			if (Cap1[i] > 0)
			{
				System.out.printf("%c=%d\n", 'A' + i, Cap1[i]);
			}
		}
		for (i = 0; i < 26; i++)
		{
			if (Cap2[i] > 0)
			{
				System.out.printf("%c=%d\n", 'a' + i, Cap2[i]);
			}
		}
		}
		else
		{
			System.out.print("No\n");
		}

	}

}
