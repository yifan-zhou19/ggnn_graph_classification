package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int m;
	public static int n;
	public static void shuru()
	{
	 int i;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 n = Integer.parseInt(tempVar2);
	 }
	 for (i = 0;i < m;i++)
	 {
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 a[i] = Integer.parseInt(tempVar3);
	 }
	 }
	 for (i = 0;i < n;i++)
	 {
	 String tempVar4 = ConsoleInput.scanfRead();
	 if (tempVar4 != null)
	 {
		 b[i] = Integer.parseInt(tempVar4);
	 }
	 }
	}
	public static void paixu(tangible.RefObject<Integer> p1, tangible.RefObject<Integer> p2)
	{
		int i;
		int j;
		int temp;
		for (j = 1;j < m;j++)
		{
			for (i = 0;i < m - 1;i++)
			{
				if ((*(p1.argValue + i)) > (*(p1.argValue + i + 1)))
				{
					temp = (p1.argValue + i);
					*(p1.argValue + i) = *(p1.argValue + i + 1);
					*(p1.argValue + i + 1) = temp;
				}
			}
		}
		for (j = 1;j < n;j++)
		{
			for (i = 0;i < n - 1;i++)
			{
				if (*(p2.argValue + i) > *(p2.argValue + i + 1))
				{
					temp = (p2.argValue + i);
					*(p2.argValue + i) = *(p2.argValue+1 + i);
					*(p2.argValue + i + 1) = temp;
				}
			}
		}
	}
	public static void hebing()
	{
	 int i;
	 for (i = 0;i < n;i++)
	 {
	 a[m + i] = b[i];
	 }
	}
	public static void shuchu()
	{
	 int i;
	 System.out.printf("%d",a[0]);
	 for (i = 1;i < m + n;i++)
	 {
	 System.out.printf(" %d",a[i]);
	 }
	}
	public static int Main()
	{
	 shuru();
 tangible.RefObject<Integer> tempRef_a = new tangible.RefObject<Integer>(a);
 tangible.RefObject<Integer> tempRef_b = new tangible.RefObject<Integer>(b);
	 paixu(tempRef_a, tempRef_b);
	 b = tempRef_b.argValue;
	 a = tempRef_a.argValue;
	 hebing();
	 shuchu();
	return 0;
	}
}

