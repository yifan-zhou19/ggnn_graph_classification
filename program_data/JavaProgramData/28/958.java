package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int[] m = new int[1000];
		int n;
		String a = new String(new char[5000]);
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0,k = 0;i < n;i++)
		{
			if (a.charAt(i) != ' ')
			{
				m[k]++;
			}
			else
			{
				do
				{
					i++;
				} while (a.charAt(i) == ' ');
					i--;
				k++;
				continue;
			}
		}
		System.out.printf("%d",m[0]);
		for (i = 1;i <= k;i++)
		{
			System.out.printf(",%d",m[i]);
		}
		return 0;
	}

}
