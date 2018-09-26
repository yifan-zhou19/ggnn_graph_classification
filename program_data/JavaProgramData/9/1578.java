public class BING
{
	   public String id = new String(new char[10]);
	   public int old;
}

package <missing>;

public class GlobalMembers
{
	public static BING[] bing = tangible.Arrays.initializeWithDefaultBINGInstances(100);
	public static BING temp = new BING();
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int p;
		int max;
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
							 bing[i].id = tempVar2.charAt(0);
						 }
						 String tempVar3 = ConsoleInput.scanfRead();
						 if (tempVar3 != null)
						 {
							 bing[i].old = Integer.parseInt(tempVar3);
						 }
		}
		for (p = 0;;p++)
		{
			max = -1;
					  for (i = 0;i < n;i++)
					  {
									   if (bing[i].old > max && bing[i].old >= 60)
									   {
										   max = bing[i].old;
										   k = i;
									   }
					  }
		if (max >= 60)
		{
			System.out.printf("%s\n",bing[k].id);
			bing[k].old = -1;
		}
		if (max < 60)
		{
			break;
		}
		}
		for (i = 0;i < n;i++)
		{
						if (bing[i].old < 60 && bing[i].old >= 0)
						{
							System.out.printf("%s\n",bing[i].id);
						}
		}
		return 0;
	}

}

