package <missing>;

public class GlobalMembers
{
	/*
	?? - ????????????????????????   
	 
	?? 
	???????????????????????? 
	a)  ??????????????????? 
	b)  ??????????? 
	c)  ?????????? 
	d)  ????????? 
	?????????????????????????? 
	
	 
	???? 
	???? 
	??????? ??????????? 
	???????? 
	????????
	 
	???? 
	?????????????????????????????????? 
	????????????????????? 
	??????????
	 
	???? 
	4 5
	2 3 4 1
	3 4 5 1 2
	 
	???? 
	1 2 3 4 1 2 3 4 5
	 
	?? 
	??????????????? 
	???????????????? 
	*/

	public static void Main()
	{
		void shuru(int * p,int len);
		void paixu(int * p,int len);
		void hebing(int * p1,int * p2);
		void shuchu(int * p,int,int);
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1,*p2;
		int p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2;
		int p2;
		int[] a = {'\0', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] b = {'\0', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		p1 = a;
		p2 = b;
	tangible.RefObject<Integer> tempRef_p1 = new tangible.RefObject<Integer>(p1);
		shuru(tempRef_p1, m);
		p1 = tempRef_p1.argValue;
	tangible.RefObject<Integer> tempRef_p2 = new tangible.RefObject<Integer>(p2);
		shuru(tempRef_p2, n);
		p2 = tempRef_p2.argValue;
	tangible.RefObject<Integer> tempRef_p12 = new tangible.RefObject<Integer>(p1);
		paixu(tempRef_p12, m);
		p1 = tempRef_p12.argValue;
	tangible.RefObject<Integer> tempRef_p22 = new tangible.RefObject<Integer>(p2);
		paixu(tempRef_p22, n);
		p2 = tempRef_p22.argValue;
	tangible.RefObject<Integer> tempRef_p13 = new tangible.RefObject<Integer>(p1);
	tangible.RefObject<Integer> tempRef_p23 = new tangible.RefObject<Integer>(p2);
		hebing(tempRef_p13, tempRef_p23);
		p2 = tempRef_p23.argValue;
		p1 = tempRef_p13.argValue;
	tangible.RefObject<Integer> tempRef_p14 = new tangible.RefObject<Integer>(p1);
		shuchu(tempRef_p14, m, n);
		p1 = tempRef_p14.argValue;
	}



	public static void shuru(tangible.RefObject<Integer> p, int len)
	{
		int i;
		for (i = 0;i < len;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p.argValue + i = Integer.parseInt(tempVar);
			}
		}
	}

	public static void paixu(tangible.RefObject<Integer> p, int len)
	{
		int i;
		int j;
		int temp;
		for (i = 0;i < len - 1;i++)
		{
			for (j = i + 1;j < len;j++)
			{
				if (*(p.argValue + i) > *(p.argValue + j))
				{
					temp = (p.argValue + i);
					*(p.argValue + i) = *(p.argValue + j);
					*(p.argValue + j) = temp;
				}
			}
		}
	}

	public static void hebing(tangible.RefObject<Integer> p1, tangible.RefObject<Integer> p2)
	{
		int i;
		int j;
		int flag;
		for (i = 0;;i++)
		{
			flag = 0;
			if (*(p1.argValue + i) == '\0')
			{
				for (j = 0; * (p2.argValue + j) != '\0';j++)
				{
					*(p1.argValue + i + j) = *(p2.argValue + j);
				}
				*(p1.argValue + i + j) = '\0';
				flag = 1;
			}
			if (flag == 1)
			{
				break;
			}
		}
	}

	public static void shuchu(tangible.RefObject<Integer> p, int m, int n)
	{
		int i;
		char c;
		for (i = 0; * (p.argValue + i) != '\0';i++)
		{
			System.out.printf("%d%c",*(p.argValue + i),c = (i < n + m - 1)?' ':'\n');
		}
	}

}

