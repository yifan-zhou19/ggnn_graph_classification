package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char[][] c = new char[100][50];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1 = s;
		String p3 = b;
		int i = 0;
		int j = 0;
		int n;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (; * p1 != '\0';p1++)
		{
			if (*p1 != ' ')
			{
				c[i][j] = p1; //?????????????????
				j++;
			}
			else
			{
				c[i][j] = '\0';
				i++;
				j = 0; //?????0?????c[i][0].
			}

		}
		c[i][j] = '\0'; //??????????????'\0'???????????? ?????c[i]?
		n = i;
		for (i = 0;i <= n;i++)
		{
			if (strcmp(c[i],a) == 0)
			{
				for (j = 0; p3 != '\0';p3++,j++)
				{
				c[i][j] = p3;
				}
				c[i][j] = '\0';
			}
			p3 = b; //????c[i]?a.
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s ",c[i]);
		}
			System.out.printf("%s",c[i]); //????????? ?????????
	}

}
