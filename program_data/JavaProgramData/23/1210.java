package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int len;
		int i;
		int j;
		int k;
		int label;
		String ss = new String(new char[101]);
		ss = new Scanner(System.in).nextLine();
		len = ss.length();
		for (i = 0;i < len;i++)
		{
			if (ss.charAt(i) == ' ')
			{
				label = i;
				break;
			}
			if (i = len - 1)
			{
				label = len;
			}
		}
		i = len - 1;
		while (i >= 0)
		{
			for (j = i;j >= 0;j--)
			{
				if (ss.charAt(j) == ' ')
				{
					break;
				}
			}
			for (k = j + 1;k <= i;k++)
			{
				System.out.printf("%c",ss.charAt(k));
			}
			//if (i!=label-1 && label!=len)
			//	printf(" ");
			if (j >= 0)
			{
			System.out.printf("%c",ss.charAt(j));
			}
			i = j - 1;
		}
	}

}
