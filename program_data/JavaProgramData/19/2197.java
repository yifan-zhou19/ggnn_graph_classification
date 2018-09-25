package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		char[][] a = new char[100][100];
		String b = new String(new char[100]);
		String c = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ps;
		int i;
		int k;
		int flag = 0;
		int j;
		str = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		i = 0;
		j = 0;
		for (ps = str; * ps != '\0';ps++)
		{
			if (*ps != ' ')
			{
				a[i][j] = ps;
				j++;
			}
			else if (*ps == ' ')
			{
				a[i][j] = '\0';
				j = 0;
				i++;
			}
		}
		a[i][j] = '\0';
		k = i;
		for (i = 0;i <= k;i++)
		{
			if (strcmp(a[i],c) == 0)
			{
				a[i] = b;
				flag = 1;
			}
		}
		if (flag == 1)
		{
			for (i = 0;i < k;i++)
			{
				System.out.printf("%s ",a[i]);
			}
			System.out.printf("%s",a[k]);
		}
		else if (flag == 0)
		{
			System.out.printf("%s",str);
		}
		return 0;
	}




}
