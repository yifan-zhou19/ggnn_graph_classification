package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int i;
		 int c;
		 int f;
		 int g = 0;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 int[] a = new int[n];
		 for (i = 0;i < n;i++)
		 {
		 a[i] = i;
		 }
		 while (10 != 0)
		 {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   c = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   f = Integer.parseInt(tempVar3);
		   }
		   if (c == 0 && f == 0)
		   {
		   break;
		   }
		   else
		   {
		   a[c] = -1;
		   }
		 }
		   for (i = 0;i < n;i++)
		   {
			   if (a[i] != -1)
			   {
				System.out.printf("%d\n",a[i]);
			   g++;
			   }
		   }
		   if (g == 0)
		   {
		   System.out.print("NOT FOUND");
		   }
		   System.in.read();
		   System.in.read();
	}

}

