package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[1000000]);
		int i;
		int j;
		int n;
		int[] b = new int[300];
		char c;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0,j = 0;i < n;i++)
		{
			if (a.charAt(i) != ' ')
			{
				b[j]++;
			}
			if (a.charAt(i) == ' ' && b[j] != 0)
			{
				j++;
			}
		}
		for (i = 0;i <= j;i++)
		{
			System.out.printf("%d",b[i]);
			if (i != j)
			{
				System.out.print(",");
			}
		}
	}
}
