package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		int[] count = new int[50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		int n = a.length();
		int m = b.length();
		int i;
		int j;
		int k = 0;
		int l;
		int o;
		int result;
		for (i = 0;i < m;i++)
		{
						 if (a.charAt(0) == b.charAt(i))
						 {
										count[k] = i;
										k++;
						 }
		}
		for (o = 0;o < k;o++)
		{
						 l = 0;
						 for (j = 0;j < n;j++)
						 {
										  if (a.charAt(j) == b.charAt(count[o] + j))
										  {
																  l++;
										  }
										  if (l == n - 1)
										  {
													 System.out.printf("%d",count[o]);
													 result = 1;
										  }
						 }
						 if (result == 1)
						 {
						 break;
						 }
		}

		return 0;
	}


}

