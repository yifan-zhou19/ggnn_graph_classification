package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int Main_j = 0;
	public static void Main(String[] args)
	{
		String str = new String(new char[1000]);
		char[][] a = new char[50][100];
		char[][] b = new char[50][100];
		String min = new String(new char[100]);
		String max = new String(new char[100]);
		String temp = new String(new char[100]);
		String temp1 = new String(new char[100]);
		int n;
		int i;
		int m;
		int l;
		int flag;
		int num;
		str = new Scanner(System.in).nextLine();
		flag = 0;
		num = 0;
		for (i = 0;i < str.length();i++)
		{
			if (str.charAt(i) == ' ')
			{
				flag = 0;
			}
			else if (flag == 0)
			{
				flag = 1;
				num++;
			}
		}
		for (i = 0;i < num;i++)
		{
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//		static int j=0;
			for (m = 0;Main_j < str.length(),m < str.length();Main_j++,m++)
			{
				if (str.charAt(Main_j) == ' ')
				{
					m--;
					continue;
				}
				else
				{
					a[i][m] = str.charAt(Main_j);
					if (str.charAt(Main_j + 1) == ' ')
					{
						a[i][m + 1] = '\0';
						Main_j++;
						break;
					}
				}
			}
		}
		for (i = 0;i < num;i++)
		{
			b[i] = a[i];
		}
		for (i = 0;i < num;i++)
		{
			for (n = i + 1;n < num;n++)
			{
				if (String.valueOf(a[i]).length() > String.valueOf(a[n]).length())
				{
					temp = a[i];
					a[i] = a[n];
					a[n] = temp;
				}
			}
		}
		min = a[0];
		max = a[num - 1];
		for (i = 0;i < num;i++)
		{
			if (min.length() == String.valueOf(b[i]).length())
			{
				break;
			}
		}
		for (l = 0;l < num;l++)
		{
			if (max.length() == String.valueOf(b[l]).length())
			{
				break;
			}
		}
		System.out.println(b[l]);
		System.out.println(b[i]);
	}
}
