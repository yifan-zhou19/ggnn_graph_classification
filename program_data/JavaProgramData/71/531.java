package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int temp;
		int[] a = new int[200];
		int[] b = new int[200];
		int[] c = new int[200];
		int[] d = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 0};
		int cha = 0;
		int j;
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
						  String tempVar3 = ConsoleInput.scanfRead();
						  if (tempVar3 != null)
						  {
							  b[i] = Integer.parseInt(tempVar3);
						  }
						  String tempVar4 = ConsoleInput.scanfRead();
						  if (tempVar4 != null)
						  {
							  c[i] = Integer.parseInt(tempVar4);
						  }
		}
		for (i = 0;i < n;i++)
		{
					  if (b[i] > c[i])
					  {
						  temp = b[i];
					   b[i] = c[i];
					   c[i] = temp;
					  }
					   if (a[i] % 400 == 0 || (a[i] % 4 == 0 && a[i] % 100 != 0))
					   {
				d[1] = d[1] + 1;
				for (j = b[i];j < c[i];j++)
				{
					cha = cha + d[j - 1];
				}
								d[1] = d[1] - 1;
				if (cha % 7 != 0)
				{
					System.out.print("NO\n");
				}
				else
				{
					System.out.print("YES\n");
				}
					   }
			else
			{
				for (j = b[i];j < c[i];j++)
				{
					cha = cha + d[j - 1];
				}
				if (cha % 7 != 0)
				{
					System.out.print("NO\n");
				}
				else
				{
					System.out.print("YES\n");
				}
			}
			cha = 0;
		}
		return 0;
	}


}

