package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[4500]);
	public static int Main()
	{
		char[][] a = new char[300][15];
		int i;
		int[] b = new int[300];
		int j;
		int z;
		str = new Scanner(System.in).nextLine();
		j = 0;
		z = 0;
		for (i = 0;str.charAt(i) != '\0';i++)
		{
			if (str.charAt(i) != ' ')
			{
				a[j][z] = str.charAt(i);
				z++;
			}
			if (str.charAt(i) == ' ')
			{
				a[j][z] = '\0';
				j++;
				z = 0;
			}
		}
		a[j][z] = '\0';
		b[0] = String.valueOf(a[0]).length();
		System.out.printf("%d",b[0]);
		for (i = 1;i <= j;i++)
		{
			b[i] = String.valueOf(a[i]).length();
			if (b[i] != 0)
			{
			   System.out.printf(",%d",b[i]);
			}
		}
		return 0;
	}

}
