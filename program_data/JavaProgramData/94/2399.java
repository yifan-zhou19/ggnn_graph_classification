package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int chan;
		int countor;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int* num=(int*)malloc(n *sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 int num = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
	 for (i = 0;i < n;i++)
	 {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			num + i = Integer.parseInt(tempVar2);
		}
	 }

	 for (i = 0;i < n;i++)
	 {
		for (j = 0;j < n - i - 1;j++)
		{

		 if (*(num + j) > *(num + j + 1))
		 {
			 chan = (num + j);
			 *(num + j) = *(num + j + 1);
			 *(num + j + 1) = chan;
		 }
		}
	 }
	for (i = 0,countor = 0;i < n;i++)
	{
		 if (*(num + i) % 2 != 0)
		 {
		 countor++;
		 }
	}
	 for (i = 0;i < n;i++)
	 {
		 if (*(num + i) % 2 == 0)
		 {
			 continue;
		 }
		 else
		 {
			 countor--;
			 if (countor == 0)
			 {
				 System.out.printf("%d",*(num + i));
			 }
			 else
			 {
				 System.out.printf("%d,",*(num + i));
			 }
		 }
	 }
	return 0;

	}
}

