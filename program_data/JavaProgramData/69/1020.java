//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

public class num
{
	public int n;
	public num next;
	public num ahead;
}

package <missing>;

public class GlobalMembers
{
	public static num phead1; //????
	public static num phead2; //????
	public static num phead3; //????
	public static num p1;
	public static num p2;
	public static void create(num[] phead, int n) //???????????
	{
		int i = 0;
		p1 = new num();
		p1.n = 0;
		phead[0] = p2 = p1;
		phead.ahead = null;
		for (i = 0;i <= n - 2;i++)
		{
			p1 = new num();
			p1.n = 0;
			if (i == 0)
			{
				phead.next = p1;
				p1.ahead = phead;
			}
			else
			{
				p2.next = p1;
				p1.ahead = p2;
			}
			p2 = p1;
		}
		p2.next = null;
	}

	public static int Main()
	{
		String num1 = new String(new char[10000]);
		String num2 = new String(new char[10000]);
		//printf("Please input the first integer\n");
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num1 = tempVar.charAt(0);
		}
		//printf("Please input the next integer\n");
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			num2 = tempVar2.charAt(0);
		}
		int i1 = 0;
		int i2 = 0;
		int max;
		while (num1.charAt(i1) != '\0')
		{
			i1++;
		}
		while (num2.charAt(i2) != '\0')
		{
			i2++;
		}
		if (i1 >= i2)
		{
			max = i1;
		}
		else
		{
			max = i2;
		} //????????????????
		create(phead1, max); //?????????max?max?max+1???
		create(phead2, max);
		create(phead3, max + 1);
		num ptemp1 = phead1;
		num ptemp2 = phead2;
		int i3;
		for (i3 = i1 - 1;i3 >= 0;i3--)
		{
			ptemp1.n = num1.charAt(i3) - '0';
			ptemp1 = ptemp1.next;
		}
		int i4;
		for (i4 = i2 - 1;i4 >= 0;i4--)
		{
			ptemp2.n = num2.charAt(i4) - '0';
			ptemp2 = ptemp2.next;
		} //????????????
		num ptemp3 = phead1;
		num ptemp4 = phead2;
		num ptemp5 = phead3;
		while (ptemp3 != null)
		{
			if (((ptemp3.n) + (ptemp4.n) + (ptemp5.n)) >= 10)
			{
				 ptemp5.n = ptemp5.n + ((ptemp3.n) + (ptemp4.n)) - 10;
				 ptemp3 = ptemp3.next;
				 ptemp4 = ptemp4.next;
				 ptemp5 = ptemp5.next;
				 ptemp5.n = (ptemp5.n) + 1;
			}
			else
			{
				ptemp5.n = ptemp5.n + (ptemp3.n) + (ptemp4.n);
				ptemp3 = ptemp3.next;
				ptemp4 = ptemp4.next;
				ptemp5 = ptemp5.next;
			}
		} //???????????????????????
		num ptemp7 = phead3;
		while (ptemp7.next != null)
		{
			ptemp7 = ptemp7.next;
		}
		//printf("the answer is:\n");
		if (ptemp7.n == 0)
		{
			ptemp7 = ptemp7.ahead;
			if (ptemp7.ahead == null)
			{
				System.out.print("0");
				return 0;
			}
			else
			{
				while (ptemp7.n == 0)
				{
					ptemp7 = ptemp7.ahead;
				}
				while (ptemp7 != null)
				{
					System.out.printf("%d",ptemp7.n);
					ptemp7 = ptemp7.ahead;
				}
			}
		}
		else
		{
			while (ptemp7 != null)
			{
				System.out.printf("%d",ptemp7.n);
				ptemp7 = ptemp7.ahead;
			}
		}
		num release1 = phead1; //???????free???
		num release2 = phead2;
		num release3 = phead3;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


