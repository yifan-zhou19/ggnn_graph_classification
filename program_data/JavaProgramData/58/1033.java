package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String num = new String(new char[10]);
		char[][] str = new char[1000][80];
		int n;
		int i;
		int j;
		int length;
		int m = 0;
		num = new Scanner(System.in).nextLine();
		n = Integer.parseInt(num);
		for (i = 0;i < n;i++)
		{
			str[i] = new Scanner(System.in).nextLine();
			length = String.valueOf(str[i]).length();
			if ((str[i][0] <= 'z' && str[i][0] >= 'a') || (str[i][0] <= 'Z' && str[i][0] >= 'A' || str[i][0] == '_'))
			{
			   m = 1;
			   for (j = 0;j < length;j++)
			   {
				   if ((str[i][j] <= 'z' && str[i][j] >= 'a') || (str[i][j] <= 'Z' && str[i][j] >= 'A' || str[i][j] == '_') || (str[i][j] >= '0' && str[i][j] <= '9'))
				   {
					  m = 1;
				   }
				   else
				   {
					   m = 0;
				   }
				   if (m == 0)
				   {
					break;
				   }
			   }
			}
			else
			{
				m = 0;
			}
			System.out.printf("%d\n",m);
		}
		 return 0;

	}
}
