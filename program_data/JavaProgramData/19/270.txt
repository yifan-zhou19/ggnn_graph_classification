package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[100]);
		String str1 = new String(new char[20]);
		String str2 = new String(new char[20]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		char[][] str3 = new char[40][20];
		final String STR = "";
		int i;
		int k;
		int m;
		int x;
		str = new Scanner(System.in).nextLine();
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		k = 0;
		m = 0;
		for (p = str; * p != '\0';p++)
		{
			str3[k][m] = p;
			m++;
			if (Character.isLetter(*p) * Character.isLetter(*(p + 1)) == 0)
			{
				str3[k][m] = '\0';
				k++;
				m = 0;
			}
		}
		str3[k][m] = '\0';
		x = k;
		for (i = 0;i <= k;i++)
		{
			if (strcmp(str3[i],str1) == 0)
			{
				str3[i] = str2;
			}
		}
		for (i = 0;i <= k;i++)
		{
			STR += str3[i];
		}
		System.out.printf("%s",STR);
	}



}
