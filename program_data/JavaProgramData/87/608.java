package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] t = new int[6];
		int i;
		int a;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				t[i] = Integer.parseInt(tempVar);
			}
		}
		while (t[0] != 0 || t[1] != 0 || t[2] != 0 || t[3] != 0 || t[4] != 0 || t[5] != 0)
		{
		a = (t[3] - t[0] + 12) * 3600 + (t[4] - t[1]) * 60 + t[5] - t[2];
		System.out.printf("%d\n",a);
		   for (i = 0;i < 6;i++)
		   {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  t[i] = Integer.parseInt(tempVar2);
			  }
		   }
		}
	return 0;
	}
}

