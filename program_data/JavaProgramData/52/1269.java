package <missing>;

public class GlobalMembers
{
	public static void move(tangible.RefObject<Integer> shu, int n)
	{
		int t1;
		int t2;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * ptr = shu.argValue;
		t1 = ptr;
		*ptr = (ptr + n - 1);
		ptr++;
		do
		{
			t2 = ptr;
			*ptr = t1;
			t1 = t2;
			ptr++;
		}while (ptr - shu.argValue <= n);
	}
	public static void Main()
	{
		int n;
		int a;
		int i;
		int[] shu = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				shu + i = tempVar3;
			}
		}
		for (i = 0;i < a;i++)
		{
		tangible.RefObject<Integer> tempRef_shu = new tangible.RefObject<Integer>(shu);
			move(tempRef_shu, n);
			shu = tempRef_shu.argValue;
		}
		for (i = 0;i < n;i++)
		{
			if (i != n - 1)
			{
			System.out.printf("%d ",shu[i]);
			}
			else
			{
				System.out.printf("%d",shu[i]);
			}
		}

	}
}

