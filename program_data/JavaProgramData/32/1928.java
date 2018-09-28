package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

		   int n;
		   int k;
		   int c;
		   char[][] string = new char[500][300];
			 int i;
			 int d1;
			 int d2;
			 int d;
			  char[][] str = new char[2][300];
				  String t = new String(new char[10]);
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   n = Integer.parseInt(tempVar);
		   }

	 for (k = 0;k < n;k++)
	 {


					 t = new Scanner(System.in).nextLine(); //??????????gets(t)???????????????
				   for (i = 0;i < 2;i++)
				   {
						   str[i] = new Scanner(System.in).nextLine();

				   }

					d1 = String.valueOf(str[0]).length();
					d2 = String.valueOf(str[1]).length();

					d = d1 - d2;
					for (i = 0;i < d2;i++) //???????d2???d1
					{
		   str[1][d1 - 1 - i] = str[1][d2 - 1 - i];
					}


			for (i = 0;i < d;i++)
			{
					str[1][i] = '0';
			}
			str[1][d1] = '\0';


			c = 0;
			for (i = d1 - 1;i >= 0;i--)
			{ //??????????????????????????????
				int k1 = (int)(str[0][i] - '0'); //?????????????????
				int k2 = (int)(str[1][i] - '0');
				if ((k1 - c) < (k2))
				{
					String[k][i] = (char)((k1 + 10 - c - k2) + 48);
					c = 1;
				}
				else
				{
					String[k][i] = (char)((k1 - c - k2) + 48);
					c = 0;
				}
			}
			  String[k][d1] = '\0';


	 }

	   for (k = 0;k < n;k++)
	   {

		System.out.printf("%s\n",string[k]);
	   }
	}
}

