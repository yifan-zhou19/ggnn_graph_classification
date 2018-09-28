package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[2000]);
		char[][] s = new char[200][200];
		str = new Scanner(System.in).nextLine();
		int len = str.length();
		int i = 0;
		int k = 0;
		int[] a = new int[200];
		int max = 0;
		int min = 2000;
		int min1;
		int max1;
		int j;
		int l = 0;
		while (i < len)
		{
			if (str.charAt(i) != ' ')
			{
				for (j = i;j < len && str.charAt(j) != ' ';j++)
				{
					s[k][l] = str.charAt(j);
					l++;
				}
				s[k][l] = '\0';
				i = j + 1;
				k++;
				l = 0;
			}
			else
			{
				i++;
			}
		}
		for (i = 0;i < k;i++)
		{
			a[i] = String.valueOf(s[i]).length();
			if (a[i] > max)
			{
				max = a[i];
				max1 = i;
			}
			if (a[i] < min)
			{
				min = a[i];
				min1 = i;
			}
		}
		System.out.printf("%s\n%s",s[max1],s[min1]);


		return 0;
	}
}
