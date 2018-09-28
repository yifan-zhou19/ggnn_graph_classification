package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		 int m;
		 int n;
		 int i;
		 int j;
		 int tt;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *l;
		 int l;
		 int k;
	 int[] s = new int[102];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead("  ");
	 if (tempVar2 != null)
	 {
		 n = Integer.parseInt(tempVar2);
	 }
	 for (i = 0;i <= m - 1;i++)
	 {
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 s[i] = Integer.parseInt(tempVar3);
	 }
	 }
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p=&s[0];
	 int p = s[0];
	 for (i = 1;i <= n;i++)
	 {
		 tt = (p + m - 1);
		for (k = m - 1;k >= 1;k--)
		{
			   l = p + k;
		   l = *(l - 1);
		}
		p = tt;
	 }
	System.out.printf("%d", p);
	for (j = 1;j <= m - 1;j++)
	{
	System.out.printf(" %d",*(p + j));
	}
	return 0;
	 }

}

