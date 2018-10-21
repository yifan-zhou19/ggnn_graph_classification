package <missing>;

public class GlobalMembers
{
	public static int[][] result = new int[100][100];
	public static void match(String str, int len, int len1, char boy, char girl)
	{
	   int i;
	   int j;
	   if (len1 == 0)
	   {
		   return;
	   }
	   else
	   {
		   for (i = 0;i < len;i++)
		   {
			   if (str[i].equals(boy))
			   {
				  for (j = i + 1; ;j++)
				  {
					if (str[j].equals(boy))
					{
						break;
					}
					else if (str[j].equals(girl))
					{
						result[i][j] = 1;
						str[i] = ' ';
						str[j] = ' ';
						len1 = len1 - 2;
						break;
					}
					else
					{
						continue;
					}
				  }
			   }
		   }
		 match(str, len, len1, boy, girl);
	   }
	}
	public static int Main()
	{
	   String str = new String(new char[100]);
	   char boy;
	   char girl;
	   int len;
	   int len1;
	   int i;
	   int j;
	   str = ConsoleInput.readToWhiteSpace(true).charAt(0);

	   len = str.length();
	   len1 = len;
	   boy = str.charAt(0);
	   girl = str.charAt(len - 1);
	   match(str, len, len1, boy, girl);
	   for (j = 0;j < len;j++)
	   {
		   for (i = 0;i < len;i++)
		   {
			   if (result[i][j] == 1)
			   {
				   System.out.print(i);
				   System.out.print(' ');
				   System.out.print(j);
				   System.out.print("\n");
			   }
		   }
	   }
	   return 0;
	}
}

