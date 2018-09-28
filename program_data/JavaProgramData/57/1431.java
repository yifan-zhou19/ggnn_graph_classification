package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int t;
	   int n;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (t = 1;t <= n;t++)
	   {
										   char[][] zifu = new char[400][400];
										   String tempVar2 = ConsoleInput.scanfRead();
										   if (tempVar2 != null)
										   {
											   zifu[t] = tempVar2.charAt(0);
										   }
										   char[][] das = new char[400][400];
										   int j = String.valueOf(zifu[t]).length();
	   if ((zifu[t][j - 2] == 'e' && zifu[t][j - 1] == 'r') || (zifu[t][j - 2] == 'l' && zifu[t][j - 1] == 'y'))
	   {
										   for (i = 0;i < j - 2;i++)
										   {
															  das[t][i] = zifu[t][i];
										   }
										   System.out.println(das[t]);
	   }
										   else if (zifu[t][j - 3] == 'i' && zifu[t][j - 2] == 'n' && zifu[t][j - 1] == 'g')
										   {
																									for (i = 0;i < j - 3;i++)
																									{
																													   das[t][i] = zifu[t][i];
																									}
																									System.out.println(das[t]);
										   }
										   else
										   {
											   System.out.printf("%s\n",zifu[t]);
										   }

	   }

	   return 0;
	}
}

