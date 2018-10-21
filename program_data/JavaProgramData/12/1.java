package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] s = new int[15];
		int a;
		int b;
		int i;
		int t;
		int h;
		int k;
		for (i = 0;i <= 100;i++)
		{
			b = 0;
			a = 0;
			for (t = 0;t < 17;t++)
			{
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 s[t] = Integer.parseInt(tempVar);
			 }
			 if (s[t] == 0)
			 {
				 break;
			 }
			 if (s[t] == -1)
			 {
				 break;
			 }
			 a++;
			}
			if (s[t] == -1)
			{
				break;
			}
			for (k = 0;k < a;k++)
			{
				for (h = 0;h < a;h++)
				{
					if (s[k] == 2 * s[h])
					{
						b++;
					}
					else
					{
						b = b;
					}
				}
			}
		System.out.printf("%d\n",b);
		}
		return 0;
	}


}

