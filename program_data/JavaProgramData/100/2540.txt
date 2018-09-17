package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[301]);
		char c;
		int[] numx = new int[30];
		int[] numd = new int[30];
		int len;
		int j;
		int i;
		int count = 0;

		s = new Scanner(System.in).nextLine();
		len = s.length();
		for (j = 0;j < len;j++)
		{
			if (s.charAt(j) >= 65 && s.charAt(j) <= 90)
			{
	  numd[s.charAt(j) - 65]++;
			}
			else if (s.charAt(j) >= 97 && s.charAt(j) <= 122)
			{
				numx[s.charAt(j) - 97]++;
			}
		}

	 c = 65;
		for (i = 0;i < 26;i++,c++)
		{

			if (numd[i] != 0)
			{
								System.out.printf("%c=%d\n",c,numd[i]);
							count = 1;
			}
		}
							c = 97;
			for (i = 0;i < 26;i++,c++)
			{

			if (numx[i] != 0)
			{
								System.out.printf("%c=%d\n",c,numx[i]);
							count = 1;
			}
			}
	if (count == 0)
	{
	System.out.print("No");
	}

	}

}
