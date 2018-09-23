package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[26];
		int m;
		int i;
		int k;
		int l = 0;
		char c;
		String temp = new String(new char[3000]);
		for (k = 0;c != '\n';k++)
		{
			c = System.in.read();
			temp = tangible.StringFunctions.changeCharacter(temp, k, c);
			m = i;
			for (i = 0;i <= 26;i++)
			{
				if (c == 'A' + i || c == 'A' + i + 32)
				{
					num[i] = num[i] + 1;
					break;
				}
			}
			if (k > 0 && ((temp.charAt(k) != temp.charAt(k - 1)) && (temp.charAt(k - 1) + 32 != temp.charAt(k)) && (temp.charAt(k) + 32 != temp.charAt(k - 1))))
			{
				if (temp.charAt(k - 1) >= 97)
				{
					temp = tangible.StringFunctions.changeCharacter(temp, k - 1, temp.charAt(k - 1) - 32);
				}
				System.out.printf("(%c,%d)", temp.charAt(k - 1), num[m]);
				num[m] = 0;
				l = 0;
			}
		}
		return 0;
	}

}

