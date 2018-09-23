package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[100]);
	public static String a = new String(new char[100]);
	public static String b = new String(new char[100]);
	public static char[][] ns = new char[100][100];
	public static String result = new String(new char[100]);
	public static int[] number = new int[50];
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int k = 0;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;i < s.length();i++)
		{
			if (s.charAt(i) != ' ')
			{
				ns[j][k++] = s.charAt(i);
			}
			else
			{
				j++;
				k = 0;
			}
		}
		for (i = 0;i <= j;i++)
		{
			if (!strcmp(ns[i],a))
			{
				ns[i] = b;
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%s ",ns[i]);
		}
		System.out.printf("%s",ns[j]);
		return 0;
	}



}
