public class human
{
	   public String ch = new String(new char[7]);
	   public float tall;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int m;
		  int s;
		  int i;
		  int j;
		  int q = 0;
		  int x = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  human[] hu = tangible.Arrays.initializeWithDefaulthumanInstances(n);
		  human[] Hn = tangible.Arrays.initializeWithDefaulthumanInstances(n);
		  human[] Hu = tangible.Arrays.initializeWithDefaulthumanInstances(n);
		  for (i = 0;i < n;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  hu[i].ch = tempVar2.charAt(0);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  hu[i].tall = Float.parseFloat(tempVar3);
			  }
		  }
		   for (i = 0;i < n;i++)
		   {
			 if (strcmp(hu[i].ch,"male") == 0)
			 {
				  Hn[q] = hu[i];
			   q++;
			 }
			 else
			 {
				  Hu[x] = hu[i];
			   x++;
			 }
		   }
		   for (i = 0;i < q;i++)
		   {
			   m = i;
			 for (j = i + 1;j < q;j++)
			 {
				  if (Hn[j].tall < Hn[m].tall)
				  {
				m = j;
				  }
			 }
			   if (i == 0)
			   {
				  System.out.printf("%.2f",Hn[m].tall);
			   }
			   if (i != 0)
			   {
				  System.out.printf(" %.2f",Hn[m].tall);
			   }
			 Hn[m].tall = Hn[i].tall;
		   }

			for (i = 0;i < x;i++)
			{
				 s = i;
			   for (j = i + 1;j < x;j++)
			   {
					if (Hu[j].tall > Hu[s].tall)
					{
				 s = j;
					}
			   }
			 System.out.printf(" %.2f",Hu[s].tall);
			 Hu[s].tall = Hu[i].tall;
			}

	}




}

