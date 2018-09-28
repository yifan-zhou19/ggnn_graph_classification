package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[502]);
		String str1 = new String(new char[502]);
		int i;
		int j;
		int k;
		int l;
		int s;
		int r;
		int temp;
		str = new Scanner(System.in).nextLine();
		s = str.length();
			for (k = 1;k <= s - 1;k++)
			{
				for (i = 0;i <= s - k - 1;i++)
				{
					if (i + k > s - 1)
					{
					break;
					}
					r = 1;
				 for (j = i;j <= i + k;j++)
				 {
				str1 = tangible.StringFunctions.changeCharacter(str1, i + k - (j - i), str.charAt(j));
				 }
				for (j = i;j <= i + k;j++)
				{
				if (str1.charAt(j) != str.charAt(j))
				{
				r = 0;
				break;
				}
				}
					if (r == 1)
					{
				for (j = i;j <= i + k;j++)
				{
				System.out.printf("%c",str.charAt(j));
				}
				System.out.print("\n");
					}



				}
			}






	}
}

