package <missing>;

public class GlobalMembers
{
	public static int compare(Object elem1, Object elem2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a=null,*b=null;
		int a = null;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *b=null;
		int b = null;
		a = (int)elem1;
		b = (int)elem2;
		return (a - b);
	}
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
		}

		for (i = 0;i < n;i++)
		{
		for (j = 0;j < n;j++)
		{
			if (i == j)
			{
			continue;
			}
			else
			{
				if (a[i] + a[j] == k)
				{
				System.out.print("yes");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto end;
				}
			}
		}
		}
		System.out.print("no");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		end:
		return 0;
	}
}

