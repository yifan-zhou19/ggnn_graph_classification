package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[31]);
		String num = new String(new char[30]);
		int i;
		int[] n1 = new int[30];
		int[] n2 = new int[30];
		int k = 0;
		int l;
		int j;
		int m;
		c = new Scanner(System.in).nextLine();
		l = c.length();
		for (i = 0;i < l;i++)
		{
			if ((c.charAt(i) > 47 && c.charAt(i) < 58) && (c.charAt(i - 1) < 48 || c.charAt(i - 1)>57))
			{
				n1[k] = i; //????
			}
			if ((c.charAt(i) > 47 && c.charAt(i) < 58) && (c.charAt(i + 1) < 48 || c.charAt(i + 1)>57))
			{
				n2[k] = i; //????
				k++;
			}

		}
		for (i = 0;i < k;i++)
		{
				for (m = 0;m < 30;m++)
				{
					num = tangible.StringFunctions.changeCharacter(num, m, '\0');
				}
			for (j = n1[i];j <= n2[i];j++)
			{
				num = tangible.StringFunctions.changeCharacter(num, j - n1[i], c.charAt(j));
			}
			System.out.printf("%s\n",num);
		}
		return 0;
	}
}

