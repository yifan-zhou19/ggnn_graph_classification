package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[10000]);
		int i;
		int j = 0;
		int k = 0;
		int[] a = new int[302];
		int n;
		s = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			;
		}
		n = i;
		s = tangible.StringFunctions.changeCharacter(s, n, ' ');
		for (i = 0;i <= n;i++)
		{
			if (s.charAt(i) != ' ')
			{
				j++;
			}
			else if (s.charAt(i - 1) != ' ')
			{
				a[k] = j;
				j = 0;
				k++;
			}
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i < k;i++)
		{
			System.out.printf(",%d",a[i]);
		}
	}
}

