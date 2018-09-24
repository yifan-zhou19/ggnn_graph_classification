package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String dc = new String(new char[3000]);
		dc = new Scanner(System.in).nextLine();
		int len;
		len = dc.length();
		int i;
		int[] sz = new int[300];
		int j = 0;
		int k = 1;
		for (i = 0;i < len;i++)
		{
			if (dc.charAt(i) != 32)
			{
				sz[j]++;
			}
			if (dc.charAt(i) == 32)
			{
				j++;
				do
				{
					if (dc.charAt(i + 1) == 32)
					{
						i++;
					}
				} while (dc.charAt(i + 1) == 32);
			}
		}
		for (i = 0;i < len;i++)
		{
			if (dc.charAt(i) == ' ')
			{
				k++;
				do
				{
					if (dc.charAt(i + 1) == 32)
					{
						i++;
					}
				} while (dc.charAt(i + 1) == 32);
			}
		}
		for (i = 0;i < k;i++)
		{
			if (i != k - 1)
			{
				System.out.printf("%d,",sz[i]);
			}
			else
			{
				System.out.printf("%d",sz[i]);
			}
		}
		return 0;
	}












}
