//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *y,*m1,*m2;
		int y;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *m1;
		int m1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *m2;
		int m2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		y = (int)malloc(200 * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		m2 = (int)malloc(200 * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		m1 = (int)malloc(200 * (Integer.SIZE / Byte.SIZE));
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
							y + i = Integer.parseInt(tempVar2);
						}
						String tempVar3 = ConsoleInput.scanfRead(" ");
						if (tempVar3 != null)
						{
							m1 + i = Integer.parseInt(tempVar3);
						}
						String tempVar4 = ConsoleInput.scanfRead(" ");
						if (tempVar4 != null)
						{
							m2 + i = Integer.parseInt(tempVar4);
						}
		}
		void judge(int x,int y,int z);
		for (i = 0;i < n;i++)
		{
						if (i > 0)
						{
							   System.out.print("\n");
						}
						judge(*(y + i), *(m1 + i), *(m2 + i));
		}
		return 0;
	}

	public static void judge(int x,int y,int z)
	{
		 int i;
		 int j;
		 int a;
		 int p = int x;
		 int r = int x;
		 if ((x % 4 == 0 && x % 100 != 0) || x % 400 == 0)
		 {
										 i = r(y);
										 j = r(z);
		 }
		 else
		 {
			 i = p(y);
			 j = p(z);
		 }
		 if (i > j)
		 {
				a = (i - j) % 7;
		 }
		 else
		 {
			 a = (j - i) % 7;
		 }
		 if (a == 0)
		 {
				 System.out.print("YES");
		 }
		 else
		 {
			 System.out.print("NO");
		 }
	}

	public static int p(int x)
	{
		 int i;
		 switch (x)
		 {
				   case 1:
					   i = 0;
					   break;
				   case 2:
					   i = 31;
					   break;
				   case 3:
					   i = 59;
					   break;
				   case 4:
					   i = 90;
					   break;
				   case 5:
					   i = 120;
					   break;
				   case 6:
					   i = 151;
					   break;
				   case 7:
					   i = 181;
					   break;
				   case 8:
					   i = 212;
					   break;
				   case 9:
					   i = 243;
					   break;
				   case 10:
					   i = 273;
					   break;
				   case 11:
					   i = 304;
					   break;
				   case 12:
					   i = 334;
					   break;
		 }
		 return i;
	}

	public static int r(int x)
	{
		 int i;
		 switch (x)
		 {
				   case 1:
					   i = 0;
					   break;
				   case 2:

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


