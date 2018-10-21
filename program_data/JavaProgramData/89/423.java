package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100000];
		int[] b = new int[100000];
		int i = 0;
		int l = 0;
		int n;
		int j;
		int s;
		int[] c = new int[100000];
		int[] d = new int[100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (;;)
		{
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a[i] = Integer.parseInt(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  b[i] = Integer.parseInt(tempVar3);
			  }
			  if (a[i] == 0 && b[i] == 0)
			  {
			   break;
			  }
			   l++; //l?++???break????break??l??????0?????????
			   i++; //??????i++??i????
		}
		for (j = 0;j < n;j++)
		{
		   c[j] = j;
		   d[j] = 0;
		   for (i = 0;i < l;i++)
		   {
			   if (a[i] == c[j])
			   {
				c[j] = -1;
			   }
			   if (b[i] == c[j])
			   {
				d[j]++;
			   }
		   }
		}
		 s = 0;
		 for (j = 0;j < n;j++)
		 {
			 if (d[j] == (n - 1) && c[j] != -1) //??d[j]??n-1??????????????????????????
			 {
			   System.out.printf("%d\n",j);
			   s++;
			 }
		 }
		 if (s == 0)
		 {
		 System.out.print("NOT FOUND\n");
		 }
		 System.in.read();
		 System.in.read();
	}


}

