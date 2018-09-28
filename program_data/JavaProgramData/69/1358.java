//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

public class node //????  PHEADER???????
{
	   public int value;
	   public node pNext;
}

package <missing>;

public class GlobalMembers
{
	public static void insertAt(node pHeader, char c, int n) //??N????????
	{
		 int i;
		 for (i = 1;i < n;i++)
		 {
						 pHeader = pHeader.pNext;
		 }
		 node ptemp = new node();
		 ptemp.pNext = pHeader.pNext;
		 pHeader.pNext = ptemp;
		 ptemp.value = c - '0';
	}
	public static int getAt(node pHeader, int n) //????????N??
	{
		int i;
		node ptemp;
		for (i = 0;i < n;i++)
		{
						 pHeader = pHeader.pNext;
		}
		return pHeader.value;
	}
	public static int compare(node pHeader1, int n1, node pHeader2, int n2) //?????????????????????1??????-1?????0
	{
		int i;
		int ans = 0;
		if (n1 > n2)
		{
			return 1;
		}
		else if (n1 < n2)
		{
			return -1;
		}
		else
		{
			for (i = 1;i <= n1;i++)
			{
							 if (getAt(pHeader1, i) > getAt(pHeader2, i))
							 {
										ans = 1;
										break;
							 }
							 else if (getAt(pHeader1, i) < getAt(pHeader2, i))
							 {
								  ans = -1;
								  break;
							 }
			}
			return ans;
		}
	}
	public static int Main()
	{
		  char c;
		  int n1;
		  int n2;
		  int n3;
		  int temp;
		  int i;
		  int jinwei;
		  int jiewei;
		  node pHeader1 = new node(); //?2?????,?3????????
		  node pHeader2 = new node();
		  node pHeader3 = new node();
		  pHeader1.pNext = null; //?????????NULL
		  pHeader2.pNext = null;
		  pHeader3.pNext = null;
		  n1 = 0; //?????????
		  for (;;)
		  {
				 String tempVar = ConsoleInput.scanfRead(null, 1);
				 if (tempVar != null)
				 {
					 c = tempVar.charAt(0);
				 }
				 if (c == '\n')
				 {
					 break; //????,????
				 }
				 else
				 {
					 n1++;
					 insertAt(pHeader1, c, n1); //????
				 }
		  }
		  n2 = 0; //?????????
		  for (;;)
		  {
				 String tempVar2 = ConsoleInput.scanfRead(null, 1);
				 if (tempVar2 != null)
				 {
					 c = tempVar2.charAt(0);
				 }
				 if (c == '\n')
				 {
					 break; //????,????
				 }
				 else
				 {
					 n2++;
					 insertAt(pHeader2, c, n2); //????
				 }
		  }
		  if ((getAt(pHeader1, 1) != '-'-'0') && (getAt(pHeader2, 1) != '-'-'0') || ((getAt(pHeader1, 1) == '-'-'0') && (getAt(pHeader2, 1) == '-'-'0'))) //??2????????????????
		  {
					   if ((getAt(pHeader1, 1) == '-'-'0') && (getAt(pHeader2, 1) == '-'-'0')) //??2???????????????????????2????????1????????????
					   {
								   pHeader1 = pHeader1.pNext;
								   pHeader2 = pHeader2.pNext;
								   n1--;
								   n2--;
								   System.out.print("-");
					   }
					   jinwei = 0; //?????????
					   n3 = 0; //???????
					   if (n1 >= n2) //????????????????
					   {
									for (i = 0;i < n2;i++) //?N2??
									{
											 temp = getAt(pHeader1, n1 - i) + getAt(pHeader2, n2 - i) + jinwei; //??????????
											 if (temp >= 10)
											 {
												 temp = temp - 10; //??10,?????????
												 jinwei = 1;
											 }
											 else
											 {
												 jinwei = 0;
											 }
											 n3++; //???????
											 insertAt(pHeader3, temp + '0', n3); //????????? ,???????????,????????????????
									}
									for (i = n2;i < n1;i++) //?N2?N1??
									{
											   temp = getAt(pHeader1, n1 - i) + jinwei;
											   if (temp >= 10)
											   {
												 temp = temp - 10;
												 jinwei = 1;
											   }
											   else
											   {
												   jinwei = 0;
											   }
											   n3++;
											   insertAt(pHeader3, temp + '0', n3);
									}
									if (jinwei == 1) //???????????????,?????????
									{
											 n3++;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


