//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

/*****************************************************************/
/* ????????                                              */
/*    ???c[i][j]??????????????????????  */
/* c[i][j]=(c[i-1][j]+j) mod i???i??????j??????? */
/* ?????????                                            */
/*    ??i?1?N???????O(n)                              */
/* ??????c[N][M]                                           */
/* ?? 2010-11-29                                               */
/*****************************************************************/


//????????

//?????????
public class inputandoutput
{
	public int n;
	public int m;
	public int king;
	public inputandoutput next;
}

//??????????
public class LinkIOHead
{
	public inputandoutput head;
	public inputandoutput tail;
	public int total;
}

package <missing>;

public class GlobalMembers
{
	//n�????m�??
	public static int n;
	public static int m;

	//????????
	public static int CheckInput(int num,int total)
	{
		if (num < 0)
		{
			return ISNOT_POSITIVEINT;
		}
		else if (num > total)
		{
			return ISMORETHAN_THREEHUNDRED;
		}
		else
		{
			return ISCORRECT;
		}
	}

	//???????
	public static int GetUserInput(tangible.RefObject<Integer> n, tangible.RefObject<Integer> m)
	{
		int checkresult = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n.argValue = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m.argValue = Integer.parseInt(tempVar2);
		}
		checkresult = CheckInput(n.argValue, 300);
		if (checkresult == ISNOT_POSITIVEINT)
		{

			System.out.print("error!\n");
		}
		else if (checkresult == ISMORETHAN_THREEHUNDRED)
		{

			System.out.print("error!\n");
		}
		else
		{
			checkresult = CheckInput(m.argValue, 300);
			if (checkresult == ISNOT_POSITIVEINT)
			{
				System.out.print("error!\n");
			}
			else if (checkresult == ISMORETHAN_THREEHUNDRED)
			{

				System.out.print("error!\n");
			}
			else
			{
				if (n.argValue == 0 && m.argValue == 0)
				{

				}
				else if (n.argValue == 0 || m.argValue == 0)
				{
					System.out.print("error!\n");
				}
				else
				{
					return 1;
				}
			}
		}
		return 0;
	}

	//??????n?m?????
	public static void InsertIntoLinkIO(LinkIOHead iohead, int n, int m)
	{
		inputandoutput p;
		p =  new inputandoutput();
		if (p == null)
		{
			System.out.print("error!");
			System.out.printf("error,n=%d,m=%d!\n",n,m);
			return;
		}
		p.n = n;
		p.m = m;
		p.king = 0;
		p.next = null;
		if (iohead.head == null && iohead.tail == null)
		{
			iohead.head = p;
			iohead.tail = p;
			iohead.total = 1;
		}
		else
		{
			iohead.tail.next = p;
			iohead.tail = p;
			iohead.total = iohead.total + 1;
		}
	}

	//????
	public static int GetKing(int kn, int km)
	{
		int king = 0;
		int i = 0;
		int j = 0;
		int kresult = 0;
		for (i = 2;i <= kn;i++)
		{
			kresult = (kresult + km) % i;
		}
		return kresult + 1;
	}

	//???
	public static int Main()
	{
		int inputresult = 0;
		int king = 0;
		LinkIOHead iohead;
		inputandoutput p;

		iohead = new LinkIOHead();
		if (iohead == null)
		{
			System.out.print("error!");
			return 0;
		}
		iohead.head = null;
		iohead.tail = null;
		iohead.total = 0;

	tangible.RefObject<Integer> tempRef_n = new tangible.RefObject<Integer>(n);
	tangible.RefObject<Integer> tempRef_m = new tangible.RefObject<Integer>(m);
		inputresult = GetUserInput(tempRef_n, tempRef_m);
		m = tempRef_m.argValue;
		n = tempRef_n.argValue;
		while (inputresult == 1)
		{
			InsertIntoLinkIO(iohead, n, m);
		tangible.RefObject<Integer> tempRef_n2 = new tangible.RefObject<Integer>(n);
		tangible.RefObject<Integer> tempRef_m2 = new tangible.RefObject<Integer>(m);
			inputresult = GetUserInput(tempRef_n2, tempRef_m2);
			m = tempRef_m2.argValue;
			n = tempRef_n2.argValue;
		}

		p = iohead.head;
		while (p != null)
		{
			king = GetKing(p.n, p.m);

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


