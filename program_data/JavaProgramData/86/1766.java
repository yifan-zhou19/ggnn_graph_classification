package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int j;
	   int m;
	   int h;
	   int k;
	   int[] s = new int[30];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   h = Integer.parseInt(tempVar);
	   }
	 for (k = 0;k < h;k++)
	 {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   n = Integer.parseInt(tempVar2);
	   }
	   if (n != 0)
	   {
	   for (i = 0;i < n;i++)
	   {
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			s[i] = Integer.parseInt(tempVar3);
		}
	   }
	   if (s[n - 1] + (n - 1) * 3 < 60 && s[n - 1] + n * 3 <= 60)
	   {
		m = 60 - n * 3;
	   }
		else
		{
		   for (j = 0;j < n;j++)
		   {
			   if (s[j] + j * 3 <= 60 && s[j] + (j + 1) * 3 >= 60)
			   {
					 m = s[j];
					 break;
			   }
			   else if (s[j] + j * 3 > 60)
			   {
				   m = 60 - j * 3;
				   break;
			   }
		   }
		}
		System.out.printf("%d\n",m);
	   }
	   else
	   {
		   System.out.print("60\n");
	   }
	 }
		return 0;
	}

}

