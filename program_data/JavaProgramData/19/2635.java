package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		char[][] s1 = new char[101][101];
		int i;
		int j;
		int k;
		k = 0;
		j = 0;
		i = 0;
		int tag = 0;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		while (s.charAt(i) != '\0')
		{
			s1[j][k] = s.charAt(i);
			k++;
			if (s.charAt(i) == ' ')
			{
			   s1[j][k - 1] = '\0';
			   j++;
			   k = 0;
			}
			i++;
		}
		s1[j][k] = '\0';
		for (i = 0;i <= j;i++)
		{
			if (strcmp(s1[i],a) == 0)
			{
				s1[i] = b;
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%s ",s1[i]);
		}
		System.out.printf("%s",s1[i]);
		return 0;
	}
}
