package <missing>;

public class GlobalMembers
{
	public static int a;
	public static int b;
	public static int i;
	public static int j;
	public static int t;
	public static int[] c = new int[20];
	public static int[] d = new int[20];
	public static int[] e = new int[40];
	public static void in()
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		b = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < a;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		c[i] = Integer.parseInt(tempVar3);
	}
	}
	for (i = 0;i < b;i++)
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		d[i] = Integer.parseInt(tempVar4);
	}
	}
	}

	public static void order()
	{
	 for (i = 0;i < a - 1;i++)
	 {
	  for (j = 0;j < a - 1 - i;j++)
	  {
	   if (c[j] > c[j + 1])
	   {
		t = c[j];
		c[j] = c[j + 1];
		c[j + 1] = t;
	   }
	  }
	 }
	 for (i = 0;i < b - 1;i++)
	 {
	  for (j = 0;j < b - 1 - i;j++)
	  {
	   if (d[j] > d[j + 1])
	   {
		t = d[j];
		d[j] = d[j + 1];
		d[j + 1] = t;
	   }
	  }
	 }
	}

	public static void combine()
	{
	 for (i = 0;i < a;i++)
	 {
	  e[i] = c[i];
	 }
	 for (i = 0;i < b;i++)
	 {
	  e[a + i] = d[i];
	 }
	}

	public static void out()
	{
	 for (i = 0;i < a + b - 1;i++)
	 {
	  System.out.printf("%d ",e[i]);
	 }
	 System.out.printf("%d",e[a + b - 1]);
	}

	public static void Main()
	{
	 in();
	 order();
	 combine();
	 out();
	}
}

