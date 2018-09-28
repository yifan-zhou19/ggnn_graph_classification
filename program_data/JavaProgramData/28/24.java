package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[1000]);
		int[] b = new int[1000];
		int i;
		int j = 0;
		int n;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) == ' ')
			{
				j++;
			}
			while (a.charAt(i) == ' ')
			{
				i++;
			}
			b[j]++;
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d",b[j]);
	}



}
