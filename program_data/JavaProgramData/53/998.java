package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a,*b,*p,i,j,n,k=0;
		int a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *b;
		int b;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int i;
		int j;
		int n;
		int k = 0;
		a = LEN;
		b = LEN;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a + i = Integer.parseInt(tempVar2);
			}
		}
		p = b;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (*(a + i) == *(a + j))
				{
					break;
				}
			}
			if (j == i)
			{
				*p++=*(a + i);
				k++;
			}
			else
			{
				continue;
			}
		}
		p = b;
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%d,",*p++);
		}
		System.out.printf("%d",*p);
	}




}

