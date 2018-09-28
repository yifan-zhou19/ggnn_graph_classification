package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int bian = new int(int a,int b);
		int n;
		int i;
		int a;
		int b;
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
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			System.out.printf("%d\n",bian(a, b));
		}
		return 0;
	}
	public static int bian(int a,int b)
	{
		int[] c = new int[10000];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int i;
		int j;
		int s = 0;
		for (p = c,i = 0;i < a * b;i++,p++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p = Integer.parseInt(tempVar);
			}
		}
		for (p = c,i = 0;i < a * b;)
		{
			if (i == 0)
			{
				for (j = 0;j < b;j++)
				{
					s = s + *p;
					p++;
					i++;
				}
			}
			if (i < (a - 1) * b)
			{
				for (;i <= (a - 1) * b - 1;i++,p++)
				{
					if (i % b == 0 || i % b == (b - 1))
					{
						s = s + *p;
					}
				}
			}
			if (i == (a - 1) * b)
			{
				for (j = 0;j < b;j++,p++,i++)
				{
					s = s + *p;
				}
			}
		}
		return s;
	}
}

