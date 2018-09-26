package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[30000]);
		char[][] zf = new char[301][300];
		int i = 0;
		int k;
		int t = 0;
		int[] len = new int[301];
		a = new Scanner(System.in).nextLine();
		while (a.charAt(i) != '\0')
		{
			k = 0;
			while (a.charAt(i) != '\0' && a.charAt(i) != ' ')
			{
				zf[t][k] = a.charAt(i);
				i++;
				k++;
			}
			zf[t][k] = '\0';
			while (a.charAt(i) == ' ')
			{
				i++;
			}
			t++;
		}
		zf[t][k + 1] = '\0';
		len[0] = String.valueOf(zf[0]).length();
		System.out.printf("%d",len[0]);
		for (i = 1;i < t;i++)
		{
			len[i] = String.valueOf(zf[i]).length();
			System.out.printf(",%d",len[i]);
		}
		return 0;
	}
}
