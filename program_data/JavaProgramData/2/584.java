package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[] b = new int[27];
		int max = 0;
		int i;
		int j;
		int n;
		int k;
		int t;
		int len = 0;
		char[][] str = new char[100][27];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, 0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Integer.SIZE / Byte.SIZE));
		for (i = 1;i <= n;i++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i][1] = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  str[i] = tempVar3.charAt(0);
		  }
		  len = String.valueOf(str[i]).length();
		  for (j = 0;j < len;j++)
		  {
		  k = str[i][j] - 'A';
		   b[k]++;
		   a[i][k + 65] = 1;
		  }
		}
		  for (i = 0;i <= 25 ;i++)
		  {
		  if (b[i] > max)
		  {
			 max = b[i];
			 t = i;
		  }
		  }
		  System.out.printf("%c\n%d\n",t + 'A',max);
		  for (i = 1;i <= n;i++)
		  {
			 if (a[i][t + 'A'] == 1)
			 {
			 System.out.printf("%d\n",a[i][1]);
			 }
		  }
	}

}

