package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int A = 0;
	int B = 0;
	int Tie = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int* lun=(int*)malloc(n *2 *sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	int lun = (int)malloc(n * 2 * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int* result=(int*)malloc(n *sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	int result = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
	for (i = 0;i < n * 2;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		lun + i = Integer.parseInt(tempVar2);
	}
	}
	for (i = 0;i < n;i++)
	{
	for (j = 0;j < 1;j++)
	{
	if (*(lun + i * 2 + j) - *(lun + i * 2 + j + 1) == -1 || *(lun + i * 2 + j) - *(lun + i * 2 + j + 1) == 2)
	{
	  *(result + i) = 1;
	}
	else if (*(lun + i * 2 + j) == *(lun + i * 2 + j + 1))
	{
		*(result + i) = 0;
	}
	else
	{
		*(result + i) = -1;
	}
	}
	}
	  for (i = 0;i < n;i++)
	  {
		if (*(result + i) == 1)
		{
			A++;
		}
	if (*(result + i) == 0)
	{
		Tie++;
	}
	if (*(result + i) == -1)
	{
		B++;
	}
	  }
	if (A > B)
	{
		System.out.print("A");
	}
	if (B > A)
	{
		System.out.print("B");
	}
	if (A == B)
	{
		System.out.print("Tie");
	}
	return 0;
	}







}

