package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int t;
		int max;
		String mem = new String(new char[1000]);
		int[] num = new int[1000];
		for (i = 0;i < 1000;i++)
		{
		  num[i] = 1;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		mem = new Scanner(System.in).nextLine();
		m = mem.length();
		for (i = 0;i <= m - n;i++)
		{
			if (num[i] != 0)
			{
				for (j = i + 1;j <= m - n;j++)
				{
					for (t = 0;t < n;t++)
					{
						if (mem.charAt(i + t) != mem.charAt(j + t))
						{
							break;
						}
					}
					if (t == n)
					{
						num[j] = 0;
						num[i]++;
					}
				}
			}
		}

	   max = 1;
	   for (i = 0;i <= m - n;i++)
	   {
		  if (num[i] > max)
		  {
			  max = num[i];
		  }
	   }
	   if (max == 1)
	   {
		   System.out.print("NO\n");
		   return 0;
	   }
	   System.out.printf("%d\n",max);
	   for (i = 0;i <= m - n;i++)
	   {
		   if (num[i] == max)
		   {
			  for (j = 0;j < n;j++)
			  {
			 System.out.printf("%c",mem.charAt(i + j));
			  }
			 System.out.print("\n");
		   }
	   }
	  return 0;
	}



}

