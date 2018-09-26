package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		   char[][] s = new char[100][10];
		   int n;
		   int[] z = new int[100];
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   n = Integer.parseInt(tempVar);
		   }
		   for (int i = 0;i < n;i++)
		   {
				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 s[i] = tempVar2.charAt(0);
				 }
				 String tempVar3 = ConsoleInput.scanfRead();
				 if (tempVar3 != null)
				 {
					 z[i] = Integer.parseInt(tempVar3);
				 }
		   }
		   for (int j = 120;j >= 60;j--)
		   {
				 for (int t = 0;t < n;t++)
				 {
						if (z[t] == j)
						{
							  System.out.printf("%s\n",s[t]);
							  z[t] = 0;
						}
				 }
		   }
			for (int m = 0;m < n;m++)
			{
				  if (z[m] != 0)
				  {
					  System.out.printf("%s\n",s[m]);
				  }
			}
			return 0;
	}
}

