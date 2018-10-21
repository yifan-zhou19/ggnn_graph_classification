package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int[][] str_1 = new int[20][20];
	int[] str_2 = new int[100];
	int x;
	int y;
	int m;
	int j;
	int sum = 0;
	int p = 0;
	int a = 0;
	int b = 0;
	int c;
	int k;
	int i = 0;
	while (true)
	{
	  ++p;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  x = Integer.parseInt(tempVar);
	  }
	  if (-1 == x)
	  {
		  break;
	  }
	  k = 0;
	  str_1[p][i++] = x;
	  b++;
	  while (true)
	  {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   y = Integer.parseInt(tempVar2);
	   }
	   k++;
	   str_1[p][i++] = y;
	   if (0 == y)
	   {
		str_1[p][i] = '\0';
		break;
	   }
	  }
	  for (j = 0;j < k;j++)
	  {
	   for (m = 0;m < k;m++)
	   {
		if (str_1[p][j] == str_1[p][m] * 2)
		{
			++sum;
		}
	   }
	  }
	  str_2[a++] = sum;
	  sum = 0;
	  str_2[a] = '\0';
	  i = 0;
	}
	for (c = 0;c < b;c++)
	{
	  System.out.printf("%d",str_2[c]);
	  System.out.print("\n");
	}
	}
}

