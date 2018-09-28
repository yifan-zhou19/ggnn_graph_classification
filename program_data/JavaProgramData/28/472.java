package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[1000]);
		int[] b = new int[300];
		int i;
		int n;
		int j = 0;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) == ' ')
			{
				j = j + 1;
			}
			else
			{
				b[j] = b[j] + 1;
			}
		}
		System.out.printf("%d",b[0]);
		for (j = 1;j < 300;j++)
		{
			if (b[j] != 0)
			{
				System.out.printf(",%d",b[j]);
			}
		}
	}
}
