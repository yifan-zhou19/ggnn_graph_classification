package <missing>;

public class GlobalMembers
{
	public static int r;
	public static int c;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
	public static int p;
	public static int n;
	public static int m;
	public static int i;
	public static int j;
	public static int k;
	public static void Main()
	{
	 void x(int i);
	 void y(int i);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 r = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 c = Integer.parseInt(tempVar2);
	 }
	 n = r * c;
	 m = r + c - 2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 p = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
	 for (i = 0;i < n;i++)
	 {
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 p + i = Integer.parseInt(tempVar3);
	 }
	 }
	 for (i = 0;i < c;i++)
	 {
		 x(i);
	 }
	 for (i = c;i <= m;i++)
	 {
		 y(i);
	 }
	}
	public static void x(int i)
	{
		int a;
		for (a = i;a >= 0 && (i - a) < r;a--)
		{
			System.out.printf("%d\n",*(p + (i - a) * c + a));
		}
	}
	public static void y(int i)
	{
		int a;
		for (a = c - 1;a >= 0 && (i - a) < r;a--)
		{
			System.out.printf("%d\n",*(p + (i - a) * c + a));
		}
	}
}

