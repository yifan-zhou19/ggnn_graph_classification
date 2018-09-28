package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int m;
		 int n;
		 int i;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 m = Integer.parseInt(tempVar2);
		 }
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pi;
		 int pi;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		 pi = (int)malloc((Integer.SIZE / Byte.SIZE) * (2 * n - m));
		 for (i = 0;i < n;i++)
		 {
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 pi + i = Integer.parseInt(tempVar3);
			 }
		 }
		 for (i = 0;i < n - m;i++)
		 {
			 *(pi + i + n) = pi[i];
		 }
		 System.out.printf("%d",pi[n - m]);
		 for (i = n - m + 1;i < 2 * n - m;i++)
		 {
			 System.out.printf(" %d",pi[i]);
		 }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		 free(pi);
		return 0;
	}

}

