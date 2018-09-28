package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[30000]);
		char[][] w = new char[300][100];
		int[] len = new int[300];
		int i;
		int m = 0;
		int t = 0;
		str = new Scanner(System.in).nextLine();
		for (i = 0;;i++)
		{
			if (str.charAt(i) != ' ' && str.charAt(i) != '\0')
			{
				 w[t][m] = str.charAt(i);
				m++;
			}
			else
			{
				if (str.charAt(i - 1) != ' ')
				{
				   w[t][m] = '\0';
				   m = 0,t++;
				}
			}
			if (str.charAt(i) == '\0')
			{
				break;
			}
		}
		for (i = 0;i < t;i++)
		{
			len[i] = String.valueOf(w[i]).length();
			if (i != t - 1)
			{
			   System.out.printf("%d,",len[i]);
			}
			else
			{
				System.out.printf("%d",len[i]);
			}
		}
		return 0;
	}


}
