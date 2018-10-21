package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[100]);
	char[][] a = new char[100][30];
	int l;
	int i;
	int j = 0;
	int k = 0;
	s = new Scanner(System.in).nextLine();
	l = s.length();
	for (i = 0;i < l;i++)
	{
		if (s.charAt(i) != ' ')
		{
			a[j][k] = s.charAt(i);
			k++;
		}
		if (s.charAt(i) == ' ')
		{
			j++;
			k = 0;
		}
	}
	System.out.printf("%s",a[j]);
	for (i = j - 1;i >= 0;i--)
	{
	System.out.printf(" %s",a[i]);
	}
	}
}
