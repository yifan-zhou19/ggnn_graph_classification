package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[] s = new int[60];
		int num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
						 num = 0;
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 m = Integer.parseInt(tempVar2);
						 }
						 if (m == 0)
						 {
								 System.out.print("60\n");
						 }
						 else
						 {
						 for (j = 0;j < m;j++)
						 {
										  String tempVar3 = ConsoleInput.scanfRead(" ");
										  if (tempVar3 != null)
										  {
											  s[j] = Integer.parseInt(tempVar3);
										  }
						 }
						 for (j = 1;j < m;j++)
						 {
						 if (((s[j - 1] + 3 * j) < 60) && ((s[j] + 3 * j)>60))
						 {
															 num += (60 - 3 * j);
						 }
						 }
						 for (j = 1;j <= m;j++)
						 {
						 if (((s[j - 1] + 3 * (j - 1)) < 60) && ((s[j - 1] + 3 * j)>60))
						 {
																	 num += (s[j - 1]);
						 }
						 }
						 if ((s[m - 1] + 3 * m) <= 60)
						 {
											  num += (60 - 3 * m);
						 }
						 if ((s[m - 1] + 3 * (m - 1)) == 60)
						 {
												 num += s[m - 1];
						 }
						 System.out.printf("%d\n",num);
						 }
		}
		return 0;
	}

}

