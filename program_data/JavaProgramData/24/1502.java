package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[999]);
		String[] word = {"\0"};
		int[] a = new int[200];
		int i = 0;
		int j = 0;
		int k;
		int x;
		int MAX = 0;
		int MIN = 0;
		str = new Scanner(System.in).nextLine();
		for (k = 0;str.charAt(k) != '\0';k++)
		{
			if (str.charAt(k) == ' ' || str.charAt(k) == ',')
			{
				i = i + 1;
				j = 0;
			}
			else
			{
				word[i][j] = str.charAt(k);
				j++;
			}
		}
		x = i;
		for (i = 0;i < x + 1;i++)
		{
			for (j = 0;word[i][j] != '\0';j++)
			{
				a[i] = a[i] + 1;
			}
		}
		for (i = 0;i < x;i++)
		{
			if (a[MAX] < a[i + 1])
			{
				MAX = i + 1;
			}
		}
		for (i = 0;a[i] == 0;i++)
		{
			MIN = i + 1;
		}
		for (i = 0;i < x;i++)
		{
			if (a[i + 1] != 0)
			{
				if (a[MIN] > a[i + 1])
				{
					MIN = i + 1;
				}
			}
		}
		System.out.println(word[MAX]);
		System.out.print("\n");
		System.out.println(word[MIN]);
		return 0;
	}
}
