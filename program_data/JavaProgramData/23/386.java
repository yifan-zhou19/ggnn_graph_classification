package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int[] b = new int[100];
		int i;
		int j = 0;
		int len = 0;
		while (cin.get(a.charAt(len)))
		{
			len++;
		}
		for (i = 0;i < len;i++)
		{
			if (a.charAt(i) == ' ' || i == len - 1)
			{
				b[j] = i;
				j++;
			}
		}
		for (;j >= 2;j--)
		{
			i = b[j - 2] + 1;
			for (i = b[j - 2] + 1;i < b[j - 1];i++)
			{
			   System.out.print(a.charAt(i));
			}
		System.out.print(' ');
		}
		i = 0;
		for (i = 0;i < b[0];i++)
		{
			System.out.print(a.charAt(i));
		}
		return 0;
	}
}
