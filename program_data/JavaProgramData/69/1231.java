//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

public class integer //??????
{
	   public int n;
	   public integer pup;
	   public integer pdown;
}

package <missing>;

public class GlobalMembers
{
	public static integer creat(integer head) //????
	{
		   head = new integer();
		   head.pup = null;
		   head.pdown = null;
		   return head;
	}
	public static int Main()
	{
		  char a;
		  int x = 1; //?x,y,z??????
		  int y = 1;
		  int z = 1;
		  integer p1;
		  integer p2;
		  integer p3;
		  integer head;
		  head = p1 = p2 = new integer();
		  p1 = null;
		  creat(head);
		  String tempVar = ConsoleInput.scanfRead(null, 1);
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }
		  while (0 <= (a - '0') && (a - '0') <= 9 || a == '-')
		  {
											   p3 = new integer();
											   if (a == '-')
											   {
														 x = -1; //???????
														 String tempVar2 = ConsoleInput.scanfRead(null, 1);
														 if (tempVar2 != null)
														 {
															 a = tempVar2.charAt(0);
														 }
														 continue;
											   }
											   else
											   {
												   p3.n = x * (a - '0'); //????????????
												   p3.pdown = p1;
												   p3.pup = head; //???????????????
												   if (p1 != null)
												   {
												   p1.pup = p3;
												   }
												   head.pdown = p3;
												   p1 = p3;
												   String tempVar3 = ConsoleInput.scanfRead(null, 1);
												   if (tempVar3 != null)
												   {
													   a = tempVar3.charAt(0);
												   }
											   }
		  }
		  p1 = null;
		  String tempVar4 = ConsoleInput.scanfRead(null, 1);
		  if (tempVar4 != null)
		  {
			  a = tempVar4.charAt(0);
		  }
		  while (0 <= (a - '0') && (a - '0') <= 9 || a == '-')
		  {
											   p3 = new integer();
											   if (a == '-')
											   {
														 y = -1;
														 String tempVar5 = ConsoleInput.scanfRead(null, 1);
														 if (tempVar5 != null)
														 {
															 a = tempVar5.charAt(0);
														 }
														 continue;
											   }
											   else
											   {
												   p3.n = y * (a - '0');
												   p3.pup = p1;
												   p3.pdown = head;
												   head.pup = p3;
												   if (p1 != null)
												   {
												   p1.pdown = p3;
												   }
												   p1 = p3;
												   String tempVar6 = ConsoleInput.scanfRead(null, 1);
												   if (tempVar6 != null)
												   {
													   a = tempVar6.charAt(0);
												   }
											   }
		  }
		  p1 = p2 = head;
		  while (p1.pdown != null && p2.pup != null) //????????
		  {
												 p1 = p1.pdown;
												 p2 = p2.pup;
												 p1.n = p1.n + p2.n;
												 p2.n = p1.n; //?????????????
		  }
		  if (p1.pdown == null && p2.pup != null) //???????????????????????????
		  {
											 p2 = head.pup;
											  while (p2.pup != null)
											  {
																   if (p2.n > 9) //??
																   {
																			  p2.pup.n++;
																			  p2.n = p2.n % 10;
																   }
																   if (p2.n < 0) //??
																   {
																			  p2.pup.n--;
																			  p2.n = p2.n + 10;
																   }
											  p2 = p2.pup;
											  }
											  if (y < 0)
											  {
											  System.out.print("-"); //????????????????????????y????
											  }
											  while (p2.n == 0 && p2 != head.pup) //???????0???????????0
											  {
											  p2 = p2.pdown;
											  }
											  while (p2 != head)
											  {
															System.out.printf("%d",y * (p2.n));
															p2 = p2.pdown;
											  }
											  while (p1 != null) //free?????
											  {
															 p2 = p1;
															 p1 = p1.pup;
															 p2 = null;
											  }
		  }
		  else
		  {
			  p1 = head;
			  while (p1.pdown != null) //?????????????????
			  {
									 p1 = p1.pdown;
									 if (p1.n >= 10 && p1.pdown != null)
									 {

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


