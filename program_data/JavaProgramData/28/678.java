package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] wz1 = new int[300];
		int[] wz2 = new int[300];
		int j = 1;
		int k = 0;
		String str = new String(new char[1000]);
		str = new Scanner(System.in).nextLine();
		for (i = 0;i < str.length();i++)
		{
			if (str.charAt(i) != ' ' && str.charAt(i - 1) == ' ')
			{
				wz1[j] = i;
				j++;

			}
			if (str.charAt(i) != ' ' && str.charAt(i + 1) == ' ')
			{
				wz2[k] = i;
				k++;

			}
		}
		wz1[0] = 0;
		wz2[k] = str.length() - 1;

		for (i = 0;i < j - 1;i++)
		{
		  System.out.printf("%d,",wz2[i] - wz1[i] + 1);

		}
		System.out.printf("%d",wz2[k] - wz1[j - 1] + 1);

		return 0;
	}

}
