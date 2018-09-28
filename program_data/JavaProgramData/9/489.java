package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   char[][] id = new char[100][10];
	   int n;
	   int[] age = new int[100];
	   int i;
	   int k = 0;
	   int m;
	   int len;
	   int p;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < n;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   (id[i]) = tempVar2.charAt(0);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   (age[i]) = Integer.parseInt(tempVar3);
		   }
	   }
	   char[][] e = new char[100][10];
	   String kong = new String(new char[10]);
	   int[] xin = new int[100];
	   for (i = 0;i < n;i++)
	   {
		   if (age[i] > 59)
		   {
			   xin[k] = age[i];
			   e[k] = id[i];
			   k++;
		   }
	   }
	   len = k;
	   for (m = 1;m <= len;m++)
	   {
		   for (k = 0;k < len - m;k++)
		   {
				if (xin[k] < xin[k + 1])
				{
					  p = xin[k];
					  kong = e[k];
					  xin[k] = xin[k + 1];
					  e[k] = e[k + 1];
					  xin[k + 1] = p;
					  e[k + 1] = kong;
				}
		   }
	   }
		for (k = 0;k < len;k++)
		{
			 System.out.printf("%s\n",e[k]);
		}
		for (i = 0;i < n;i++)
		{
		   if (age[i] < 60)
		   {
			  System.out.printf("%s\n",id[i]);
		   }
		}
	return 0;
	}
}

