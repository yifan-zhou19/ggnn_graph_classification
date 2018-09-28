package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[30000]);
		str = new Scanner(System.in).nextLine();
		int i;
		int len;
		int k = 0;
		int m = 0;
		len = str.length();
		int[] kong = new int[500];
		for (i = 0;i < len;i++)
		{
			 if (str.charAt(i) == ' ')
			 {
				   kong[k] = i;
				   k++;
			 }
		}
		int[] chang = new int[500];
		for (i = 0;i < k - 1;i++)
		{
			  chang[m] = kong[i + 1] - kong[i] - 1;
			  m++;
		}
		if (k != 0)
		{
		System.out.printf("%d,",kong[0]);
		for (i = 0;i < m;i++)
		{
			if (chang[i] != 0)
			{
			   System.out.printf("%d,",chang[i]);
			}
		}
		System.out.printf("%d",len - kong[k - 1] - 1);
		}
		else
		{
			System.out.printf("%d",len);
		}
	return 0;
	}
}
