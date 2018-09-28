package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sen = new String(new char[300 * 20]);
		int i;
		int k = 0;
		int wordlen = 0;
		int[] a = new int[300];
		sen = new Scanner(System.in).nextLine();
		for (i = 0;i < sen.length();i++)
		{
			if (sen.charAt(i) == ' ')
			{
				if (wordlen != 0)
				{
					a[k] = wordlen;
				k++;
				}
				wordlen = 0;
			}
			else
			{
				wordlen++;
			}
		}
		a[k] = wordlen;
		for (i = 0;i < k;i++)
		{
			System.out.printf("%d,",a[i]);
		}
		System.out.printf("%d",a[k]);
			return 0;
	}


}
