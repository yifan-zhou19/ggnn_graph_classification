package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[10000]);
		char[][] zu = new char[500][50];
		int[] len = new int[500];
		int i;
		int j = 0;
		int k = 0;
		zfc = new Scanner(System.in).nextLine();
		for (i = 0;i <= zfc.length();i++)
		{
			if (zfc.charAt(i) == ' ')
			{
				zu[j][k] = '\0';
				j++;
				k = 0;
			}
			else
			{
				zu[j][k] = zfc.charAt(i);
				k++;
			}
		}
		for (i = 0;i < j + 1;i++)
		{
			len[i] = String.valueOf(zu[i]).length();
		}
		for (i = 0;i < j;i++)
		{
			if (len[i] != 0)
			{
			   System.out.printf("%d,",len[i]);
			}
		}
		System.out.printf("%d",len[j]);
		return 0;
	}


}
