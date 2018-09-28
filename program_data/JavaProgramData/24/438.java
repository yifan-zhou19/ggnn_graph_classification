package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int p;
		String s = new String(new char[1000]);
		char[][] b = new char[1000][50];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * m;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * r;
		s = new Scanner(System.in).nextLine();
		for (m = s,j = 0; * m != '\0';)
		{
			for (r = m, i = 0; * r != ' ' && *r != '\0';r++, i++)
			{
				*(*(b + j) + i) = *r;
			}
			*(*(b + j) + i) = '\0';
			j++;
			m = r;
			if (*m == ' ')
			{
				m++;
			}
		}
		for (i = 0;i < j;i++)
		{
			for (k = 0,p = 0;k < j;k++)
			{
				if (String.valueOf(*(b + i)).length() >= String.valueOf(*(b + k)).length())
				{
					p++;
				}
			}
			if (p == j)
			{
				System.out.printf("%s\n",*(b + i));
				break;
			}
		}
		for (i = 0;i < j;i++)
		{
			for (k = 0,p = 0;k < j;k++)
			{
				if (String.valueOf(*(b + i)).length() <= String.valueOf(*(b + k)).length())
				{
					p++;
				}
			}
			if (p == j)
			{
				System.out.printf("%s\n",*(b + i));
				break;
			}
		}
	}







}
