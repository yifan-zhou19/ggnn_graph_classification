package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		int k;
		int l;
		int[] b = new int[20];
		String a = new String(new char[101]);
		cin.get(a,101,'\n');
		for (i = 0;i < 101;i++)
		{
			if (a.charAt(i) == 32)
			{
				b[j] = i;
				j++;
			}
			if (a.charAt(i) == '\0')
			{
				break;
			}
		}
		l = i;
		k = j;
		if (k != 0)
		{
			for (i = b[k - 1] + 1;i < l;i++)
			{
				System.out.print(a.charAt(i));
			}
			for (j = k - 2;j >= 0;j--)
			{
				System.out.print(" ");
				for (i = b[j] + 1;i < b[j + 1];i++)
				{
					System.out.print(a.charAt(i));
				}
			}
			System.out.print(" ");
			for (i = 0;i < b[0];i++)
			{
				System.out.print(a.charAt(i));
			}
		}
		if (k == 0)
		{
			System.out.print(a);
		}
		return 0;
	}
}
