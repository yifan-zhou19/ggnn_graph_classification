package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[301]);
		char[] b = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		int i;
		int j;
		int k = 0;
		int[] s = new int[52];
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
			{
				k = 1;
				j = a.charAt(i) - 'A';
				s[j] += 1;
			}
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				k = 1;
				j = a.charAt(i) - 'a' + 26;
				s[j] += 1;
			}
		}
			for (i = 0;i < 52;i++)
			{
			if (s[i] != 0)
			{
				System.out.printf("%c=%d\n",b[i],s[i]);
			}
			}
				if (k == 0)
				{
					System.out.print("No");
				}


	}
}
