package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[300]);
		int[] n = new int[26];
		int c;
		int i;
		int j;
		int flag = 0;
		s = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			{
				c = s.charAt(i) - 97;
				n[c]++;
			}
		}
		for (j = 0;j < 26;j++)
		{
			if (n[j] != 0)
			{
				System.out.printf("%c=%d\n",j + 97,n[j]);
				flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("No");
		}
	}


}
