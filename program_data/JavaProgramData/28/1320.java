package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[20000]);
		char c;
		int a;
		int n = 0;
		int i;
		int j = 0;
		int[] m = new int[100];
		str = new Scanner(System.in).nextLine();
		a = str.length();
		for (i = 0;i < a;i++)
		{
			if ((c = str.charAt(i)) != ' ')
			{
				if ((c = str.charAt(i + 1)) != ' ' && i < (a - 1))
				{
					n++;
				}
				else
				{
					n++;
					m[j] = n;
					j++;
				}
			}
			else
			{
				n = 0;
			}
		}
		for (i = 0;i < (j - 1);i++)
		{
			System.out.printf("%d,",m[i]);
		}
		System.out.printf("%d\n",m[j - 1]);
	}
}
