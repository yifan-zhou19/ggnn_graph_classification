package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100000]);
		int i;
		int j = 0;
		int k = 0;
		int z;
		int[] b = new int[310];
		a = new Scanner(System.in).nextLine();
		z = a.length();
	for (i = 0;i < z;i++)
	{
		if (a.charAt(i) != ' ')
		{
			j++;
		}
		if (a.charAt(i) == ' ' || i == z - 1)
		{
			b[k] = j;
			k++;
			j = 0;
		}
	}
	for (i = 0;i < k - 1;i++)
	{
		if (b[i] != 0)
		{
	System.out.printf("%d,",b[i]);
		}
	}
	if (b[k - 1] != 0)
	{
	System.out.printf("%d",b[k - 1]);
	}
	}


}
