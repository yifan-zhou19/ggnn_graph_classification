package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		char[][] dc = new char[50][32];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 0;a < n;a++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				dc[a] = tempVar2.charAt(0);
			}
		}
		for (b = 0;b < n;b++)
		{
			d = String.valueOf(dc[b]).length();
				   if (dc[b][d - 2] == 'e' && dc[b][d - 1] == 'r')
				   {
					   dc[b][d - 2] = '\0';
				   }
				   else
				   {
				   if (dc[b][d - 2] == 'l' && dc[b][d - 1] == 'y')
				   {
					   dc[b][d - 2] = '\0';
				   }
				   else
				   {
				   if (dc[b][d - 3] == 'i' && dc[b][d - 2] == 'n' && dc[b][d - 1] == 'g')
				   {
					   dc[b][d - 3] = '\0';
				   }
				   }
				   }
				   System.out.printf("%s\n",dc[b]);
		}
			   return 0;
	}


}

