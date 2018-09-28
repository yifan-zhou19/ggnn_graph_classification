public class patient
	{
		public int x;
	public int y;
	}

package <missing>;

public class GlobalMembers
{
			   public static patient[] p = tangible.Arrays.initializeWithDefaultpatientInstances(100);
	public static int Main()
	{
		int max = 0;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int k = 0;
		int i;
		for (i = 1;i <= n;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p[i].x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p[i].y = Integer.parseInt(tempVar2);
		}
		}
		for (i = 1;i <= n;i++)
		{
		if (p[i].x >= 90 && p[i].x <= 140 && p[i].y <= 90 && p[i].y >= 60)
		{
		k++;
		}
		else
		{
			k = 0;
		}

		if (max <= k)
		{
		max = k;
		}
		}
	System.out.print(max);


	return 0;

	}


}

