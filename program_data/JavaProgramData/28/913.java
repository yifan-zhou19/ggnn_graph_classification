package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zf = new String(new char[300 * 100]);
		zf = new Scanner(System.in).nextLine();
		int i;
		int j = 0;
		int k = 0;
		int[] length = new int[300];
		int len = zf.length();
		for (i = 0;i < len;i++)
		{
			k++;
			if (zf.charAt(i) == ' ')
			{
				length[j] = k - 1;
				j++;
				k = 0;
			}
			if (i == len - 1)
			{
				length[j] = k;
				j++;
				break;
			}
		}
		System.out.printf("%d",length[0]);
		for (i = 1;i < j;i++)
		{
			if (length[i] == 0)
			{
				continue;
			}
			System.out.printf(",%d",length[i]);
		}
		return 0;
	}

}
