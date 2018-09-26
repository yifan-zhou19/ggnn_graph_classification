package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sushu = new int[10000];
		int n;
		int i;
		int j;
		int k;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		sushu[0] = 2;
		j = 1;
		for (i = 3;i <= n;i++)
		{
		x = 0;
		for (k = 2;k < i;k++)
		{
		  if (i % k == 0)
		  {
		  x++;
		  }
		}
		  if (x == 0)
		  {
		  sushu[j] = i;
		  j++;
		  }
		}
		 x = 0;
		 for (i = 0;i < j;i++)
		 {
		 if (sushu[i] == sushu[i + 1] - 2)
		 {
		 System.out.printf("%d %d\n",sushu[i],sushu[i + 1]);
		 x++;
		 }
		 }
		if (x == 0)
		{
		System.out.print("empty");
		}
	}
}

