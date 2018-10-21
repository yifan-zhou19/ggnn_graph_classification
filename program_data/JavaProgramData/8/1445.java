package <missing>;

public class GlobalMembers
{
	/*
	a)  ??????????????????? 
	b)  ??????????? 
	c)  ?????????? 
	d)  ????????? 
	*/
	public static int[] a = new int[200];
	public static int[] b = new int[100];
	public static int[] p1 = a;
	public static int[] p2 = b;
	public static int m;
	public static int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2m=&m,*p2n=&n;
	public static int p2m = m;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2n=&n;
	public static int p2n = n;
	/*Read-in  as function(a)  */
	public static void funcofa(tangible.RefObject<Integer> p1, tangible.RefObject<Integer> p2, tangible.RefObject<Integer> p2m, tangible.RefObject<Integer> p2n)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p2m.argValue = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p2n.argValue = Integer.parseInt(tempVar2);
		}
		int i;
		for (i = 1;i <= p2m.argValue;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.argValue + i - 1 = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i <= p2n.argValue;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p2.argValue + i - 1 = Integer.parseInt(tempVar4);
			}
		}
	}
	/*Sort  as function(b)*/
	public static void funcofb(tangible.RefObject<Integer> p1, tangible.RefObject<Integer> p2, tangible.RefObject<Integer> p2m, tangible.RefObject<Integer> p2n)
	{
		int i;
		int j;
		int temp;
		for (i = 1;i <= p2m.argValue;i++)
		{
			for (j = 1;j < p2m.argValue;j++)
			{
				if (*(p1.argValue + j - 1) > *(p1.argValue + j))
				{
					temp = (p1.argValue + j);
					*(p1.argValue + j) = *(p1.argValue + j - 1);
					*(p1.argValue + j - 1) = temp;
				}
				else
				{
				}
			}
		}
		for (i = 1;i <= p2n.argValue;i++)
		{
			for (j = 1;j < p2n.argValue;j++)
			{
				if (*(p2.argValue + j - 1) > *(p2.argValue + j))
				{
					temp = (p2.argValue + j);
					*(p2.argValue + j) = *(p2.argValue + j - 1);
					*(p2.argValue + j - 1) = temp;
				}
				else
				{
				}
			}
		}
	}
	/*void funcofb(int *p1,int *p2,int *p2m,int *p2n)
	{
		int i,j;
		int temp;
		for(i=1;i<=*p2m;i++)
		{
			for(j=1;j<*p2m-i;j++)
			{
				if(*(p1+j*sizeof(int)-1*sizeof(int))>*(p1+j*sizeof(int)))
				{
					temp=*(p1+j*sizeof(int));
					*(p1+j*sizeof(int))=*(p1+j*sizeof(int)-1);
					*(p1+j*sizeof(int)-1)=temp;
				}
				else
				{}
			}
		}
		for(i=1;i<=*p2n;i++)
		{
			for(j=1;j<*p2n-i;j++)
			{
				if(*(p2+j*sizeof(int)-1*sizeof(int))>*(p2+j*sizeof(int)))
				{
					temp=*(p2+j*sizeof(int));
					*(p2+j*sizeof(int))=*(p2+j*sizeof(int)-1);
					*(p2+j*sizeof(int)-1)=temp;
				}
				else
				{}
			}
		}
	}*/
	/*Merge  as  function(c? */
	public static void funcofc(tangible.RefObject<Integer> p1, tangible.RefObject<Integer> p2, tangible.RefObject<Integer> p2m, tangible.RefObject<Integer> p2n)
	{
		int i;
		for (i = 1;i <= p2n.argValue;i++)
		{
			*(p1.argValue + p2m.argValue + i - 1) = *(p2.argValue + i - 1);
		}
	}
	/*Output  as  dunction(d)  */
	public static void funcofd(tangible.RefObject<Integer> p1, tangible.RefObject<Integer> p2, tangible.RefObject<Integer> p2m, tangible.RefObject<Integer> p2n)
	{
		int i;
		System.out.printf("%d", p1.argValue);
		for (i = 2;i <= p2m.argValue + p2n.argValue;i++)
		{
			System.out.printf(" %d",*(p1.argValue-1 + i));
		}
		System.out.print("\n");
	}
	/*Main*/
	public static void Main()
	{
	tangible.RefObject<Integer> tempRef_p1 = new tangible.RefObject<Integer>(p1);
	tangible.RefObject<Integer> tempRef_p2 = new tangible.RefObject<Integer>(p2);
	tangible.RefObject<Integer> tempRef_p2m = new tangible.RefObject<Integer>(p2m);
	tangible.RefObject<Integer> tempRef_p2n = new tangible.RefObject<Integer>(p2n);
		funcofa(tempRef_p1, tempRef_p2, tempRef_p2m, tempRef_p2n);
		p2n = tempRef_p2n.argValue;
		p2m = tempRef_p2m.argValue;
		p2 = tempRef_p2.argValue;
		p1 = tempRef_p1.argValue;
	tangible.RefObject<Integer> tempRef_p12 = new tangible.RefObject<Integer>(p1);
	tangible.RefObject<Integer> tempRef_p22 = new tangible.RefObject<Integer>(p2);
	tangible.RefObject<Integer> tempRef_p2m2 = new tangible.RefObject<Integer>(p2m);
	tangible.RefObject<Integer> tempRef_p2n2 = new tangible.RefObject<Integer>(p2n);
		funcofb(tempRef_p12, tempRef_p22, tempRef_p2m2, tempRef_p2n2);
		p2n = tempRef_p2n2.argValue;
		p2m = tempRef_p2m2.argValue;
		p2 = tempRef_p22.argValue;
		p1 = tempRef_p12.argValue;
	tangible.RefObject<Integer> tempRef_p13 = new tangible.RefObject<Integer>(p1);
	tangible.RefObject<Integer> tempRef_p23 = new tangible.RefObject<Integer>(p2);
	tangible.RefObject<Integer> tempRef_p2m3 = new tangible.RefObject<Integer>(p2m);
	tangible.RefObject<Integer> tempRef_p2n3 = new tangible.RefObject<Integer>(p2n);
		funcofc(tempRef_p13, tempRef_p23, tempRef_p2m3, tempRef_p2n3);
		p2n = tempRef_p2n3.argValue;
		p2m = tempRef_p2m3.argValue;
		p2 = tempRef_p23.argValue;
		p1 = tempRef_p13.argValue;
	tangible.RefObject<Integer> tempRef_p14 = new tangible.RefObject<Integer>(p1);
	tangible.RefObject<Integer> tempRef_p24 = new tangible.RefObject<Integer>(p2);
	tangible.RefObject<Integer> tempRef_p2m4 = new tangible.RefObject<Integer>(p2m);
	tangible.RefObject<Integer> tempRef_p2n4 = new tangible.RefObject<Integer>(p2n);
		funcofd(tempRef_p14, tempRef_p24, tempRef_p2m4, tempRef_p2n4);
		p2n = tempRef_p2n4.argValue;
		p2m = tempRef_p2m4.argValue;
		p2 = tempRef_p24.argValue;
		p1 = tempRef_p14.argValue;
	}
}

