package <missing>;

public class GlobalMembers
{
	public static void input(tangible.RefObject<Integer> p1, tangible.RefObject<Integer> p2, int[][] pA, int[][] pB)
	{
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		p1.argValue = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		p2.argValue = Integer.parseInt(tempVar2);
	}
	pA = new int[p1.argValue];
	pB = new int[p2.argValue];
	 for (i = 0; i < p1.argValue; i++)
	 {
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		pA + i = tempVar3;
	}
	 }
	 for (i = 0; i < p2.argValue; i++)
	 {
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		pB + i = tempVar4;
	}
	 }
	}
	public static void sort(int p, int[] pX)
	{
	 int i;
	 int j;
	 int temp;
	 for (i = 0; i < p; i++)
	 {
	  for (j = p - 1; j > i; j--)
	  {
	   if (pX[j] < pX[j - 1])
	   {
		temp = pX[j];
		pX[j] = pX[j - 1];
		pX[j - 1] = temp;
	   }
	  }
	 }
	}
	public static void combine(int p1, int p2, int[] pA, int[] pB, int[][] pC)
	{
	 pC = new int[(p1 + p2)];
	 int i;
	 for (i = 0; i < p1; i++)
	 {
		 pC[i] = pA[i];
	 }
	 for (i = 0; i < p2; i++)
	 {
		 pC[p1 + i] = pB[i];
	 }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	 free(pA);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	 free(pB);
	}
	public static void output(int p, int[] pC)
	{
	 int i;
	 for (i = 0; i < p - 1; i++)
	 {
		 System.out.printf("%d ", pC[i]);
	 }
	 System.out.printf("%d\n", pC[p - 1]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	 free(pC);
	}
	public static int Main()
	{
	 int p1;
	 int p2;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pA;
	 int pA;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pB;
	 int pB;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pC;
	 int pC;
 tangible.RefObject<Integer> tempRef_p1 = new tangible.RefObject<Integer>(p1);
 tangible.RefObject<Integer> tempRef_p2 = new tangible.RefObject<Integer>(p2);
	 input(tempRef_p1, tempRef_p2, pA, pB);
	 p2 = tempRef_p2.argValue;
	 p1 = tempRef_p1.argValue;
	 sort(p1, pA);
	 sort(p2, pB);
	 combine(p1, p2, pA, pB, pC);
	 output(p1 + p2, pC);
	}
}

