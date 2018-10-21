package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int c;
		int d;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[20000];
		int[] b = new int[20000];
		for (i = 0;i < 20000;i++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  c = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  d = Integer.parseInt(tempVar3);
		  }
		  if ((c == 0) && (d == 0))
		  {
		  break;
		  }
		  a[c] = a[c] - 1;
		  b[d] = b[d] + 1;
		}
		  for (j = 0;j < i;j++)
		  {
			if ((b[j] == (n - 1)) && (a[j] == 0))
			{
				System.out.printf("%d\n",j);
				t = 1;
			}
		  }
			if (t == 0)
			{
			System.out.print("NOT FOUND");
			}

				  return 0;
	}


}

