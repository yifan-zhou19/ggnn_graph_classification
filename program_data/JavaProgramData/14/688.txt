//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

public class Student
{
	public int id;
	public int chinese;
	public int math;
}

package <missing>;

public class GlobalMembers
{
	public static void swap(tangible.RefObject<Integer> i, tangible.RefObject<Integer> j)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p=i,t=*i;
		int p = i.argValue;
		int t = i.argValue;
		p = j.argValue;
		p = j.argValue;
		p = t;
	}
	public static int Main()
	{
		void swap(int * i,int * j);
		int n;
		int i;
		int first;
		int second;
		int third;
		int one;
		int two;
		int three;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *f=&first,*s=&second,*t=&third,*on=&one,*tw=&two,*th=&three;
		int f = first;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *s=&second;
		int s = second;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *t=&third;
		int t = third;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *on=&one;
		int on = one;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *tw=&two;
		int tw = two;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *th=&three;
		int th = three;
		Student[] stu = tangible.Arrays.initializeWithDefaultStudentInstances(100000);
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
				stu[i].id = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].chinese = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].math = Integer.parseInt(tempVar4);
			}
			int total = stu[i].chinese + stu[i].math;
			int k;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *to=&total,*K=&k;
			int to = total;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *K=&k;
			int K = k;
			if (i == 0)
			{
				first = total;
				one = i;
			}
			else
			{
				if (i == 1)
				{
					if (total > first)
					{
					tangible.RefObject<Integer> tempRef_to = new tangible.RefObject<Integer>(to);
					tangible.RefObject<Integer> tempRef_f = new tangible.RefObject<Integer>(f);
						swap(tempRef_to, tempRef_f);
						f = tempRef_f.argValue;
						to = tempRef_to.argValue;
						second = total;
						k = i;
					tangible.RefObject<Integer> tempRef_K = new tangible.RefObject<Integer>(K);
					tangible.RefObject<Integer> tempRef_on = new tangible.RefObject<Integer>(on);
						swap(tempRef_K, tempRef_on);
						on = tempRef_on.argValue;
						K = tempRef_K.argValue;
						two = k;
					}
					else
					{
						second = total;
						two = i;
					}
				}
				else
				{
					if (i == 2)
					{
						if (total > first)
						{
						tangible.RefObject<Integer> tempRef_to2 = new tangible.RefObject<Integer>(to);
						tangible.RefObject<Integer> tempRef_f2 = new tangible.RefObject<Integer>(f);
							swap(tempRef_to2, tempRef_f2);
							f = tempRef_f2.argValue;
							to = tempRef_to2.argValue;
						tangible.RefObject<Integer> tempRef_to3 = new tangible.RefObject<Integer>(to);
						tangible.RefObject<Integer> tempRef_s = new tangible.RefObject<Integer>(s);
							swap(tempRef_to3, tempRef_s);
							s = tempRef_s.argValue;
							to = tempRef_to3.argValue;
							third = total;
							k = i;
						tangible.RefObject<Integer> tempRef_K2 = new tangible.RefObject<Integer>(K);
						tangible.RefObject<Integer> tempRef_on2 = new tangible.RefObject<Integer>(on);
							swap(tempRef_K2, tempRef_on2);
							on = tempRef_on2.argValue;
							K = tempRef_K2.argValue;
						tangible.RefObject<Integer> tempRef_K3 = new tangible.RefObject<Integer>(K);
						tangible.RefObject<Integer> tempRef_tw = new tangible.RefObject<Integer>(tw);
							swap(tempRef_K3, tempRef_tw);
							tw = tempRef_tw.argValue;
							K = tempRef_K3.argValue;
							three = k;
						}
						else
						{
							if (total > second && total <= first)
							{
							tangible.RefObject<Integer> tempRef_to4 = new tangible.RefObject<Integer>(to);
							tangible.RefObject<Integer> tempRef_s2 = new tangible.RefObject<Integer>(s);
								swap(tempRef_to4, tempRef_s2);
								s = tempRef_s2.argValue;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


