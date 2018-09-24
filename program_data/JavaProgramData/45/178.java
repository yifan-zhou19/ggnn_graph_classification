package <missing>;

public class GlobalMembers
{
	//itc online test nov 13 prob 8
	public static int Main()
	{
		   String s = new String(new char[50]);
		   String targets = new String(new char[50]);
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   s = tempVar.charAt(0);
		   }
		   String tempVar2 = ConsoleInput.scanfRead(" ");
		   if (tempVar2 != null)
		   {
			   targets = tempVar2.charAt(0);
		   }
		   int slen = s.length();
		   int targetslen = targets.length();
		   int i;
		   int j;
		   int done = 0;
		   for (i = 0;i <= targetslen - slen;i++)
		   {
			   if (done == 0)
			   {
								int check = 1;
								for (j = i;j <= i + slen - 1;j++)
								{
									if (targets.charAt(j) != s.charAt(j - i) && check == 1)
									{
															check = 0;
									}
								}
								if (check == 1)
								{
												System.out.printf("%d",i);
												done = 1;
								}
			   }
		   }
	}

}

