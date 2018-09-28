package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] n = new int[300];
		String a = new String(new char[30000]);
		a = new Scanner(System.in).nextLine();
		int l = 0;
		int k = 0;
		for (int i = 0;;i++)
		{
			if ((int)a.charAt(i) == 0)
			{
				n[l] = k;
				break;
			}
			else if ((int)a.charAt(i) == 32)
			{
				n[l] = k;
				k = 0;
				l++;
			}
			else
			{
				k++;
			}
		}
		for (int j = 0;j < l;j++)
		{
			if (n[j] != 0)
			{
				System.out.printf("%d,",n[j]);

			}
		}
		System.out.printf("%d",n[l]);
		return 0;
	}
}
