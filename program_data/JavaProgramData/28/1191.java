package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String strl = new String(new char[30000]);
		int[] a = new int[300];
		char c;
		int x;
		int y;
		int i;
		int j;
		int k;
		j = 0;
		strl = new Scanner(System.in).nextLine();
			for (i = 0;(c = strl.charAt(i)) != '\0';i++)
			{
				if (c != ' ')
				{
			   a[j] = a[j] + 1;
				}
				if (c == ' ')
				{
					j++;
				}
			}
			for (x = 0;x <= j - 1;x++)
			{
				if (a[x] != 0)
				{
				System.out.printf("%d,",a[x]);
				}
			}
				System.out.printf("%d",a[j]);
	}

}
