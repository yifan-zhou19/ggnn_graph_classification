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
//ORIGINAL LINE: int *num=(int*)malloc(n *sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  int num = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
		  for (i = 0;i < n;i++)
		  {
				  *(num + i) = 0;
		  }
		  for (;;)
		  {
				 int a;
				 int b;
				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 a = Integer.parseInt(tempVar2);
				 }
				 String tempVar3 = ConsoleInput.scanfRead(" ");
				 if (tempVar3 != null)
				 {
					 b = Integer.parseInt(tempVar3);
				 }
				 if (a == 0 && b == 0)
				 {
					 break;
				 }
				 num[a]--;
				 num[b]++;
		  }
		  for (i = 0;i < n;i++)
		  {
				  if (num[i] == n - 1)
				  {
								  System.out.printf("%d",i);
								  break;
				  }
		  }
		  if (i == n)
		  {
			  System.out.print("NOT FOUND");
		  }
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}
}

