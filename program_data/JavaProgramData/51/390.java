package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String c = new String(new char[2000]);
	char[][] x = new char[2000][100];
	int n;
	int m;
	int j;
	int len;
	int i;
	int max;
	int[] p = new int[2000];
	int[] co = new int[2000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	c = new Scanner(System.in).nextLine();
	len = c.length();
	for (i = 0;i <= len - m;i++)
	{
	 for (j = 0;j <= m - 1;j++)
	 {
		x[i][j] = c.charAt(i + j);
	 }
	}
	for (i = 0;i <= len - m - 1;i++)
	{
		 p[i] = 0;
	 for (j = i + 1;j <= len - m;j++)
	 {
	  if (strcmp(x[i],x[j]) == 0 && p[j] == 0)
	  {
		co[i]++;
		p[j] = 1;
	  }
	 }
	}
	 max = 0;
	for (i = 0;i <= len - m;i++)
	{
	if (max < co[i])
	{
		max = co[i];
	}
	}
	if (max + 1 <= 1)
	{
		System.out.print("NO");
	}
	else
	{
		System.out.printf("%d\n",max + 1);
	for (i = 0;i <= len - m;i++)
	{
	if (co[i] == max)
	{
		System.out.printf("%s\n",x[i]);
	}
	}
	}
	}
}

