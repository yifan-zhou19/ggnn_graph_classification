package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] b = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	 int m;
	 int i;
	 int j;
	 int k;
	 int[] num = new int[10000];
	 int max = 0;
	 int t = 0;
	 char[][] a = new char[10000][26];
	 char[] c = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < m;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  num[i] = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  a[i] = tempVar3.charAt(0);
	  }
	 }
	 for (i = 0;i < m;i++)
	 {
	  for (j = 0;j < 26;j++)
	  {
	   for (k = 0;k < 26;k++)
	   {
		if (a[i][j] == c[k])
		{
		b[k]++;
		}
	   }
	  }
	 }
	 for (i = 0;i < 26;i++)
	 {
	  if (b[i] > max)
	  {
	   max = b[i];
	   t = i;
	  }
	 }
	 System.out.printf("%c\n",c[t]);
	 System.out.printf("%d\n",max);
	 for (i = 0;i < m;i++)
	 {
	  for (j = 0;j < 26;j++)
	  {
		if (a[i][j] == c[t])
		{
		 System.out.printf("%d\n",num[i]);
		 break;
		}
	  }
	 }

	 System.in.read();
	 System.in.read();
	 return 0;
	}
}

