package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[100]);
	public static int i;
	public static int k;
	public static int l;
	public static int j;
	public static int p;
	public static int q;
	public static int nan;
	public static int nv;
	public static int[] nan1 = new int[100];
	public static int[] nv1 = new int[100];
	public static int[] nan2 = new int[100];
	public static void pai()
	{
		i = 0;
		j = 0;
		p = 0;
		for (i = 0; str.charAt(i) != '\0'; i++)
		{
		if (str.charAt(i) == str.charAt(0))
		{
			nan2[j] = 1;
			j++;
		}
		if (str.charAt(i) == str.charAt(k))
		{
			for (q = j; q >= 0 ; q--)
			{
				if (nan2[q] != 0)
				{
					break;
				}
			}
			System.out.print(nan1[q]);
			System.out.print(' ');
			System.out.print(nv1[p]);
			System.out.print("\n");
			p++;
			nan2[q] = 0;
		}
		}
	}
	public static int Main()
	{
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 1; ; i++)
		{
			if (str.charAt(i) != str.charAt(0))
			{
				k = i;
				break;
			}
		}
		for (i = 0; str.charAt(i) != '\0'; i++)
		{
			l++;
		}
		j = 0;
		p = 0;
		for (i = 0; i < l; i++)
		{
			if (str.charAt(i) == str.charAt(0))
			{
				nan++;
				nan1[j++] = i;
			}
			if (str.charAt(i) == str.charAt(k))
			{
				nv++;
				nv1[p++] = i;
			}
		}
		pai();
		return 0;
	}
}

