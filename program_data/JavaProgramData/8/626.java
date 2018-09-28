//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static void read(tangible.RefObject<Integer> pm, tangible.RefObject<Integer> pn, tangible.RefObject<Integer> p1, tangible.RefObject<Integer> p2)
	{
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			pm.argValue = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			pn.argValue = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < pm.argValue;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.argValue + i = Integer.parseInt(tempVar3);
			}
		}
		for (j = 0;j < pn.argValue;j++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p2.argValue + j = Integer.parseInt(tempVar4);
			}
		}
	}

	public static void sort(tangible.RefObject<Integer> pm, tangible.RefObject<Integer> pn, tangible.RefObject<Integer> p1, tangible.RefObject<Integer> p2)
	{
		int i;
		int j;
		int k;
		int tmp;
		for (i = 0;i < pm.argValue-1;i++)
		{
			k = i;
			for (j = i + 1;j < pm.argValue;j++)
			{
				if (*(p1.argValue + j) < *(p1.argValue + k))
				{
					k = j;
				}
			}
			if (k != i)
			{
				tmp = (p1.argValue + k);
				*(p1.argValue + k) = *(p1.argValue + i);
				*(p1.argValue + i) = tmp;
			}
		}
		for (i = 0;i < pn.argValue-1;i++)
		{
			k = i;
			for (j = i + 1;j < pn.argValue;j++)
			{
				if (*(p2.argValue + j) < *(p2.argValue + k))
				{
					k = j;
				}
			}
			if (k != i)
			{
				tmp = (p2.argValue + k);
				*(p2.argValue + k) = *(p2.argValue + i);
				*(p2.argValue + i) = tmp;
			}
		}
	}

	public static int combine(tangible.RefObject<Integer> pm, tangible.RefObject<Integer> pn, tangible.RefObject<Integer> p1, tangible.RefObject<Integer> p2, tangible.RefObject<Integer> pnew)
	{
		int i;
		int j;
		for (i = 0;i < pm.argValue;i++)
		{
			*(pnew.argValue + i) = *(p1.argValue + i);
		}
		for (j = 0;j < pn.argValue;j++)
		{
			*(pnew.argValue + i + j) = *(p2.argValue + j);
		}
		return i + j;
	}

	public static void print(tangible.RefObject<Integer> pk, tangible.RefObject<Integer> pnew)
	{
		int i;
		for (i = 0;i < pk.argValue;i++)
		{
			System.out.printf("%d",*(pnew.argValue + i));
			if (i == pk.argValue-1)
			{
				System.out.print("\n");
			}
			else
			{
				System.out.print(" ");
			}
		}
	}

	public static void Main()
	{
		int m = 0;
		int n = 0;
		int k = 0;
		int[] a = new int[10];
		int[] b = new int[10];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pm=&m,*pn=&n,*pa=a,*pb=b;
		int pm = m;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pn=&n;
		int pn = n;
		int[] pa = a;
		int[] pb = b;
		int[] New = new int[20];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pk=&k;
		int pk = k;
		int[] pnew = New;

	tangible.RefObject<Integer> tempRef_pm = new tangible.RefObject<Integer>(pm);
	tangible.RefObject<Integer> tempRef_pn = new tangible.RefObject<Integer>(pn);
	tangible.RefObject<Integer> tempRef_pa = new tangible.RefObject<Integer>(pa);
	tangible.RefObject<Integer> tempRef_pb = new tangible.RefObject<Integer>(pb);
		read(tempRef_pm, tempRef_pn, tempRef_pa, tempRef_pb);
		pb = tempRef_pb.argValue;
		pa = tempRef_pa.argValue;
		pn = tempRef_pn.argValue;
		pm = tempRef_pm.argValue;
	tangible.RefObject<Integer> tempRef_pm2 = new tangible.RefObject<Integer>(pm);
	tangible.RefObject<Integer> tempRef_pn2 = new tangible.RefObject<Integer>(pn);
	tangible.RefObject<Integer> tempRef_pa2 = new tangible.RefObject<Integer>(pa);
	tangible.RefObject<Integer> tempRef_pb2 = new tangible.RefObject<Integer>(pb);
		sort(tempRef_pm2, tempRef_pn2, tempRef_pa2, tempRef_pb2);
		pb = tempRef_pb2.argValue;
		pa = tempRef_pa2.argValue;
		pn = tempRef_pn2.argValue;
		pm = tempRef_pm2.argValue;
	tangible.RefObject<Integer> tempRef_pm3 = new tangible.RefObject<Integer>(pm);
	tangible.RefObject<Integer> tempRef_pn3 = new tangible.RefObject<Integer>(pn);
	tangible.RefObject<Integer> tempRef_pa3 = new tangible.RefObject<Integer>(pa);
	tangible.RefObject<Integer> tempRef_pb3 = new tangible.RefObject<Integer>(pb);
	tangible.RefObject<Integer> tempRef_pnew = new tangible.RefObject<Integer>(pnew);
		pk = combine(tempRef_pm3, tempRef_pn3, tempRef_pa3, tempRef_pb3, tempRef_pnew);
		pnew = tempRef_pnew.argValue;
		pb = tempRef_pb3.argValue;
		pa = tempRef_pa3.argValue;
		pn = tempRef_pn3.argValue;
		pm = tempRef_pm3.argValue;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


