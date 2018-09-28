package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= a;i++)
		{
			int[] m = new int[20];
			int b;
			int c;
			int d;
			int e;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = Integer.parseInt(tempVar2);
			}
			if (b == 0)
			{
				System.out.print("60\n");
			}
			else
			{
					  for (c = 0;c < b;c++)
					  {
						 String tempVar3 = ConsoleInput.scanfRead();
						 if (tempVar3 != null)
						 {
							 m + c = tempVar3;
						 }
					  }
					  if (m[b - 1] + 3 * b <= 60)
					  {
						  System.out.printf("%d\n",60 - 3 * b);
					  }
					  else
					  {
						  if (m[b - 1] + 3 * (b - 1) >= 57 && m[b - 1] + 3 * (b - 1) <= 60)
						  {
							  System.out.printf("%d\n",m[b - 1]);
						  }
						  else
						  {
							  d = 1;

					  while (d <= b)
					  {
						  if (m[d - 1] + 3 * (d - 1) > 60)
						  {
							  if (m[d - 2] + 3 * (d - 2) <= 57)
							  {
							  System.out.printf("%d\n",63 - 3 * d);
							  break;
							  }
						  else
						  {
							  System.out.printf("%d\n",m[d - 2]);
							  break;
						  }
						  }
						  d++;
					  }
						  }
					  }
			}
		}
	}

}

