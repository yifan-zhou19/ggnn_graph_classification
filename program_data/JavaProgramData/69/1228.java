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
		  int x = 1; //k?m?l???????
		  int y = 1;
		  int l = 1;
		  integer p;
		  integer q;
		  integer p1;
		  integer head;
		  head = p = q = new integer();
		  p = null;
		  creat(head);
		  String tempVar = ConsoleInput.scanfRead(null, 1);
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }
		  while (0 <= (a - '0') && (a - '0') <= 9 || a == '-')
		  {
											   p1 = new integer();
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
												   p1.n = x * (a - '0'); //????????????
												   p1.pdown = p;
												   p1.pup = head; //???????????????
												   if (p != null)
												   {
												   p.pup = p1;
												   }
												   head.pdown = p1;
												   p = p1;
												   String tempVar3 = ConsoleInput.scanfRead(null, 1);
												   if (tempVar3 != null)
												   {
													   a = tempVar3.charAt(0);
												   }
											   }
		  }
		  p = null;
		  String tempVar4 = ConsoleInput.scanfRead(null, 1);
		  if (tempVar4 != null)
		  {
			  a = tempVar4.charAt(0);
		  }
		  while (0 <= (a - '0') && (a - '0') <= 9 || a == '-')
		  {
											   p1 = new integer();
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
												   p1.n = y * (a - '0');
												   p1.pup = p;
												   p1.pdown = head;
												   head.pup = p1;
												   if (p != null)
												   {
												   p.pdown = p1;
												   }
												   p = p1;
												   String tempVar6 = ConsoleInput.scanfRead(null, 1);
												   if (tempVar6 != null)
												   {
													   a = tempVar6.charAt(0);
												   }
											   }
		  }
		  p = q = head;
		  while (p.pdown != null && q.pup != null) //????????
		  {
												 p = p.pdown;
												 q = q.pup;
												 p.n = p.n + q.n;
												 q.n = p.n; //?????????????
		  }
		  if (p.pdown == null && q.pup != null) //???????????????????????????
		  {
											  q = head.pup;
											  while (q.pup != null)
											  {
																   if (q.n > 9) //??
																   {
																			  q.pup.n++;
																			  q.n = q.n % 10;
																   }
																   if (q.n < 0) //??
																   {
																			  q.pup.n--;
																			  q.n = q.n + 10;
																   }
											  q = q.pup;
											  }
											  if (y < 0)
											  {
											  System.out.print("-"); //????????????????????????m????
											  }
											  while (q.n == 0 && q != head.pup) //???????0???????????0
											  {
											  q = q.pdown;
											  }
											  while (q != head)
											  {
															System.out.printf("%d",y * (q.n));
															q = q.pdown;
											  }
											  while (p != null) //free?????
											  {
															 q = p;
															 p = p.pup;
															 q = null;
											  }
		  }
		  else
		  {
			  p = head;
			  while (p.pdown != null) //?????????????????
			  {
									 p = p.pdown;
									 if (p.n >= 10 && p.pdown != null)
									 {

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


