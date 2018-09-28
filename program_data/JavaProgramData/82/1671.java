package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int t = 0;
		int max = 0;
		int[] a = new int[Max];
		int[] b = new int[Max];
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
			  a[i] = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  b[i] = Integer.parseInt(tempVar3);
		  }

		}
		for (i = 0;i < n;i++)
		{
			if ((a[i] >= 90) && (a[i] <= 140) && (b[i] >= 60) && (b[i] <= 90))
			{
			   t++;
			   if (t > max)
			   {
				 max = t;
			   }
			}
			else
			{

				t = 0;
			}

		}
		System.out.printf("%d",max);
		return 0;
	}
}

