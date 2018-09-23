public class book
{
	public int num;
	public String peo = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static book[] book = tangible.Arrays.initializeWithDefaultbookInstances(999);

	public static int Main()
	{
		char zm;
		char max;
		int n;
		int i;
		int k;
		int num;
		int cishu = -1;
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
						book[i].num = Integer.parseInt(tempVar2);
					}
					String tempVar3 = ConsoleInput.scanfRead(" ");
					if (tempVar3 != null)
					{
						book[i].peo = tempVar3.charAt(0);
					}
		}
	   for (zm = 'A';zm <= 'Z';zm++)
	   {
			   num = 0;
				  for (i = 0;i < n;i++)
				  {
				 for (k = 0;k < 26;k++)
				 {
				 if (book[i].peo.charAt(k) == zm)
				 {
				 num++;
				 }
				 }
				  }
				 if (num > cishu)
				 {
				 cishu = num;
				 max = zm;
				 }
	   }
		System.out.printf("%c\n",max);
		System.out.printf("%d\n",cishu);
			 for (i = 0;i < n;i++)
			 {
				for (k = 0;k < 26;k++)
				{
					   if (book[i].peo.charAt(k) == max)
					   {
					  System.out.printf("%d\n",book[i].num);
					   }
				}
			 }
		return 0;
	}
}

