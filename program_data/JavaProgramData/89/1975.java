package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int[] a = new int[10000];
		int[] b = new int[10000];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Integer.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (true)
		{
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  i = Integer.parseInt(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  j = Integer.parseInt(tempVar3);
			  }
			  if ((i == 0) && (j == 0))
			  {
				  break;
			  }
			  a[i] = 1;
			  b[j]++;
		}
		l = 0;
		for (i = 0;i < n;i++)
		{
			if ((a[i] == 0) && (b[i] == n - 1))
			{
			   l = 1;
			   System.out.printf("%d",i);
			}
		}
		if (l == 0)
		{
			System.out.print("NOT FOUND");
		}
	}

}

