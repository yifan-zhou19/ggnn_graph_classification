/*
 * dshw1.cpp
 *
 *  Created on: 2013-3-16
 *      Author: ibm
 */




public class Addlist
{
	public int n;
	public int[] element;
}

package <missing>;

public class GlobalMembers
{
	public static Addlist creatalist()
	{
		Addlist alist = new Addlist();
		if (alist != null)
		{
			alist.element = new int[MAXNUM];
			if (alist.element != null)
			{
				alist.n = 0;
				return alist;
			}
			else
			{
				delete(alist);
			}
		}
		return null;
	}

	public static Addlist creatblist()
	{
	Addlist blist = new Addlist();
		if (blist != null)
		{
			blist.element = new int[MAXNUM];
			if (blist.element != null)
			{
				blist.n = 0;
				return blist;
			}
			else
			{
				delete(blist);
			}
		}
	}


	public static int Main()
	{
		int i;
		int j;
		int k;
		int lena;
		int lenb;
		int len;
		int carry = 0;

	Addlist alist = creatalist();
	Addlist blist = creatblist();

	String achar = new String(new char[MAXNUM]);
	achar = ConsoleInput.readToWhiteSpace(true).charAt(0);
	//cout<<achar<<endl;
	lena = achar.length();
	//cout<<lena<<endl;

	String bchar = new String(new char[MAXNUM]);
	bchar = ConsoleInput.readToWhiteSpace(true).charAt(0);
	//cout<<bchar;
	lenb = bchar.length();
	//cout<<lenb<<endl;

	//if( (achar[0]-'0' ==0 )&& (bchar[0]-'0'==0))
	//{
		//cout<<"flag"<<endl;
	//	cout<<'0';
	//return 0;}
	for (i = 0; i < lena; i++)
	{
		alist.element[i] = achar.charAt(lena - i - 1) - '0';
		//cout<<i<<' '<<alist -> element[i] ;
	}
	for (i = lena; i < MAXNUM; i++)
	{
		alist.element[i] = 0;
		//cout<<i<<' '<<alist -> element[i] ;
	}
	for (j = 0; j < lenb; j++)
	{
		blist.element[j] = bchar.charAt(lenb - j - 1) - '0';
		//cout<<j<<' '<<blist -> element[j] ;
	}
	for (j = lenb; j < MAXNUM; j++)
	{
		blist.element[j] = 0;
		//cout<<j<<' '<<blist -> element[j] ;
	}
	//for (i=lena-1; i>=0; i--)
	//cout<<"a "<<alist->element[i]<<endl;
	//cout<<endl;
	//for (i=lenb-1; i>=0; i--)
	//cout<<"b "<<blist->element[i]<<endl;

		//int len;
		if (lena <= lenb)
		{
		len = lenb;
		}
		else
		{
			len = lena;
		}
		//cout<<"len "<<len<<endl;

	for (k = 0; k < len; k++)
	{
		alist.element[k] = alist.element[k] + blist.element[k] + carry;
		//cout<<k<<' '<<alist -> element[k]<<endl;
		if (alist.element[k] >= 10)
		{
			alist.element[k] -= 10;
			carry = 1;
		}
		else
		{
			carry = 0;
		}
		//cout<<k<<' '<<alist -> element[k]<<endl;
		//cout<<carry<<endl;
	}
	if (carry == 1)
	{
		alist.element[len] = 1;

	//for (i=lena; i>=0; i--)
	//{//cout<<"aaaa ";
	//cout<<alist->element[i];}
	//cout<<' '<<endl;
	//if (carry == 1)
	//{
		//cout<<"1";

		for (i = len; i >= 0; i--)
		{
			System.out.print(alist.element[i]);
		}
		return 0;
	}
	else
	{
		j = 0;
		for (i = len - 1; i >= 0; i--)
		{
			if (alist.element[i] == 0)
			{
				j++;
			}
			else
			{
				break;
			}
		}
		//cout<<"  "<<j<<endl;
			//else
		if (j != len)
		{
			for (k = len - 1 - j; k >= 0; k--)
			{
				//cout<<j<<endl;
				System.out.print(alist.element[k]);
			}
		}
		else
		{
			System.out.print("0");
			System.out.print("\n");
		}
			return 0;
	}
	}
		//else
		//	for (i=len-1; i>=0; i--)
		///	{
	//j = 0;
			//	if (alist -> element[i] = 0)
		///			j++;
		//		for( k=len-1-j; k>=0; k--)
		//	{
		//		cout<<alist -> element[k];
				//i--;
	//		}
		//		return 0;
		//	}

}

