package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[1000]);
		int[] b = new int[300];
		int f = 0;
		int i;
		int j;
		a = new Scanner(System.in).nextLine();
		for (i = 0,j = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) == ' ' && f == 0)
			{
				continue;
			}
			else if (a.charAt(i) == ' ')
			{
				b[j] = f;
				f = 0;
				j++;
				continue;
			}
			else
			{
				f++;
			}
		}
		b[j] = f;
		System.out.printf("%d",b[0]);
		for (i = 1;i <= j;i++)
		{
		System.out.printf(",%d",b[i]);
		}
	}

}
