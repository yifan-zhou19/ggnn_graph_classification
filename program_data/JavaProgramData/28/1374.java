package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[10000]);
		int i = -1;
		int j = 0;
		int[] len = new int[300];
		int k = 0;
		int n;
		str = new Scanner(System.in).nextLine();

		for (j = 0;str.charAt(j) != '\0';j++)
		{
			if (str.charAt(j) == ' ' && str.charAt(j - 1) != ' ')
			{
				len[k] = j - i - 1;
				k++;
			}
			if (str.charAt(j) == ' ' && str.charAt(j + 1) != ' ')
			{
				i = j;
			}
		}
		   for (n = 0;n < k;n++)
		   {
			   System.out.printf("%d,",len[n]);
		   }
		   System.out.printf("%d",j - i - 1);
			return 0;
	}

}
