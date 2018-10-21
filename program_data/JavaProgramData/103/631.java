package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char m;
		char temp = '*';
		int cnt = 0;
		int char_cnt = 1;
		int 1 = 1;
		while (1 != 0)
		{
				   String tempVar = ConsoleInput.scanfRead(null, 1);
				   if (tempVar != null)
				   {
					   m = tempVar.charAt(0);
				   }
				   ++cnt;
				   if (m >= 97 && m <= 122)
				   {
					   m = m - 32;
				   }
				   if (m == temp)
				   {
					   char_cnt++;
				   }
				   else if (temp == '*')
				   {
					   ;
				   }
				   else
				   {
									 System.out.printf("(%c,%d)",temp,char_cnt);
									 char_cnt = 1;
				   }
				   temp = m;
				   if (m == '\n')
				   {
					   break;
				   }
		}
		return 0;
	}
}

