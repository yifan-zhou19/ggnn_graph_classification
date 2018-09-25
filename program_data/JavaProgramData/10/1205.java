package <missing>;

public class GlobalMembers
{
	public static int k;
	public static int[] a = new int[26];
	public static int[] b = new int[26];
	public static int max = 0;

	public static void num(int site,int height)
	{
		int i;
		int amount = 0;
		int h;
		if (site == k)
		{
			for (i = 0;i < k;i++)
			{
				if (b[i] == 1)
				{
					amount++;
				}
			}
			if (max < amount)
			{
				max = amount;
			}

		}
		else
		{
			if (height < a[site])
			{
				num(site = site+1, height);
				site--;
			} //site++?????site??????????
			else
			{
				num(site = site+1, height);
				site--;
				b[site] = 1;
				h = height;
				height = a[site];
				num(site = site+1, height);
				site--;
				b[site] = 0;
				height = h;
			}

		}
	}

	public static void Main()
	{
	   int i;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   k = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < k;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[i] = Integer.parseInt(tempVar2);
		   }
	   }
	   num(0, 30000);
	System.out.printf("%d",max);

	}
}

