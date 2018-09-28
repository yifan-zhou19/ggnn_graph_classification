package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		char[][] a = new char[101][101];
		int i;
		int l;
		int j = 0;
		int k = 0;

		s = new Scanner(System.in).nextLine();

		l = s.length();

		for (i = 0;i < l;i++)
		{
			if (s.charAt(i) == ' ')
			{
				a[k][j] = 0;
				k++;
				j = 0;
			}
			else
			{
				a[k][j++] = s.charAt(i);
			}
		}


		a[k][j] = 0;


		for (i = 0;i < k;i++)
		{
		  if (String.valueOf(a[i]).length())
		  {
			System.out.printf("%s ",a[i]);
		  }
		}
		System.out.printf("%s",a[k]);
		return 0;
	}


}
