package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int a;
		  int b;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		  int * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		  int * q;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  p = (int)(malloc(n * (Integer.SIZE / Byte.SIZE)));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  q = (int)(malloc(n * (Integer.SIZE / Byte.SIZE)));
		  for (i = 0;i < n;i++)
		  {
			   *p = 0;
			   *q = 0;
			   p += 1;
			   q += 1;
		  }
		  p = p - n;
		  q = q - n;
		  for (;;)
		  {
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
				 if ((a == 0) && (b == 0))
				 {
				 break;
				 }
				 p[a] += 1;
				 q[b] += 1;
		  }
		  for (i = 0;i < n;i++)
		  {
				 if ((p[i] == 0) && (q[i] == n - 1))
				 {
					 System.out.printf("%d",i);
					 break;
				 }
		  }
		  if (i == n)
		  {
		  System.out.print("NOT FOUND");
		  }

	}
}

