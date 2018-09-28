package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int[] a = new int[200]; //?????????????????????????
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
		}
		for (;i < 200;i++)
		{
			a[i] = 0;
		}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p2;
		p1 = a; //p1??a[0]
		p2 = a[99 + m]; //???a[0]??????????a[99]??????a[99+m]
		for (i = 0;i < n - m;i++)
		{
			*p2 = p1;
			p1++;
			p2++;
		}
		p1 = a[n - m]; //???????
		p2 = a[99]; //?????????m????????100???m???????????m?
		for (i = 0;i < m;i++)
		{
		*p2++=*p1++;
		}
		System.out.printf("%d",a[99]);
		for (i = 100;i < 99 + n;i++)
		{
			System.out.printf(" %d",a[i]); //??
		}

	}
}

