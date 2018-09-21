package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[1000]);
		char[][] a = new char[200][20];
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		int h;
		int i;
		int j;
		int k = 0;
		int l;
		int m;
		int n;
		int lda = 0;
		int lxiao = 50;
		int ld;
		int lx;
		str = new Scanner(System.in).nextLine();
		l = str.length();
		for (i = 0;i < l;i++)
		{
			if (str.charAt(i) == ',' || str.charAt(i) == ' ')
			{
				str = tangible.StringFunctions.changeCharacter(str, i, '\0');
			}
		}
		for (i = 0;i <= l;i++)
		{
			if (str.charAt(i) == '\0')
			{
				i++;
			}
			for (j = i;;j++)
			{
				a[k][j - i] = str.charAt(j);
				if (str.charAt(j) == '\0')
				{
					break;
				}
			}
			k++;
			i = j;
		}
		for (i = 0;i < k;i++)
		{
			if (String.valueOf(a[i]).length() > lda)
			{
				ld = i;
				lda = String.valueOf(a[i]).length();
			}
			if (String.valueOf(a[i]).length() < lxiao)
			{
				lx = i;
				lxiao = String.valueOf(a[i]).length();
			}
		}
		System.out.println(a[ld]);
		System.out.println(a[lx]);
	}
}

