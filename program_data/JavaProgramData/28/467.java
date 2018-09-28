package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int t;
		int s;
		int m;
		int n;
		int len;
		int[] sta = new int[320];
		int[] end = new int[320];
		String str = new String(new char[10000]);
		str = new Scanner(System.in).nextLine();
		len = str.length();

		sta[0] = 0;
		i = 1;
		for (j = 0;j < len;j++)
		{
			if (str.charAt(j - 1) == ' ' && str.charAt(j) != ' ')
			{
				sta[i] = j;
			i++;
			}
		}
		k = 0;
		for (j = 0;j < len;j++)
		{
			if (str.charAt(j - 1) != ' ' && str.charAt(j) == ' ')
			{
				end[k] = j;
			k++;
			}
		}
			end[k] = len;
			System.out.printf("%d",end[0] - sta[0]);
			for (i = 1;i < k + 1;i++)
			{
				System.out.printf(",%d",end[i] - sta[i]);
			}
	}
}
