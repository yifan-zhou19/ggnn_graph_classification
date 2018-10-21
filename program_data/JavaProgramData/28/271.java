package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[5000]);
		int i;
		int j;
		int word = 0;
		int num = 0;
		int[] a = new int[300];
		c = new Scanner(System.in).nextLine();
		for (i = 0,j = 0;i <= c.length();i++)
		{
			if (c.charAt(i) == ' ' || c.charAt(i) == 0)
			{
				if (word == 1)
				{
					word = 0;
					a[j++] = num;
					num = 0;
				}
			}
			else
			{
				if (word == 0)
				{
					word = 1;
					num++;
				}
				else
				{
					num++;
				}
			}
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i < j;i++)
		{
			System.out.printf(",%d",a[i]);
		}
	}
}
