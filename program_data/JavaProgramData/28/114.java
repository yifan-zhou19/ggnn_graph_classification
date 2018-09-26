package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[3000]);
		int i;
		int l;
		int[] x = new int[300];
		int xn = 0;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (i = 0;i < l;i++)
		{
			if (a.charAt(i) == ' ')
			{
				xn++;
			}
			else
			{
				x[xn]++;
			}
		}
		System.out.printf("%d",x[0]);
		for (i = 1;i <= xn;i++)
		{
			if (x[i] != 0)
			{
				System.out.printf(",%d",x[i]);
			}
		}
	}

}
