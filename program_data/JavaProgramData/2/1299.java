public class author
 {
	 public int num;
   public String name = new String(new char[26]);

 }

package <missing>;

public class GlobalMembers
{
	 public static author[] ren = tangible.Arrays.initializeWithDefaultauthorInstances(100);

	 public static int Main()
	 {
		 int n;
		 int i;
		 int j = 0;
		 int k = 0;
		 int biao;
		 int maxzuozhe;
		 int p;
		 int[] geshu = new int[26];
		 int max = 0;
		 int[] maxdeshu = new int[999];

	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i <= n - 1;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   ren[i].num = Integer.parseInt(tempVar2);
		   }
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			ren[i].name = tempVar3.charAt(0);
		}
	   }

	   for (i = 0;i <= 25;i++)
	   {
		   for (j = 0;j <= n - 1;j++)
		   {
				for (k = 0;k <= String.valueOf(ren[j].name).length();k++)
				{
					if ((i + 'A') == ren[j].name.charAt(k))
					{
				  geshu[i] = geshu[i] + 1;
					}
				}
		   }
	   }
		   for (i = 'A' - 65;i <= 'Z' - 65;i++)
		   {
		   if (max < geshu[i])
		   {
			 max = geshu[i];
		  biao = i;
		   }
		   }
		maxzuozhe = 'A' + biao;
		p = 0;
		for (i = 0;i <= n - 1;i++)
		{
			for (k = 0;k <= String.valueOf(ren[i].name).length();k++)
			{
			  if (maxzuozhe == ren[i].name.charAt(k))
			  {
				maxdeshu[p] = ren[i].num;
			 p++;
			 break;
			  }
			}
		}
		System.out.printf("%c\n",maxzuozhe);
		System.out.printf("%d\n",p);
		for (i = 0;i <= p - 1;i++)
		{
		System.out.printf("%d\n",maxdeshu[i]);
		}

		System.in.read();

	 }
}

