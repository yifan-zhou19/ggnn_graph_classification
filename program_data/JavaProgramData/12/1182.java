package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] num = new int[20];
	   int i;
	   int j;
	   int n;
	   int c;
	   int t;
	   do
	   {
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 c = Integer.parseInt(tempVar);
		 }
		 num[0] = c;
		 n = 1;
		 while (c != 0)
		 {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   c = Integer.parseInt(tempVar2);
		   }
		   if (c == -1)
		   {
			   return 0;
		   }
		   num[n] = c;
		   n++;
		 }
		 t = 0;
		 for (i = n - 2;i >= 0;i--)
		 {
		  for (j = n - 2;j >= 0;j--)
		  {
		   if (num[i] == 2 * num[j])
		   {
			t++;
		   }
		  }
		 }
		 System.out.printf("%d\n",t);
	   }while (c != -1);
	   return 0;
	}
}

