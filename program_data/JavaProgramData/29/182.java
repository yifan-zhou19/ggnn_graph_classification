package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
						int a;
						int[] b = new int[10000];
						int num = 1;
						int j = 2;
						double s = 2.0;
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							a = Integer.parseInt(tempVar2);
						}
						b[0] = 1;
						b[1] = 2;
						while (true)
						{
								 if (num == a)
								 {
										  System.out.printf("%.3lf\n",s);
										  break;
								 }
								b[j] = b[j - 1] + b[j - 2];
								s += (double)(b[j]) / b[j - 1];
								num++;
								j++;

						}
		}
		return 0;
	}

}

