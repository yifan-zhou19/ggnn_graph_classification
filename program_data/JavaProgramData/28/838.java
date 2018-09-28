package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String w = new String(new char[10000]);
		int[] s = new int[10000];
		int b = 0;
		int k = 0;
		int i;
		int n = 0;
		w = new Scanner(System.in).nextLine();
		n = w.length();
		for (i = 0;w.charAt(i) != '\0';i++)
		{
			if (w.charAt(i) != ' ')
			{
				s[k]++;
			}
			if ((w.charAt(i) == ' ') && (w.charAt(i + 1) != ' '))
			{
				k++;
				b++;
			}
		}
		System.out.printf("%d",s[0]);
		for (k = 1;k <= b;k++)
		{
			System.out.printf(",%d",s[k]);
		}
		return 0;
	}
}
