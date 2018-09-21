package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[10000]);
	public static int Main()
	{
		s = new Scanner(System.in).nextLine();
		int[] l = new int[200];
		int[] r = new int[200];
		int i = 0;
		int j = 0;
		while (s.charAt(i) != '\0')
		{
			if (s.charAt(i) != ' ')
			{
				l[j]++;
			}
			else
			{
				r[j] = i;
				j++;
			}
			i++;
		}
		r[j] = i;
		int t1 = l[0];
		int t2 = l[0];
		int a1 = r[0];
		int a2 = r[0];
		int b1 = 0;
		int b2 = 0;
		for (i = 0;l[i] != 0;i++)
		{
			if (t1 < l[i])
			{
				t1 = l[i];
				a1 = r[i];
				b1 = i;
			}
			if (t2 > l[i])
			{
				t2 = l[i];
				a2 = r[i];
				b2 = i;
			}
		}
		for (i = a1 - l[b1];i < r[b1];i++)
		{
			System.out.printf("%c",s.charAt(i));
		}
		System.out.print("\n");
		for (i = a2 - l[b2];i < r[b2];i++)
		{
			System.out.printf("%c",s.charAt(i));
		}
		return 0;
	}



}
