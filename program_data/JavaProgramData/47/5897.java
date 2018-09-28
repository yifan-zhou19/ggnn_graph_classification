package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *Stack= (int *)malloc(n *sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		 int Stack = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
		 for (i = 0;i < n;i++)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 Stack + i = Integer.parseInt(tempVar2);
			 }
		 }
		 for (i = n - 1;i >= 0;i--)
		 {
			 if (i == 0)
			 {
				 System.out.printf("%d",*(Stack + i));
			 }
			 else
			 {
				 System.out.printf("%d ",*(Stack + i));
			 }
		 }
		 return 0;

	}

}

