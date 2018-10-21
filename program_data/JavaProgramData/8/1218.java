package <missing>;

public class GlobalMembers
{
	public static void input(int p, int q, tangible.RefObject<Integer> num1, tangible.RefObject<Integer> num2)
	{
		 int i;
		 for (i = 0;i < p;i++)
		 {
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 num1.argValue + i = Integer.parseInt(tempVar);
			 }
		 }
		 for (i = 0;i < q;i++)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 num2.argValue + i = Integer.parseInt(tempVar2);
			 }
		 }
	}
	public static void sort(int p, int q, int[] num1, int[] num2)
	{
		 int i;
		 int j;
		 int t;
		 for (i = 0;i < p;i++)
		 {
			  for (j = 0;j < p - 1 - i;j++)
			  {
				   if (num1[j] > num1[j + 1])
				   {
						t = num1[j];
						num1[j] = num1[j + 1];
						num1[j + 1] = t;
				   }
			  }
		 }
		 for (i = 0;i < q;i++)
		 {
			  for (j = 0;j < q - 1 - i;j++)
			  {
				   if (num2[j] > num2[j + 1])
				   {
						t = num2[j];
						num2[j] = num2[j + 1];
						num2[j + 1] = t;
				   }
			  }
		 }
	}
	public static void print(int p, int q, int[] num1, int[] num2)
	{
		 int i;
		 System.out.printf("%d",num1[0]);
		 for (i = 1;i < p;i++)
		 {
			 System.out.printf(" %d",num1[i]);
		 }
		 for (i = 0;i < q;i++)
		 {
			 System.out.printf(" %d",num2[i]);
		 }
	}
	public static int Main()
	{
		 int p;
		 int q;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *num1;
		 int num1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *num2;
		 int num2;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 p = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 q = Integer.parseInt(tempVar2);
		 }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		 num1 = (int)malloc(p * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		 num2 = (int)malloc(q * (Integer.SIZE / Byte.SIZE));
	 tangible.RefObject<Integer> tempRef_num1 = new tangible.RefObject<Integer>(num1);
	 tangible.RefObject<Integer> tempRef_num2 = new tangible.RefObject<Integer>(num2);
		 input(p, q, tempRef_num1, tempRef_num2);
		 num2 = tempRef_num2.argValue;
		 num1 = tempRef_num1.argValue;
		 sort(p, q, num1, num2);
		 print(p, q, num1, num2);

	}

}

