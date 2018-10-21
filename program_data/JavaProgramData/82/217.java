package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int j = 0;
		int a;
		int b;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
			while (i < n)
			{
				i++;
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					b = Integer.parseInt(tempVar3);
				}
				if (90 <= a != 0 && a <= 140 && 60 <= b != 0 && b <= 90)
				{
					j++;
				}
				else
				{
					break;
				}
			}
			while (i < n)
			{
				 while (i < n)
				 {
					 i++;
					  String tempVar4 = ConsoleInput.scanfRead();
					  if (tempVar4 != null)
					  {
						  a = Integer.parseInt(tempVar4);
					  }
					  String tempVar5 = ConsoleInput.scanfRead(" ");
					  if (tempVar5 != null)
					  {
						  b = Integer.parseInt(tempVar5);
					  }
					  if ((90 <= a) && (a <= 140) && (60 <= b) && (b <= 90))
					  {
						 k++;
					  }
					  else
					  {
						  break;
					  }
				 }
				 if (k > j)
				 {
							  j = k;
				 }
						  k = 0;
			}
	System.out.printf("%d",j);
		return 0;
	}
}

