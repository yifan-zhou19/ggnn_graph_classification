package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[1000]);
		int[] a = new int[300];
		int i;
		int j;
		int t;
		int k;
		c = new Scanner(System.in).nextLine();
		j = 0;
		for (i = 0;c.charAt(i) != '\0';i++)
		{
			if (c.charAt(i) == ' ' && t == 0)
			{
				j = j + 1,t = 1;
			}
			else if (c.charAt(i) != ' ')
			{
				a[j] = a[j] + 1,t = 0;
			}
		}
		if (j == 0)
		{
			System.out.printf("%d",a[0]);
		}
		else if (j > 0)
		{
		   System.out.printf("%d",a[0]);
		   for (k = 1;k <= j;k++)
		   {
			  System.out.printf(",%d",a[k]);
		   }
		}
	}

}
