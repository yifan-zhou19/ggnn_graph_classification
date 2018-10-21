package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]); //????????????????
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int j;
		int len1;
		int len2;
		int[] k = new int[100];
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		len1 = s.length(); //??????
		len2 = a.length(); //????????
		for (i = 0;i < len1;i++)
		{
			for (j = i;j < i + len2;j++)
			{
				if (s.charAt(j) == a.charAt(j - i))
				{
					k[i] = k[i] + 1;
				}
				else
				{
					break;
				}
			}
			if (k[i] == len2) /*?????????len2????????
															??????????????*/
			{
				if (i == 0 && s.charAt(i + len2) == ' ') //???????????
				{
					System.out.print(b);
					i = i + len2 - 1;
				}
				else if (i == len1 - len2 && s.charAt(i - 1) == ' ') //??????
				{
					System.out.print(b);
					i = i + len2 - 1;
				}
				else if (i > 0 && i < len1 - len2 && s.charAt(i - 1) == ' ' && s.charAt(i + len2) == ' ')
				{
					System.out.print(b);
					i = i + len2 - 1;
				}
				else
				{
					System.out.print(s.charAt(i));
				}
			}
			else
			{
				System.out.print(s.charAt(i));
			}
		}
		return 0;
	}
}
