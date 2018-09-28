package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String word = new String(new char[10000]);
		char[][] str = new char[300][100];
		int i;
		int j;
		int k;
		int l;
		int[] num = new int[300];
		int m;
		j = k = m = 0;
		word = new Scanner(System.in).nextLine();
	l = word.length();
	for (i = 0;i < l;i++)
	{
	if (word.charAt(i) == ' ' && m != 0)
	{
			str[k][j] = '\0';
		k++;
		j = 0;
	m = 0;
	continue;
	}
	else if (word.charAt(i) == ' ' && m == 0)
	{
		continue;
	}
	else if (word.charAt(i) != ' ')
	{
		str[k][j] = word.charAt(i);
	j++;
	m = 1;
	}
	}
	for (i = 0;i <= k;i++)
	{
	num[i] = String.valueOf(str[i]).length();
	}
	j = 0;
	for (i = 0;i <= k;i++)
	{
		if (j == 0)
		{
			System.out.printf("%d",num[i]);
			j = 1;
		}
	else
	{
		System.out.printf(",%d",num[i]);
	}
	}
	}

}
