package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		char[][] a = new char[100][101];
		char[][] b = new char[100][101];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * k;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * l;
		for (i = 0;i < 100;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
			if (*(*(a + i)) == '\0')
			{
				break;
			}
			for (j = 0; * (*(a + i) + j) != '\0';j++)
			{
				if ((*(*(a + i) + j) >= 'a' && *(*(a + i) + j) <= 'z') || (*(*(a + i) + j) >= 'A' && *(*(a + i) + j) <= 'Z'))
				{
					b[i][j] = ' ';
				}
				else if (*(*(a + i) + j) == '(')
				{
					b[i][j] = '$';
				}
				else if (*(*(a + i) + j) == ')')
				{
					b[i][j] = '?';
				}
			}
			b[i][j] = '\0';
			for (k = b[i]; * k != '\0';k++)
			{
				if (*k == '?')
				{
					for (l = k - 1;l >= b[i];l--)
					{
						if (*l == '$')
						{
							*l = ' ';
							*k = ' ';
							break;
						}
					}
				}
			}
		}
		n = i;
		for (i = 0;i < n;i++)
		{
			System.out.println(a[i]);
			System.out.println(b[i]);
		}
		return 0;
	}
}
