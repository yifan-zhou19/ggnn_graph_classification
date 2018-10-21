package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int h;
	   int l;
	   int i;
	   int k;
	   int g;
	   int[][] s = new int[100][100];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   h = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   l = Integer.parseInt(tempVar2);
	   }
	   for (i = 0;i < h;i++)
	   {
		  for (k = 0;k < l;k++)
		  {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  s[i][k] = Integer.parseInt(tempVar3);
			  }
		  }
	   }
	   for (g = 0;g <= (h + l - 2);g++)
	   {
			  i = 0;
			  while (i < h)
			  {
				if (g - i >= l)
				{
						  i++;
				}
				else
				{
					  break;
				}
			  }

				while (i < h && (g - i>-1) && (g - i < l))
				{
					  System.out.printf("%d\n",s[i][g - i]);

					  i++;
				}
	   }
		return 0;
	}

}

