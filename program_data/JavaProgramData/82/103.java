package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] p1 = new int[100];
		int[] p2 = new int[100];
		int[] t = new int[100];
		int c = 0;
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
				 p1[i] = Integer.parseInt(tempVar2);
			 }
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 p2[i] = Integer.parseInt(tempVar3);
			 }
			 if (((p1[i] >= 90) && (p1[i] <= 140)) && ((p2[i] >= 60) && (p2[i] <= 90)))
			 {
				 t[i] = 1;
			 }
			 else
			 {
				 t[i] = 0;
			 }
		}
		for (i = 0;i < n;i++)
		{
			if (t[i] == 1)
			{
				 c++;
				 if (c > max)
				 {
					 max = c;
				 }
			}
			else
			{
				c = 0;
			}
		}
		System.out.printf("%d",max);
		return 0;
	}
}

