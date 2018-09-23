package <missing>;

public class GlobalMembers
{
	/*
	 * ???.cpp
	 *
	 *  Created on: 2013-10-13
	 *      Author: Administrator
	 */
	public static int Main()
	{
		int cc1;
		int cc2;
		int cc3;
		int a;
		int b;
		int c;
		int A;
		int B;
		int C;
		String ans = new String(new char[4]);
		for (A = 1;A <= 3;A++)
		{
			for (B = 1;B <= 3;B++)
			{
				for (C = 1;C <= 3;C++)
				{
					if ((A == B) || (A == C) || (B == C))
					{
						continue;
					}
					a = (B > A) + (A == C);
					b = (A > B) + (A > C);
					c = (C > B) + (B > A);
					if ((A + a == 3) && (B + b == 3) && (C + c == 3))
					{
						//ans[A-1]='A',ans[B-1]='B',ans[C-1]='C';
						//cout<<ans;
						if ((A > B) && (B > C))
						{
							 System.out.print("CBA");
							 System.out.print("\n");
						}
						if ((A > C) && (C > B))
						{
							 System.out.print("BCA");
							 System.out.print("\n");
						}
						if ((B > A) && (A > C))
						{
							 System.out.print("CAB");
							 System.out.print("\n");
						}
						if ((B > C) && (C > A))
						{
							 System.out.print("ACB");
							 System.out.print("\n");
						}
						if ((C > A) && (A > B))
						{
							 System.out.print("BAC");
							 System.out.print("\n");
						}
						if ((C > B) && (B > A))
						{
							 System.out.print("ABC");
							 System.out.print("\n");
						}
					}
					/*cc1=(((B>A)&&(C!=A)&&(a=1))||((B<=A)&&(C==A)&&(a=1))||((B>A)&&(C==A)&&(a=2))||((B<=A)&&(C!=A)&&(a=0)));
					cc2=(((A>B)&&(A<=C)&&(b=1))||((A<=B)&&(A>C)&&(b=1))||((A>B)&&(A>C)&&(b=2))||((A<=B)&&(A<=C)&&(b=0)));
					cc3=(((C>B)&&(B<=A)&&(c=1))||((C<=B)&&(B>A)&&(c=1))||((C>B)&&(B>A)&&(c=2))||((B<=C)||(B<=A)&&(c=0)));
					if(A==1&&B==3&&C==2)
						 cout<<cc1<<" "<<cc2<<" "<<cc3<<" "<<endl<<a<<b<<c<<endl;
					if(cc1+cc2+cc3==3)
					{
						if((a==b)||(a==c)||(b==c)) continue;
						if(1==((A>B)&&(A>C)&&(B>C)))
						    cout<<"ABC"<<endl;
						if(1==((A>B)&&(A>C)&&(C>B)))
						    cout<<"ACB"<<endl;
						if(1==((B>A)&&(B>C)&&(A>C)))
							cout<<"BAC"<<endl;
						if(1==((B>A)&&(B>C)&&(C>A)))
							cout<<"BCA"<<endl;
						if(1==((C>A)&&(C>B)&&(A>B)))
							cout<<"CAB"<<endl;
						if(1==((C>A)&&(C>B)&&(B>A)))
							cout<<"CBA"<<endl;
	
					}*/
				}
			}
		}
		return 0;
	}
	/*
	3??????????????
	A??B??????C???????
	B??A??????A??C???
	C????B????B?A????
	?????????????????????
	???????????3??????
	????
	???
	????
	????????3???????
	ABC
	????
	?
	????
	?
	????
	*/

}
