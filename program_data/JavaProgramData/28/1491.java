package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10000]);
		int[] sz = new int[10000];
		int i;
		int j;
		int k;
		a = new Scanner(System.in).nextLine();
		j = 0;
		k = 0;
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			j++;
			if (a.charAt(i) == ' ' && a.charAt(i - 1) == ' ')
			{
				j--;
				continue;
			}
			if (a.charAt(i) == ' ' && j > 1)
			{
				sz[k] = j - 1;
				j = 0;
				k++;
			}
			if (a.charAt(i + 1) == '\0')
			{
				sz[k] = j;
			}
		}
		System.out.printf("%d",sz[0]);
		for (i = 1;i <= k;i++)
		{
			System.out.printf(",%d",sz[i]);
		}




	return 0;


	}


}
