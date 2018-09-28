public class N
{
public int a;
public N next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
		int n;
		int[] a = new int[100];
		int x;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (p = a;p < a + n;p++)
	 {
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							p = Integer.parseInt(tempVar2);
						}
	 }
						for (p = a,q = a + n - 1;p < a + n / 2;p++,q--)
						{
											 x = p;
											 *p = q;
											 q = x;
						}
	 for (p = a;p < a + n;p++)
	 {
						if (p == a)
						{
							System.out.printf("%d",*p);
						}

						else
						{
							System.out.printf(" %d",*p);
						}
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 n = Integer.parseInt(tempVar3);
	 }
	 return 0;
	}



}

