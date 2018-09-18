public class book
{
	   public int num;
	   public String writer = new String(new char[28]);
}

package <missing>;

public class GlobalMembers
{
	public static book[] bo = tangible.Arrays.initializeWithDefaultbookInstances(1000);
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int a;
		int b;
		int max = 0;
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
			   bo[i].num = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   bo[i].writer = tempVar3.charAt(0);
		   }
		}
		for (i = 'Z';i >= 'A';i--)
		{
			a = 0;
			for (k = 0;k < n;k++)
			{
				for (j = 0;j < 27;j++)
				{
					if (bo[k].writer.charAt(j) == i)
					{
					   a++;
					}
				}
			}
			if (a > max)
			{
			   max = a;
			   b = i;
			}
		}
		 System.out.printf("%c\n%d\n",b,max);
		 for (j = 0;j < n;j++)
		 {
			 for (i = 0;i < 28;i++)
			 {
				 if (bo[j].writer.charAt(i) == b)
				 {
					System.out.printf("%d\n",bo[j].num);
				 }
			 }
		 }
		 return 0;
	}
}

