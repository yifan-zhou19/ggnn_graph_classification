package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[3000]);
		int[] len = new int[300];
		int i;
		int j = 0;
		int n;

		s = new Scanner(System.in).nextLine();
		n = s.length();

		for (i = 0;i < n;i++)
		{
			if (s.charAt(i) != ' ')
			{
				len[j]++;
			}
			if (s.charAt(i) == ' ' && s.charAt(i - 1) != ' ')
			{
				j++;
			}
		}

		System.out.printf("%d",len[0]);
		for (i = 1;i <= j;i++)
		{
			System.out.printf(",%d",len[i]);
		}

		System.out.print("\n");
	}
}
