package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		int i;
		int j;
		int l;
		int k;
		int[] b = new int[100];
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (i = 0;i < l;i++)
		{
			b[i] = i;
		}
		for (k = 0;k < l;)
		{
		for (i = 0;i < l - k - 1;i++)
		{
			if (a.charAt(i) == a.charAt(0) && a.charAt(i + 1) == a.charAt(l - k - 1))
			{
				System.out.printf("%d %d\n",b[i],b[i + 1]);
				for (j = i;j < l;j++)
				{
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 2));
					b[j] = b[j + 2];
				}
				break;
			}
		}
			k = k + 2;
		}
	}
}

