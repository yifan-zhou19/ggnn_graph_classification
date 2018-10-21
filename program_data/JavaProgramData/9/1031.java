//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

public class ill
{
	   public String num = new String(new char[20]);
	   public int age;
	   public int turn;
	   public ill next;
}

package <missing>;

public class GlobalMembers
{
	public static void run(ill head, int age, int turn, tangible.RefObject<String> num)
	{
		 ill pre;
		 ill p;
		 ill s;
		 s = new ill();
		 pre = head;
		 p = pre.next;
		 s.num = num.argValue;
		 s.turn = turn;
		 s.age = age;
		 //s->next=NULL;
		 for (;p != null;)
		 {
					   pre = p;
					   p = p.next;
		 }
		 pre.next = s;
		 s.next = p;
	}


	public static int Main()
	{
		int i;
		int j;
		int k;
		int age;
		int turn;
		int m;
		int n;
		String num;
		void run(struct ill * head,int age,int turn,char * num);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		num = (String)malloc(20 * (Character.SIZE / Byte.SIZE));
		ill head;
		ill p;
		ill s;
		ill pre;
		head = new ill();
		head.next = null;
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
							num = tempVar2.charAt(0);
						}
						String tempVar3 = ConsoleInput.scanfRead(" ");
						if (tempVar3 != null)
						{
							age = Integer.parseInt(tempVar3);
						}
						turn = i;
					tangible.RefObject<String> tempRef_num = new tangible.RefObject<String>(num);
						run(head, age, turn, tempRef_num);
						num = tempRef_num.argValue;
		}
		k = 0;
		for (p = head.next;p != null;p = p.next)
		{
										   if (p.age >= 60)
										   {
													   k++;
										   }
		}
		//printf("%d\n",k);
		p = head.next;
		m = 100;
		if (k == 0)
		{
				for (i = 0;i < n;i++)
				{
								p = head.next;
								for (;p != null;)
								{
											  if (p.turn == i)
											  {
															System.out.println(p.num);
															//printf("%s %d %d\n",p->num,p->age,p->turn);
															break;
											  }
								}
				}
		}
		else if (k == n)
		{
			 for (i = 0;i < n;i++)
			 {
							 p = head.next;
							 m = 0;
							 j = 100;
							 for (;p != null;)
							 {
										   if (p.age > m)
										   {
													   m = p.age;
													   j = p.turn;
										   }
										   else if (p.age == m)
										   {
												if (p.turn < j)
												{
															 m = p.age;
															 j = p.turn;
												}
										   }
										   p = p.next;
							 }
							 pre = head;
							 p = head.next;
							 for (;p != null;)
							 {
										   if ((p.age == m) && (p.turn == j))
										   {
																		System.out.println(p.num);
																		//printf("%s %d %d\n",p->num,p->age,p->turn);
																		pre.next = p.next;
																		break;
										   }
										   else
										   {
											   pre = p;
											   p = p.next;
										   }
							 }
			 }
		}
		else
		{
				 for (i = 0;i < k;i++)
				 {
							 p = head.next;
							 m = 0;
							 j = 100;
							 for (;p != null;)
							 {
										   if (p.age > m)
										   {
													   m = p.age;
													   j = p.turn;
										   }
										   else if (p.age == m)
										   {

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


