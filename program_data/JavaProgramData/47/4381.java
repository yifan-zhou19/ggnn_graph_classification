package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] p;
		int i = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 p = new int[n];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 q = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
	 for (i = 0;i < n;i++)
	 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 p[i] = Integer.parseInt(tempVar2);
		 }
	 }
	 for (i = 0;i < n;i++)
	 {
		 *(q + n - i - 1) = p[i];
	 }
	 for (i = 0;i < n - 1;i++)
	 {
		 System.out.printf("%d ",q[i]);
	 }
	 if (i == n - 1)
	 {
	 System.out.printf("%d",q[i]);
	 }
	}
}

